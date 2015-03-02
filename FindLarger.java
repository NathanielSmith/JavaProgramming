/**** Nathaniel D. Smith 
	Date: 2-4-13
Description:  This program asks the user to enter two numbers,
and displalys the larger one on the screen.**/


import java.util.Scanner;

public class FindLarger {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    //step 1: prompt the user to enter two numbers
	System.out.println("Enter two numbers: ");
	double input1 = s.nextDouble();
	double input2 = s.nextDouble();

    //step 2: find the largest one

	double larger;
	if (input1 > input2)
	larger = input1;
	else
		larger = input2;

	 //step 3: display the larger one on the screen

	System.out.println("The larger one is " + larger);

    }//end main method
}//end class
