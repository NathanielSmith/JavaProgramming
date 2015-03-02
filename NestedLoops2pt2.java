//Nathaniel Smith
//2-22-13
//Nested loops.java
//Methods Power point #5
//Exercise: Chapter 5 Exercises problem #2
import java.util.Scanner;

class NestedLoops2pt2
{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = s.nextInt();
		System.out.println("Enter a number");
		int num2 = s.nextInt();

	//call Max()
	System.out.println("The larger number is " + Max(num1, num2));


	}//end main()
		public static int Max(int n1, int n2){
			int larger;
			if (n1 > n2)
			larger = n1;
			else
			larger = n2;

			return larger;

	}//end

}
