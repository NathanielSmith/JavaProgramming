/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natejavaprojects;

/**
 *
 * @author Nathaniel D. Smith, Netbeans
 * Date: 3/3/15
 * An application that reads an integer and
 * determines and prints whether it is odd or even
 */
import javax.swing.JOptionPane;

public class OddEven {
    
    public static void main(String[] args){
        
        String input;
        String result;
        int number;
        
       input = JOptionPane.showInputDialog("Enter integer: ");  
       
       number = Integer.parseInt(input);
       
       result = "";
       
       if(number % 2 == 0)
           result = "Number is even";
       
       if(number % 2 != 0);
           result = "Number is odd";
           
       JOptionPane.showConfirmDialog(null, result, "Results",
               JOptionPane.INFORMATION_MESSAGE);
       
       System.exit(0);
       
    }
}
