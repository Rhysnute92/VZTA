//package Team5.SmartTowns;
//
//import Team5.SmartTowns.Data.locationRepositoryJDBC;
//import org.junit.jupiter.api.Test;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
//
//import javax.sql.DataSource;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class Test3 {
//
//    @Test
////	test2
//    public void whenInjectInMemoryDataSource_thenReturnCorrectEmployeeCount1() {
//        DataSource dataSource = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
//                .addScript("classpath:jdbc/schema.sql")
//                .addScript("classpath:jdbc/test-data.sql")
//                .build();
//
//        locationRepositoryJDBC employeeDAO = new locationRepositoryJDBC();
//        employeeDAO.setDataSource(dataSource);
//
//        assertEquals(4, employeeDAO.getCountOfEmployees());}
//}
