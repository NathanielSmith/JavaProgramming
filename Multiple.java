/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natejavaprojects;

/**
 *
 * @author Nathaniel D. Smith, NetBeans
 * Date: 3/3/15
 * An application that reads two integers and determines 
 * whether the first is a multiple of the second and prints the result
 */

import javax.swing.JOptionPane;

public class Multiple {
    
    public static void main(String[] args){
        
        int firstNumber, secondNumber;       
        String input;
        
        //now read from the user as string and convert to type String
        input = JOptionPane.showInputDialog("Please enter first number: ");
        firstNumber = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Please enter second number: ");
        secondNumber = Integer.parseInt(input);
        
        // make the right output string
        String result;
        if(firstNumber % secondNumber == 0)
            result = firstNumber + " is a multiple of " +
                    secondNumber + "\n";
        
        else
            result = firstNumber + " is not a multiple of" + 
                    secondNumber + "\n";
        
        JOptionPane.showConfirmDialog(null, result,
                "Results", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}

