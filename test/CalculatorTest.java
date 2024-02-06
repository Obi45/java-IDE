import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
   public void testcalculatorThatCanAdd() {
        int output = 10;
        assertEquals(10,  calculator.calculatorThatAdd(6,4));
    }
    @Test
    public void testCalculatorthatSubstract(){
        int out = 4;
        assertEquals(4, calculator.calculatorthatSubstract(6,2));
    }
    @Test
    public void testCalculatorThatCanMultiply(){
        int output = 8;
        assertEquals(8, calculator.calaculatorThatMultiply(4,2));
    }
    @Test
    public void testThatCanDivide(){
        int out = 3;
        assertEquals(3, calculator.calculatorthatDivides(6,2));
    }

    }

