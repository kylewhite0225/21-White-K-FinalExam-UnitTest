import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    public final void negativeThrowException() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.add("-1, 2, 3");
        });
        assertTrue(e.getMessage().contains("Cannot contain negative numbers."));
    }

    @Test
    public final void ignoreOver1000() {
        int expected = 10;
        int actual = StringCalculator.add("10, 1001");
        assertEquals(expected, actual);
    }

//    @Test
//    public final void testStringCalc() {
//        int expected = 10;
//        int actual = StringCalculator.add("3, 7");
//        assertEquals(expected, actual);
//    }
}
