package week1.Q1;

public class MyMath {
    public static int smallest(int a,int b,int c){
        int d;
        if(a < b)
            d = a;
        else
            d = b;

        if(d < c)
            return d;
        else
            return c;
    }

    public static int power(int a,int b){
        if(b == 0) return 1;
        else if(a == 0) return 0;
        int total = a;
        for (int i = 1; i < b; i++) {
            System.out.println(i + " " + a + " " + b + " " + total);
            total *= a;
        }
        return total;
    }

    public static int sumTo(int a){
        int total = 0;
        for (int i = 1; i <= a; i++) {
            total += i;
        }
        return total;
    }

    public static int factorial(int a){
        int total = 1;
        for (int i = 2; i <= a; i++) {
            total *= i;
        }
        return total;
    }

    public static boolean isPrime(int n){
        if(n == 0) return false;
        if(n > 0) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) return false;
            }
        }
        else
            for (int i = -2; i > n; i--) {
                if (n % i == 0) return false;
            }
        return true;
    }
}
