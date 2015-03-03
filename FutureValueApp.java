/*Nathaniel D. Smith
 * Date: 3/3/15
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futurevalueapp;

/**
 *
 * @author Nathaniel D. Smith, NetBeans
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nWelcome to the Future Value Calculator\n");
        
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y")){
            //get the info from our user
            System.out.print("Please enter monthly investment:   ");
            double monthlyInvestment = sc.nextDouble();
            System.out.print("Enter the yearly interest rates:   ");
            double interestRate = sc.nextDouble();
            System.out.print("Enter the number of years:         ");
            int years = sc.nextInt();
            
            //calculates the future value
            double monthlyInterestRate = interestRate/12/100;
            int months = years * 12;
            double futureValue = calculateFutureValue(
                    monthlyInvestment, monthlyInterestRate, months);
            
            //format and display the result
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            System.out.println("Future value:              " +
                    currency.format(futureValue) + "\n");
            
            //now see if the user wants to continue
            System.out.print("Continue? (y/n):  ");
            choice = sc.next();
            System.out.println();
        }
    }
    
    private static double calculateFutureValue(double monthlyInvestment,
            double monthlyInterestRate, int months){
        
        double futureValue = 0;
        for(int i = 1; i <= months; i++)
            futureValue = (futureValue + monthlyInvestment) *
                    (1 + monthlyInterestRate);
        return futureValue;
    }
    
}
