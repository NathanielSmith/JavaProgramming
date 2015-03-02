//2-4-13
//Payroll.java program

import java.util.Scanner;
import java.text.DecimalFormat;

class Payroll {
	public static void main(String[] args){

		double rate, hoursWorked, regularPay, overtimePay;
		final int FULL_WEEK = 40;
		final double OT_RATE = 1.5;


		Scanner keyboard = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("$0.00");

		System.out.print("How many hours did you work this week? ");
		hoursWorked = keyboard.nextDouble();

		System.out.print("What's your regular pay rate? ");
		rate = keyboard.nextDouble();

		if (hoursWorked > FULL_WEEK){

			regularPay = FULL_WEEK * rate;
			overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * rate;
	}
		else {

			regularPay = hoursWorked * rate;
			//overtimePay = 0.0;


		System.out.println("\n\nRegular pay is \t" + df.format(regularPay)
		+ "\nOvertime pay is " + df.format(overtimePay) + "\n\n\n");


		}//end main()
	}//end class
