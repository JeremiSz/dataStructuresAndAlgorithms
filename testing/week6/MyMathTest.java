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

    @Test
    void myPow() {
        double expected = Math.pow(2,4);
        double actual = MyMath.myPow(2,4);
        assertEquals(expected,actual);
    }

    @Test
    void reverse() {
        String expected = "olleh";
        String result = MyMath.reverse("hello");
        assertEquals(expected,result);
    }
}