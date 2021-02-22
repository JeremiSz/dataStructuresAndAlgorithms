package week3;

import week1.Q1.MyMathTest;

public class Encrypting2 {

    public static void main(String[] args) {
        String input = "az : BCYX";
        String expected = "DC : EFBA";
        MyMathTest.printTest(expected,caesarEncipher(input,3));
        MyMathTest.printTest(input,caesarDecipher(caesarEncipher(input,3),3));
    }

    public static String caesarEncipher(String plainText,int offset){
        if(offset < 0) offset = -offset;
        if(offset >= 26) return null;
        return caesarCipher(plainText, offset);
    }

    public  static String caesarDecipher(String cipherText,int offset){
        if(offset > 0) offset = -offset;
        if(offset <= -26) return null;
        return caesarCipher(cipherText,offset);
    }

    private static String caesarCipher(String text,int offset){
        StringBuilder output = new StringBuilder();
        text = text.toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            int current = text.charAt(i);
            int alteredCurrent;

            if(current >= 65 && current <= 90){
                alteredCurrent = limitedOverflowedAdd(current,offset,64,91);
            }
            else
                alteredCurrent = current;

            output.append((char) alteredCurrent);
        }
        return output.toString();
    }

    private static int limitedOverflowedAdd(int a, int b, int lowerLimit, int upperLimit){
        int result = a + b;
        if(result <= lowerLimit){
            int difference = (lowerLimit - result) + 1;
            return upperLimit - difference;
        }
        else if(result >= upperLimit){
            int difference = (result - upperLimit) + 1;
            return  lowerLimit + difference;
        }
        else
            return result;
    }
}
