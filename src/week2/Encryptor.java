package week2;

import javax.swing.*;

public class Encryptor {

    public static void main(String[] args) {
        String in = JOptionPane.showInputDialog("Enter text to encrypt");
        in = encryptRowColumn(in,6);
        System.out.print(in + " ");
        in = deCipherRowColumn(in,6);
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
        StringBuilder text = new StringBuilder();
        for (int x = 0; x < numY; x++) {
            int index = x;
            for (int y = 0; y < numX; y++) {
                text.append((index > (length - 1)) ? 'X' : inText.charAt(index));
                index += numY;
            }
        }
        return text.toString();
    }

    private static String removeSpaces(String text){
        int amount = text.length();
        StringBuilder output = new StringBuilder();

        for (int i = 0;i<amount;i++) {
            if(text.charAt(i) != ' ')
                output.append(text.charAt(i));
        }
        return output.toString();
    }
}
