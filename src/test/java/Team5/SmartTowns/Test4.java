package Team5.SmartTowns;

import Team5.SmartTowns.Data.locationRepositoryJDBC;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test4 {
    @Mock
    JdbcTemplate jdbcTemplate;
    @Test

    public void whenMockJdbcTemplate_thenReturnCorrectEmployeeCount() {
        locationRepositoryJDBC employeeDAO = new locationRepositoryJDBC();
        ReflectionTestUtils.setField(employeeDAO, "jdbcTemplate", jdbcTemplate);
        Mockito.when(jdbcTemplate.queryForObject("SELECT COUNT(*) FROM locations", Integer.class))
                .thenReturn(4);

        assertEquals(4, employeeDAO.getCountOfEmployees());
    }
}
