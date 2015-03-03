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
 * Finds the Sum, Product, Difference, and Quotient of 2 numbers
 */
import javax.swing.JOptionPane;

public class Calculate {
    
    public static void main(String[] args){
        
        String firstNumber, secondNumber; //First & Second strings
        int number1;
        int number2;
        int sum, product, difference, quotient; 
        
        //read in first and second numbers from user as a string
        firstNumber = JOptionPane.showInputDialog("Enter the first integer: ");
        secondNumber = JOptionPane.showInputDialog("Enter the second integer: ");
        
        //convert numbers from type String to type int
        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);
        
        //calculate
        sum = number1 + number2;
        product = number1 * number2;
        difference = number1 - number2;
        quotient = number1 / number2;
        
        //display results
        JOptionPane.showMessageDialog(null,"The sum is: " + sum, "Sum",
                JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"The product is: " + product,
                "Product", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"The difference is: " + difference,
                "Difference",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"The quotient is: " + quotient,
                "Quotient",JOptionPane.PLAIN_MESSAGE);
        
        System.exit(0);
    }
    
}
