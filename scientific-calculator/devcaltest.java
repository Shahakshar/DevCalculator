import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class devcaltest {
    
    @Test
    void testAddition() {
        assertEquals(5, devcal.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, devcal.subtract(3, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, devcal.multiply(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, devcal.divide(6, 3));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            devcal.divide(6, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

