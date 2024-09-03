import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UnitTest {
    @Test
    public void testAdd(){
        assertEquals("10", Calculator.add("1", "3"));
        assertEquals("12", Calculator.add("11", "1"));
    }

    @Test
    public void testSubtract(){
        assertEquals("3", Calculator.subtract("10", "1"));
        assertEquals("12", Calculator.subtract("20", "2"));
    }

    @Test
    public void testMultiply(){
        assertEquals("10", Calculator.multiply("2", "2"));
        assertEquals("12", Calculator.multiply("3", "2"));
    }

    @Test
    public void testDivide(){

    }
}
