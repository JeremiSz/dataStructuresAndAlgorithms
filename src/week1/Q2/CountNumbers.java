package week1.Q2;

import javax.swing.*;

public class CountNumbers {
    //post correction class
    public static void main(String[] args) {
        int[] counts = new int[100];

        String input = JOptionPane.showInputDialog("Enter a number");
        int inParsed = Integer.parseInt(input.trim());
        while (inParsed > 0) {

            if(inParsed < 100)
                counts[--inParsed]++;

            input = JOptionPane.showInputDialog("Enter a number");
            inParsed = Integer.parseInt(input.trim());
        }

        input = "There were";
        for (int i = 0 ; i < counts.length ; i++) {
            input += counts[i] + "s " + (i + 1) + "\n";
        }
        System.out.println(input);
    }
}
