// Author: Nathaniel D. Smith 
// Date: 2-3-13
// Assignment #1 problem 2
// This program reads the number of hours spent at each of these
// activities and then displays the number of hours spent at each
// activity, then displays the number of pounds worked off.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Triathlon {
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
DecimalFormat df = new DecimalFormat ("0.00");
final double cyclingCals = 200;
final double runningCals = 475;
final double swimmingCals = 275;
final double cal = 3500;

System.out.print("Enter number of hours bicycling: ");
double Cycling = sc.nextDouble();
System.out.print("Enter number of hours running: ");
double Running = sc.nextDouble();
System.out.print("Enter number of hours swimming: ");
Double Swimming = sc.nextDouble();

//calculate calories burnt
double totalCal = (Cycling * cyclingCals) + (Running * runningCals)
+ (Swimming * swimmingCals);


//calculate weight loss
double poundsLost = totalCal / cal;

//output name, calories burnt and weight loss

	System.out.println( "The person can lose " + df.format(poundsLost));
	}
}

