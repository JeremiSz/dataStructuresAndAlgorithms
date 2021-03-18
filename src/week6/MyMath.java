package week6;

import java.util.Arrays;

public class MyMath {
    public static int factorial(int num){
        if(num > 1)
            num = num * factorial(num - 1);
        if(num == 0) num = 1;
        return num;
    }

    public static double myPow(double x, int y){
        if(y > 0){
            return x * myPow(x, y-1);
        }
        return 1;
    }

    public static String reverse(String str){
        int length = str.length() - 1;
        if(length == 0)
            return str;
        else {
            String output = reverse(str.substring(0,length));
            return (str.charAt(length) + output);
        }
    }

    public static int sum(int[] values){
        int size = values.length  - 1;
        if(size == 0)
            return values[0];
        else
            return values[size] + sum(Arrays.copyOf(values,size));
    }
}
