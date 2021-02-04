package week1.Q4;

import javax.swing.*;

public class Password {
    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog("Please enter password");
        while (!isValid(password)){
            password = JOptionPane.showInputDialog("Please enter valid password");
        }
        System.exit(0);
    }

    public static boolean isValid(String password){
        if(password.length() < 8)
            return showError("Password too short");
        else if(!hasRange(65,90,password))
            return showError("No capitals");
        else if(!hasRange(97,122,password))
            return showError("No lowercase");

        else if(!hasRange(48,57,password))
            return showError("No digits");
        else
            return true;

    }
    private static boolean showError(String error){
        JOptionPane.showMessageDialog(null,error);
        return false;
    }

    private static boolean hasRange(int start,int stop,String text){
        for (char i = 0; i < text.length(); i++) {
            if(text.charAt(i) >= start && text.charAt(i) <= stop)
                return true;
        }
        return false;
    }
}