// Author: Nathaniel D. Smith 
// Date: 2-4-13
// Assignment #1 problem 4

import java.util.Scanner;

public class Payroll {
	   public static void main(String args[]) {
	//Create a Scanner
	    Scanner input = new Scanner(System.in);
	//Enter Employee's Name
	System.out.print("Enter Employee's Name: ");
	String employeeName = input.nextLine();

	System.out.print("Enter Number of Hours worked in a week: " );
	double numbersofhoursworked = input.nextDouble();

	System.out.print("Enter Hourly Pay Rate: ");
	double hourlypayrate = input.nextDouble();

	//Enter Federal Tax Withholding Rate
	System.out.print("Enter Federal Tax Withholding Rate: ");
	double federaltaxwithholdingrate = input.nextDouble();

	System.out.print("Enter State Tax Withholding Rate: ");
	double statetaxwithholdingrate = input.nextDouble();

	System.out.print("Enter Social Security Tax Rate: ");
	double socialsecuritytaxrate = input.nextDouble();

	double grossPay ;
	grossPay =  numbersofhoursworked * hourlypayrate;

	//output
	System.out.println("Employee Name: \t" + employeeName);
	System.out.println("Hours Worked: \t" + numbersofhoursworked);
	System.out.println("Pay Rate: \t" + hourlypayrate);
	System.out.println("Gross Pay: \t" + grossPay);

	double totalDeduction;
	totalDeduction = grossPay*federaltaxwithholdingrate + grossPay*statetaxwithholdingrate + grossPay*socialsecuritytaxrate;

	System.out.println("\n\nDeduction:");
	System.out.println("\tFederal Withholding (18.00%): " + grossPay*federaltaxwithholdingrate );
	System.out.println("\tState Withholding (7.50%): " + grossPay*statetaxwithholdingrate);
	System.out.println("\tSocial Security Tax (6.75%): " + grossPay*socialsecuritytaxrate);
	System.out.println("\tTotal Deduction: " + totalDeduction);

	double netPay;
	netPay = grossPay - totalDeduction;

	System.out.println("Net Pay: \t\t\t" + netPay);















	   }
}
