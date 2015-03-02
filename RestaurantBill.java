//Author: Nathaniel D. Smith 
//Date: 2-2-13
//Assignment #1 problem 1
//This program computes the tax and tip on a restaurant bill

import java.util.Scanner;
import java.text.DecimalFormat;
//import javax.swing.JOptionPane;

public class RestaurantBill {
	public static void main(String[] args){

String inputString; //For reader's input
double mealCharge; // The user's total bill.
double taxAmount; //6.75 of the user's total bill
double totalMeal; //Bill after tax has been added
final double taxRate = 0.0675;
double tip; // 15 percent of the totalMeal
final double tipRate = 0.15;
//int overall; // The total including tax and tip

// Get the user's total bill.
//inputString = JOptionPane.showInputDialog("What is " + "the total bill? ");
Scanner s= new Scanner(System.in);
DecimalFormat df = new DecimalFormat ("$0.00");

System.out.println("Enter the charge for the meal: ");
mealCharge = s.nextDouble();

taxAmount =mealCharge * taxRate;
tip = (mealCharge + taxAmount) * tipRate;

totalMeal = mealCharge + taxAmount + tip;


//Convert the input to an int.
/*total = Integer.parseInt(inputString);

// Calculate the tax amount.
taxAmount = 6.75/100 * total;

// Calculate the total meal after tax has been added.
totalMeal = taxAmount + total;

//Calculate the tip
tip = 15/100 * totalMeal;*/

// Calculate the entire bill.
//overall = totalMeal + tip;



System.out.println("Meal Charge:\t" + df.format(mealCharge));
System.out.println("Tax: \t\t" + df.format(taxAmount));
System.out.println("Tip:\t\t" + df.format(tip));
System.out.println("Total:\t\t" + df.format(totalMeal));
System.exit(0);
}
}
