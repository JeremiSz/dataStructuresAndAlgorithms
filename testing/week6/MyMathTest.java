package week6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void factorial() {
        int expected = 1;
        int result = MyMath.factorial(1);
        assertEquals(expected,result);
        expected = 6;
        result = MyMath.factorial(3);
        assertEquals(expected,result);
        expected = 1;
        result = MyMath.factorial(0);
        assertEquals(expected,result);
    }
}