package week6;

public class MyMath {
    public static int factorial(int num){
        if(num > 1)
            num = num * factorial(num - 1);
        if(num == 0) num = 1;
        return num;
    }
}
