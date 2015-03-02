/*Nathaniel D. Smith
Date:4-26-13
Assignment #5, problem 1
This program sorts through state capitals
*/

import java.io.FileInputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;

	class Capitals
	{
	public static void main(String[] args)
	throws Exception{

		//open the file
		FileInputStream is = new FileInputStream("capitals.txt");

		//create a Scanner for the file
		Scanner input = new Scanner(is);
		Scanner s =new Scanner(System.in);

	int correctCount = 0;
	boolean[] x = new boolean[50];
	selectfive(x);

	for (int i=0; i<50; i++) {
	String name = input.nextLine();
	String[] fields = name.split(",");

	if (x[i]){

String capital;{

		//System.out.println("Capital of " + fields[0] );
		//String capital = JOptionPane.showInputDialog
		System.out.println("What is the capital of " + fields[0] + "?");
		capital = s.nextLine();

	if (capital.equals(fields[1])) {
	//JOptionPane.showMessageDialog
	System.out.println("Your answer is correct" + "\n" );

	correctCount++;
	}
	else {
	//JOptionPane.showMessageDialog
	System.out.println("The correct answer should be " + fields[1]);

	}
}
	//JOptionPane.showMessageDialog
	System.out.println("The correct count is " + correctCount + "\n");

}//String capital end
	}
}//end main()

public static void selectfive(boolean[] names){//data is boolean
	int x = 0;
	for(int i=0; i<5; i++){//you select five here or any you want to select

	//do {

	//generates random number b/w 0 and 99
	x = (int)(Math.random()*50);
	//} while ((x >= 50) || (names[x] == true));
	//people x is selected, we need five, use loop
	names[x] = true;

	}//end for i loop

}//end selectfive()

}
