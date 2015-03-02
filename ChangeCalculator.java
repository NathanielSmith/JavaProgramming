//Nathaniel D. Smith 
//2-1-13
//Change Calculator
import java.util.Scanner;


public class ChangeCalculator {
	public static void main(String[] args){

	double amount;
	int Dollars, Quarters, Dimes, Nickels, Pennies;

	Scanner scan = new Scanner(System.in);


	System.out.println("Enter a dollar amount:  ");
	amount = scan.nextDouble();

	int remainingAmount = (int)(amount*100);

	Dollars = remainingAmount/100;
	remainingAmount %= 100;
	//remainingAmount = remainingAmount % 100;

	Quarters = remainingAmount / 25;
	remainingAmount %= 25;
	//remainingAmount = remainingAmount % 25;

	Dimes = remainingAmount / 10;
	remainingAmount %= 10;
	//remainingAmount = remainingAmount % 10;

	Nickels = remainingAmount / 5;
	remainingAmount %= 5;
	//remainingAmount = remainingAmount % 5;

	Pennies = remainingAmount / 1;
	remainingAmount %= 1;
	//remainingAmount = remainingAmount % 1;


System.out.println("The amount $" + " consists of ");
System.out.println( "\n\n\t" + Dollars + "\tDollars(s)");
System.out.println("\t" + Quarters + "\tQuarter(s)");
System.out.println("\t" + Dimes + "\tDime(s)");
System.out.println("\t" + Nickels + "\tNickel(s)");
System.out.println("\t" + Pennies + "\tPenny(s)");
	}
}
