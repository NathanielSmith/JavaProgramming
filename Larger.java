/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natejavaprojects;

/**
 *
 * @author Nathaniel D. Smith
 * Date: 3/3/15
 * Finds larger between two numbers
 */
import javax.swing.JOptionPane;

public class Larger {
    
    public static void main(String[] args){
        
        String firstNumber;
        String secondNumber;
        String result;
        int number1;
        int number2;
        
        firstNumber = JOptionPane.showInputDialog("Enter the first integer: ");
        secondNumber = JOptionPane.showInputDialog("Enter the second integer: ");
          
        //convert from Strings to type int
        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);
        
        result = "";
        
        if(number1 > number2)
            result = number1 + " is larger ";
        
        if(number1 < number2)
            result = number2 + " is larger ";
        
        if(number1 == number2)
            result = " These numbers are equal ";
        
        JOptionPane.showMessageDialog(null, result, "Comparsion Results",
                JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
