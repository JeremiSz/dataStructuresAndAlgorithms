package week1.Q1;

public class MyMathTest {
    public static void main(String[] args) {
        int result,expected;
        System.out.println("Smallest");
        result = MyMath.smallest(-100,0,100);
        expected = -100;
        printTest(expected,result);

        result = MyMath.smallest(0,100,77);
        expected = 0;
        printTest(expected,result);

        result = MyMath.smallest(-1,-12,-33);
        expected = -33;
        printTest(expected,result);

        System.out.println("Power");
        result = MyMath.power(1,5);
        expected = (int)Math.pow(1,5);
        printTest(expected,result);

        result = MyMath.power(5,6);;
        printTest(Math.pow(5,6),result);

        result = MyMath.power(77,0);
        expected = (int)Math.pow(77,0);
        printTest(expected,result);

        result = MyMath.power(0,88);
        expected = (int)Math.pow(0,88);
        printTest(expected,result);

        System.out.println("Add to");
        result = MyMath.sumTo(1);
        expected = 1;
        printTest(expected,result);

        result = MyMath.sumTo(10);
        expected = 55;
        printTest(expected,result);

        System.out.println("Factorial");
        result = MyMath.factorial(1);
        expected = 1;
        printTest(expected,result);

        result = MyMath.factorial(5);
        expected = 120;
        printTest(expected,result);
        result = MyMath.factorial(3);
        expected = 6;
        printTest(expected,result);

        boolean boolR,boolE;
        System.out.println("is Prime");
        boolR = MyMath.isPrime(89);
        boolE = true;
        printTest(boolE,boolR);

        boolR = MyMath.isPrime(38);
        boolE = false;
        printTest(boolE,boolR);

        boolR = MyMath.isPrime(-79);
        boolE = true;
        printTest(boolE,boolR);

        boolR = MyMath.isPrime(-4);
        boolE = false;
        printTest(boolE,boolR);
    }

    public static void printTest(int expected,int result){
        System.out.println("E:" + expected + " A:" + result);
    }
    public static void printTest(double expected,double result){
        System.out.println("E:" + expected + " A:" + result);
    }
    public static void printTest(boolean expected,boolean result){
        System.out.println("E:" + expected + " A:" + result);
    }
    public static void printTest(String expected, String result){
        System.out.println("E:" + expected + " A:" + result);
    }
}
