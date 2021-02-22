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
        /*else
            throw new ArrayIndexOutOfBoundsException();*/
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
}
