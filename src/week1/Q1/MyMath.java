package week1.Q1;

public class MyMath {
    //post correction class
    public static int smallest(int a,int b,int c){

        int d = (a < b)? a : b;

        return (d < c)? d : c;
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
    //post correction class
    public static boolean isPrime(int n){
        if(n <= 2) return false;

        boolean isPrime = true;
        int i = 2;

            while(i <= (n/2) && isPrime){
                if (n % i == 0)
                    isPrime = false;
                i++;
            }
        return isPrime;
    }
}
