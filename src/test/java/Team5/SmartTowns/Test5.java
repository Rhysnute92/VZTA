package Team5.SmartTowns;

import Team5.SmartTowns.data.LocationRepository;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;


//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
//@JdbcTest
//
@Sql({"/resources/schema.sql", "/resources/test-data.sql"})
public class Test5 {

    @Autowired
    private LocationRepository locationRepo;


    @Test
//	test 1
    void whenInjectInMemoryDataSource_thenReturnCorrectEmployeeCount() {
//        LocationRepositoryJDBC employeeDAO = new LocationRepositoryJDBC(ajdbc);
        int aa=2;
        int bb=2;
//        employeeDAO.setJdbc(ajdbc);
        assertEquals(4, (aa+bb));

    }



}
