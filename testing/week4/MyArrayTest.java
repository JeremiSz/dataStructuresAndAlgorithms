package week4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyArrayTest {
    @Test
    void testAddingBeyondLimit(){
        int[] array = {};
        assertEquals(0,MyArrays.insert(array,0,3,4));
    }
    @Test
    void testPositionBeyondLimits(){
        int[] array = {1,2};
        assertEquals(2,MyArrays.insert(array,2,5,4));
    }

    @Test
    void testInserting(){
        int[] array = {1,3,4,0,0,0};
        assertEquals(4,MyArrays.insert(array,3,1,99));
        assertEquals(99,array[1]);
    }

    @Test
    void testRemovingBeyondLimit(){
        int[] array = {};
        assertEquals(-1,MyArrays.remove(array,0,3));
    }
    @Test
    void testRemovingPositionBeyondLimits(){
        int[] array = {1,2};
        assertEquals(-1,MyArrays.remove(array,2,0));
    }

    @Test
    void testRemoving() {
        int[] array = {1, 3, 4, 0, 0, 0};
        assertEquals(2, MyArrays.remove(array, 3, 1));
        assertEquals(3, array[1]);
    }
}
