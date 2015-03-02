//Nathaniel Smith
//2-22-13
//Nested loops.java
//Methods Power point #5
//Exercise: Chapter 5 Exercises problem #2
import java.util.Scanner;

class NestedLoops2pt3
{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a first integer ");
		int num1 = s.nextInt();
		System.out.println("Enter a second integer ");
		int num2 = s.nextInt();

	//call Max()
	System.out.println("\nThe maximum between " + num1
	+ " and " + num2 + " is " + Max(num1, num2) + ".");
	System.out.println("\n\n");
	//System.out.println("The larger number is " + Max(num1, num2));
	}//end main()

	//Define a method
		public static int Max(int num1, int num2){
			int result;
			if (num1 > num2)
				result = num1;
			else
			result = num2;

			return larger;

	}//end

}
