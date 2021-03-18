package week4;

public class MyArrays {
    public static int insert(int[] values, int currentSize,int pos,int newElement){
        if(currentSize < values.length && pos < values.length){
            for (int i = (currentSize - 1); i <= pos; i++) {
                values[i - 1] = values[i];
            }
            values[pos] = newElement;
            currentSize++;
        }
        else
            throw new ArrayIndexOutOfBoundsException();
        return currentSize;
    }
//Week 5
    public static int remove(int[] values, int currentSize, int pos){
        if(currentSize >= values.length || pos >= values.length) return -1;//throw new ArrayIndexOutOfBoundsException();
        for (int i = (pos + 1); i < currentSize; i++) {
            values[i + 1] = values[i];
        }
        currentSize--;
        return currentSize;
    }

    //Week 7
    public static int linearSearch(int[] array, int target){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target){
        int l = 0;
        int r = array.length;

        while(l < r){
            int m = (l + r)/2;

            if(array[m] > target)
                r = m-1;
            else if(array[m] < target)
                l = m + 1;
            else
                return m;
        }
        if(array[l] == target)
            return l;
        else if(array[r] == target)
            return r;
        else
            return -1;
    }

    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i; j < array.length; j++) {
                if(array[smallest] > array[j])
                    smallest = j;
            }
            if(i != smallest){
                int temp = array[i];
                array[i] = array[smallest];
                array[smallest] = temp;
            }
        }
    }

    public static void insertionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int val = array[i];

            int j = i - 1;
            while (j >= 0 && array[j] > val){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = val;
        }
    }
}
