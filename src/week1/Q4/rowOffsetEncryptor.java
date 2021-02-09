package week1.Q4;

import week1.Q1.MyMathTest;

import java.util.Arrays;

public class rowOffsetEncryptor {
    public static String rowOffsetEncrypt(String text,int[] key){
        StringBuilder output = new StringBuilder();

        int rowSize = getLargest(key);
        int colCount = text.length() / rowSize;
        if(text.length() % rowSize != 0) colCount++;


        for (int i = 0; i < colCount; i++) {
            for (int j = 1; j <= rowSize; j++) {
                int index = getPos(key,j);
                output.append(text.charAt(index + rowSize * i));
            }
        }


        return output.toString();
    }

    public static void main(String[] args) {
        String input = "abcdef";
        String result = rowOffsetEncrypt(input,new int[]{2,3,1});

        MyMathTest.printTest("cabfde",result);
    }

    private static void printArray(int[] in){
        StringBuilder output = new StringBuilder();
        for (int c:in) {
            output.append(c);
            output.append(", ");
        }
        System.out.println(output.toString());
    }
    private static int getLargest(int[] in){
        //int largest = in[0];
        int[] temp = in.clone();
        Arrays.sort(temp);
        return temp[temp.length - 1];
        /*for (int i = 1; i < in.length; i++) {
            largest = Math.max(largest,in[i]);
        }
        return largest;*/
    }

    private static int getPos(int[] array,int value){
        int i = 0;
        while (i < array.length){
            if(array[i] == value) return i;
            i++;
        }
        return -1;
    }
}
