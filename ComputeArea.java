//Nathaniel Smith
//2-4-13

import java.util.Scanner;
import java.text.DecimalFormat;

public class Commission {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    //step 1: prompt the user to enter two numbers
	System.out.println("Enter the sales amount :  ");
	double saleAmount = s.nextDouble();

    //step 2: find the commission rate
	double commRate, Commission;

	DecimalFormat df = new DecimalFormat("$0.00");
	if (saleAmount>= 1000) {
	commRate = 0.08;
	}
	else
	if (saleAmount>= 500)
	commRate = 0.06;
	else
	commRate = 0.05;

	commission = saleAmount*commRate;

	 //step 3: display the larger one on the screen

	System.out.println("The commission is :"
	+ (df.format (commission));

    }//end main method
}//end class
