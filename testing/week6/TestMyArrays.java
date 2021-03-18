package week6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestMyArrays {
    @Test
    void arrayTest() {
        int expected = 10;
        int[] values = new int[]{1,3,2,4};
        assertEquals(expected,MyMath.sum(values));

        expected = 100;
        values = new int[]{-10,110,0};
        assertEquals(expected,MyMath.sum(values));
    }
}
