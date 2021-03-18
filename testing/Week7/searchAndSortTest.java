package Week7;

import org.junit.jupiter.api.Test;
import week4.MyArrays;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class searchAndSortTest {
    @Test
    void linearSearchTest(){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] input = {1,5,10};
        for (int j : input) {
            assertEquals(j - 1, MyArrays.linearSearch(array, j));
        }
    }

    @Test
    void binarySearchTest(){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] input = {1,5,10};
        for (int j : input) {
            assertEquals(j - 1, MyArrays.binarySearch(array, j));
        }
    }

    @Test
    void sortSelectionSortTest(){
        int[] array = {5,2,3,8,1,6,4,9,10,7};
        int[] expected = {1,2,3,4,5,6,7,8,9,10};
        MyArrays.selectionSort(array);
        assertEquals(Arrays.toString(expected),Arrays.toString(array));
    }

    @Test
    void insertionSortTest(){
        int[] array = {5,2,3,8,1,6,4,9,10,7};
        int[] expected = {1,2,3,4,5,6,7,8,9,10};
        MyArrays.insertionSort(array);
        assertEquals(Arrays.toString(expected), Arrays.toString(array));
    }
}
