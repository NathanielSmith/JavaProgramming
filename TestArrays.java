//Nathaniel Smith
//3-22-13
/****
Write a program that requests ten numbers from the user.
The program then displays the ten input numbers on the
screen, and also displays the largest one.

***/
import java.util.Scanner;

public class TestArrays {
	public static void main(String[] args) {
		//int[] list = new int[10]; //array is the reference data type, each element will be zero default!
		int list[] = new int[10];
		Scanner s= new Scanner(System.in);


		//print the default values
		//get ten numbers from the user
		for (int i = 0; i<10; i++){
		System.out.print("Input an Integer " + (i+1) + " : " );
		//System.out.print(list[i] + " ");
		list[i] = s.nextInt(); }


		//print the input ten numbers here
		System.out.print("\n\nYou input ten numbers: " ) ;
		for(int i=1; i<list.length; i++)
		System.out.print(list[i] + " ");

		//assign the first element to the largest
		int largest = list [0];

		for (int i= 1; i < list.length; i++){
		if(list[i] > largest)
		largest = list[i];}

		System.out.println("\n\nThe largest is " + largest);

		//System.out.println(list.length);
}



}//end class
