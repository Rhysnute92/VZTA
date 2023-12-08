package Team5.SmartTowns;

import Team5.SmartTowns.Data.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.NestedRuntimeException;
//import org.springframework.dao.DataAccessException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.commons.util.Preconditions;
import org.apache.commons.logging.LogFactory;
@SpringBootTest
public class CalculatorTest {
//    String asd= getLegacyReportingName("das");

    private static Calculator calculator;

    @BeforeAll
    public static void before() {
        calculator = new Calculator();
    }

    @Test
    public void whenDivideNumbersThenReturnDivision() {

        assertEquals(2, calculator.divide(4, 2));
    }

    @Test
    public void whenDivideByZeroThenThrowException() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }
    @Test
    public void whenAddingThingsThenAdd(){
        assertEquals(10,calculator.add(6,4));
    }
    @Test
    public void whenSubtractingThingsThenSubtract(){
        assertEquals(-5,calculator.subtract(5,10));
    }

    @Test
    public void whenMultiplyingThingsThenMultiply(){
        assertEquals(-60,calculator.multiply(-3,20));
    }




}
