package Team5.SmartTownsOld;

import Team5.SmartTowns.rewards.RewardsRepository;
import Team5.SmartTowns.users.NewUser;
import Team5.SmartTowns.users.User;
import Team5.SmartTowns.users.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.*;

@SpringBootTest
public class testUsers {


    @Autowired
    UserRepository userRepository;
    @Autowired
    RewardsRepository rewardsRepository;

    @Test
    public void getAllUsersTest(){ // test if we can get all users, admin is sa known user
        List<User> users = userRepository.getAllUsers();
        User user = new User("Admin","Admin");
        Assertions.assertEquals("Admin", users.get(0).getName());
    }

    @Test // test if new users can be added
    public void addAUserTest(){
        int userNumberBeforeAdd = userRepository.getAllUsers().size();
        NewUser newuser = new NewUser("Meow","Woof","Cat@Dogs.com");
        boolean trueIfAdded= userRepository.addUser(newuser.getName(), newuser.getEmail(), newuser.getPassword());
        int userNumberAfterAdd = userRepository.getAllUsers().size();
        assertTrue(trueIfAdded);
    }

    @Test // test if new users and inserted users can be found
    public void doesUserExistTest(){
        Boolean insertedUserFoundByEmail = userRepository.doesUserExist("Kevin@Gmail.com");
        NewUser newuser = new NewUser("MeowMeow","WoofMeow","CatMeow@Dogs.com");
        Boolean newUser = userRepository.addUser(newuser.getName(), newuser.getEmail(), newuser.getPassword());
        Boolean newUserFoundByEmail = userRepository.doesUserExist(newuser.getEmail());
        int compareTwoSearches = Boolean.compare(insertedUserFoundByEmail, newUserFoundByEmail);
        assertEquals(0,compareTwoSearches); // if 0, both values are the same


    }

    @Test
    public void canUsersUnlockStickersTest(){
        NewUser newuser = new NewUser("MeowMeowMeow","WoofMeowMeow","CatMeowMeow@Dogs.com");
        Boolean newUser = userRepository.addUser(newuser.getName(), newuser.getEmail(), newuser.getPassword());
        Boolean doesStickerUnlock = userRepository.unlockSticker(newuser.getName(),2,2);
        System.out.println(doesStickerUnlock);
        assertTrue(doesStickerUnlock);
    }
    @Test
    public void canUsersUnlockStickersAndViewThemTest(){
        NewUser newuser = new NewUser("MeowMeowMeowMeow","WoofMeowMeowMeow","CatMeowMeowMeow@Dogs.com");
        NewUser newuserTwo = new NewUser("Jumper","Baa","Sheep@Wool.com");
        Boolean newUser = userRepository.addUser(newuser.getName(), newuser.getEmail(), newuser.getPassword());
        Boolean newUserTwo = userRepository.addUser(newuserTwo.getName(), newuserTwo.getEmail(), newuserTwo.getPassword());
        Boolean doesStickerUnlock = userRepository.unlockSticker(newuser.getName(),1,2);
        List<Long>  newUserStickerCollection = userRepository.getUserStickersFromPack(newuser.getName(),1);
        List<Long>  newUserStickerCollectionTwo = userRepository.getUserStickersFromPack(newuserTwo.getName(),1); // compare and see if only new suer that has unlocked a sticker ahs one in their collection for pack 1
        int newUserStickerList = newUserStickerCollection.size();
        int newUserStickerListTwo = newUserStickerCollectionTwo.size(); // should have different sizes
        assertNotSame(newUserStickerList,newUserStickerListTwo);

    }


}
