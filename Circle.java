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
 * Application that inputs from the user the radius 
 * of a circle as an integer and prints 
 * the circle’s diameter, circumference and area
 */
import javax.swing.JOptionPane;

public class Circle {
    
   public static void main(String[] args){
       
       String input; //string for user input
       String result; //string for results
       int radius; //radius of circle
       
       input = JOptionPane.showInputDialog("Please the radius of circle: ");
       
       radius = Integer.parseInt(input);
       
       result = "Diameter is " + (2*radius) + 
               "\nArea is " + (Math.PI * radius * radius) +
               "\nCircumference is" + (2*Math.PI * radius);
       
       //Display results
       JOptionPane.showConfirmDialog(null, result,"Calculation Results",
              JOptionPane.INFORMATION_MESSAGE);
       
       System.exit(0);
   } 
}
