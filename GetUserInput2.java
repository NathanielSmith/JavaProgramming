//Nathaniel D. Smith
//1-30-13

import java.util.Scanner;

public class GetUserInput2 {
	public static void main(String[] args){

		//create a Scanner object to recceive the user input
		//Scanner s = new Scanner (System.in)

		double x = 3.4;
		int i = 3;
		//i = x; this is not ok large data type to a small data type, but->
		i =(int) x; //this works for i = x;
		//x = i; this is ok small data type to a large data type

		System.out.println("one\t\ntwo\tthree"); // /t key to add space

		//if one is db (4.0), the result will be dbl
		//if one is a int (4/5) then the result will be a int.
	}
}
