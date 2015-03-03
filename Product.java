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
 * Program that calculates and prints the product of three integers
 */
import javax.swing.JOptionPane;

public class Product {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int x; // first number
        int y; //second number
        int z; //third number
        int result; //product of numbers
        
        String xVal; //first string input by user
        String yVal; //second string input by user
        String zVal; //third string input by user
        
        xVal = JOptionPane.showInputDialog("Enter first integer:  ");
        yVal = JOptionPane.showInputDialog("Enter second integer:  ");
        zVal = JOptionPane.showInputDialog("Enter third integer:  ");
        
        x = Integer.parseInt(xVal);
        y = Integer.parseInt(yVal);
        z = Integer.parseInt(zVal);
        
        result = x * y * z;
        
        JOptionPane.showMessageDialog(null, "The Product is:  "+ result);
        System.exit(0); 
    }//end of method main   
}//end of product
