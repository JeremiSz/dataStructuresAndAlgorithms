package week1.Q3;

import javax.swing.*;

public class CountWords {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a sentence");
        int wordCount = countWords(input);
        JOptionPane.showMessageDialog(null,"That sentence has " + wordCount + " words.");
        System.exit(0);
    }

    public static int countWords(String in){
        int wordCount = 0;
        for (int i = 0; i < in.length(); i++) {
            if(in.charAt(i) == ' ')
                wordCount++;
        }
        return (wordCount + 1);
    }
}
