package Week7;

import org.junit.jupiter.api.Test;
import week4.MyArrays;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class searchAndSortTest {
    int[] longArray;
   /* @Test
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

    @Test
    void mergeSortTest(){
        int[] array = {5,2,3,8,1,6,4,9,10,7};
        int[] expected = {1,2,3,4,5,6,7,8,9,10};
        MyArrays.mergeSort(array);
        assertEquals(Arrays.toString(expected),Arrays.toString(array));
    }*/

    void setupArray(){
        longArray = new int[100000];
        Random random = new Random();
        for (int i = 0; i < longArray.length; i++) {
            longArray[i] = random.nextInt(Integer.MAX_VALUE);
        }
    }
    @Test
    void selectionSpeedTest(){
        setupArray();
        MyArrays.selectionSort(longArray);
    }
    @Test
    void insertionSpeedTest(){
        setupArray();
        MyArrays.insertionSort(longArray);
    }
    @Test
    void mergeSpeedTest(){
        setupArray();
        MyArrays.mergeSort(longArray);
    }
    @Test
    void nativeSpeedTest(){
        setupArray();
        Arrays.sort(longArray);
    }
    //Size of array = 1000
    //type      time
    //Native    10ms
    //selection 4ms
    //merge     1ms
    //insertion 2ms

    //Size of array = 10000
    //type      time
    //Native    17ms
    //selection 81ms
    //merge     3ms
    //insertion 27ms

    //Size of array = 100000
    //type      time
    //Native    27ms
    //selection 5897ms
    //merge     22ms
    //insertion 1992ms
    //tested on , 1.6GH, Java 1.8, Win 10
}
