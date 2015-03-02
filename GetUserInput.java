//Nathaniel D. Smith
//1-30-13
//User is asked to enter age and name

import java.util.Scanner;

public class GetUserInput {
	public static void main(String[] args){

		String name;
		int age;

		//create a Scanner object to receive the user input
		Scanner s = new Scanner(System.in);


		System.out.print("Please enter your age:  ");
								age = s.nextInt();

		name = s.nextLine();

		System.out.print("Please enter your name: " );
				name = s.nextLine();


		System.out.println("Your name is "
		+ name + " and your age is " + age );

	}
}
