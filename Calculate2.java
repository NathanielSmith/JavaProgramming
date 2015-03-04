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
 * An application that inputs three integers
 * from the user and displays the sum, average,
 * product, smallest and largest of the numbers in 
 * an information message dialog
 */
import javax.swing.JOptionPane;

public class Calculate2 {
    
    public static void main(String[] args){
        
        String firstNumber,secondNumber,thirdNumber;
        String result;
        int number1,number2,number3;
        int sum,largest,smallest,product,average;
        
        firstNumber = JOptionPane.showInputDialog("Enter the first integer: ");
        secondNumber = JOptionPane.showInputDialog("Enter second integer: ");
        thirdNumber = JOptionPane.showInputDialog("Enter the third integer: ");
        
        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);
        number3 = Integer.parseInt(thirdNumber);
        
        largest = number1;
        smallest = number2;
        
        //find the right values
        if(number2 >= number1){
            largest = number2;
            smallest = number1;
        }
        
        if(number3 > largest)
            largest = number3;
            
        if(number3 < smallest)
            smallest = number3;
        
        //calculations
        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        average = sum/3;
        
        //print
        result = "For the numbers " + number1 + " " + number2 + " " +
                number3 + "\n" + "The largest is " + largest + "\n" +
                "The smallest is " + "\n" + "The sum is " + sum + 
                "\n" + "The product is " + product + "\n" +
                "The average is " + average + "\n";
        
        //display results
        JOptionPane.showMessageDialog(null, result, "Calculate Results",
                JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
