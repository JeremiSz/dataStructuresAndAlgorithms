package week6;

import java.util.Arrays;

public final class MyMath {

    private MyMath(){}

    public static int factorial(int num){
        int out;
        if(num > 1) {
            out = num * factorial(num - 1);
        }
        else if(num == 0) {
            out = 1;
        }

        else {out = num;}
        return out;
    }

    public static double myPow(double x, int y){
        if(y > 0){
            return x * myPow(x, y-1);
        }
        return 1;
    }

    public static String reverse(String str){
        final int length = str.length() - 1;
        if(length == 0) {
            return str;
        }
        else {
            final String output = reverse(str.substring(0,length));
            return str.charAt(length) + output;
        }
    }

    public static int sum(int[] values){
        final int size = values.length  - 1;
        if(size == 0) {
            return values[0];
        }
        else {
            return values[size] + sum(Arrays.copyOf(values, size));
        }
    }
}
