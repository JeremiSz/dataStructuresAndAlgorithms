package week1.Q2;

import javax.swing.*;

public class CountNumbers {
    public static void main(String[] args) {
        int[] count = new int[100];

        String input = JOptionPane.showInputDialog("Enter a number");
        int inParsed = Integer.parseInt(input);
        while (inParsed >= 1) {
            count[--inParsed]++;
            input = JOptionPane.showInputDialog("Enter a number");
            inParsed = Integer.parseInt(input);
        }
        input = "There were";
        for (int i = 0 ; i < count.length ; i++) {
            input += count[i] + "s " + (i + 1);
            input += "\n";
        }
        System.out.println(input);
    }
}
