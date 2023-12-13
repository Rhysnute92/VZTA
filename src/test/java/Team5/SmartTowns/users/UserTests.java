package Team5.SmartTowns.users;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
class UserTests {

    @Autowired
    UserRepository userRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @BeforeEach
    public void resetUserTable(){
        /*Deletes table as each test creates the table it needs for its own testing*/
        jdbcTemplate.update("DELETE FROM users");
    }

    @Test
    @DisplayName("Add User to Database")
    void testAddUser() {
        String testEmail = "TestEmail";
        String testPassword = "Password";
        String testUsername = "TestUsername";

        userRepository.addUser(testUsername, testEmail, testPassword);

        String email = jdbcTemplate.queryForObject("SELECT email FROM users WHERE username=?", String.class, testUsername);
        String password = jdbcTemplate.queryForObject("SELECT password FROM users WHERE username=?", String.class, testUsername);

        assertEquals(testPassword, password);
        assertEquals(testEmail, email);

    }

    @Test
    @DisplayName("Get all from Users")
    void testGetAllUsers() {
        jdbcTemplate.update("INSERT INTO users (username, password) VALUE ('TestUser1', 'admin')");
        jdbcTemplate.update("INSERT INTO users (username, password) VALUE ('TestUser2', 'admin')");
        jdbcTemplate.update("INSERT INTO users (username, password) VALUE ('TestUser3', 'admin')");

        List<String> queryList = jdbcTemplate.queryForList("SELECT username FROM users", String.class);
        List<User> users = userRepository.getAllUsers();

        assertEquals(queryList.size(), users.size());
    }


    @Test
    @DisplayName("Find if user exists")
    void doesUserExist() {
        jdbcTemplate.update("INSERT INTO users (username, email, password) VALUE ('UserExists', 'email@test.com', 'test')" );
        assertTrue( userRepository.doesUserExist("email@test.com") );
    }

    @Test
    @DisplayName("Find user by email")
    void findUserByEmail() {
        String email = "email@test.com";
        jdbcTemplate.update("INSERT INTO users (username, email, password) VALUE ('UserExists', ?, 'test')",
                email);
        User user = userRepository.findUserByEmail(email);
        assertEquals(email, user.getEmail());
    }

    @Test
    @DisplayName("Find user by name")
    void findUserByName() {
        String name = "TestUser";
        jdbcTemplate.update("INSERT INTO users (username, password) VALUE (?, 'test')",
                name);
        User user = userRepository.findUserByName(name);
        assertEquals(name, user.getName());
    }
}