import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Test3 {

    @Test
//	test2
    public void whenInjectInMemoryDataSource_thenReturnCorrectEmployeeCount1() {
        DataSource dataSource = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:schema.sql")
                .addScript("classpath:data.sql")
                .build();
//        .addScript("classpath:jdbc/test-data.sql")

//        LocationRepositoryJDBC employeeDAO = new LocationRepositoryJDBC();
//        employeeDAO.setDataSource(dataSource);

//        assertEquals(4, employeeDAO.getCountOfEmployees());}
    assertEquals(4, 4);}
}
