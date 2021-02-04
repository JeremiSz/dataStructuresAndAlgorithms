package week2;

import javax.swing.*;

public class Encripter {

    public static void main(String[] args) {
        String in = JOptionPane.showInputDialog("Enter text to encrypt");
        in = encryptRowColumn(in,5);
        System.out.println(in);
        in = deCipherRowColumn(in,5);
        System.out.println(in);
        System.exit(0);
    }

    public static String encryptRowColumn(String plainText, int numColumn){
        plainText = removeSpaces(plainText);

        int length = plainText.length();

        int numRows = length/numColumn;
        if(length%numColumn != 0) numRows++;

        return reorderString(plainText, numRows, length, numColumn);
    }

    public static String deCipherRowColumn(String cipherText, int numColumn){
        int length = cipherText.length();
        int numRows = length/numColumn;
        if(length%numColumn != 0) numRows++;

        return reorderString(cipherText, numColumn, length, numRows);
    }

    private static String reorderString(String inText, int numX, int length, int numY) {
        String text = "";
        for (int x = 0; x < numY; x++) {
            int index = x;
            for (int y = 0; y < numX; y++) {
                text += (index > (length - 1))? 'X':inText.charAt(index);
                index += numY;
            }
        }
        return text;
    }

    private static String removeSpaces(String text){
        int amount = text.length();
        String output = "";

        for (int i = 0;i<amount;i++) {
            if(text.charAt(i) != ' ')
                output += text.charAt(i);
        }

        return output;
    }
}
