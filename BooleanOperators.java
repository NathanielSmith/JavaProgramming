//Nathaniel D. Smith
//2-1-13
//Boolean Operators
import java.util.Scanner;


class BooleanOperators {
	public static void main(String[] args){

	//step : declare variables
		int UserInput;

	//step 2: get user input(s)
	//create a Scanner objects to get the user input
	Scanner scan = new Scanner(System.in);


	//prompt the user to enter an amount
	System.out.println("Enter an integer:  ");
	UserInput = scan.nextInt();

	System.out.println("\n\nIs " + UserInput +
	" divisible by 5 and 6? Answer: " +
	((UserInput % 5 == 0)&& (UserInput % 6 == 0 )));

	}
}
