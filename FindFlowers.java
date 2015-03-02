//Nathaniel Smith

import java.util.Scanner;

class FindFlowers{
public static void main(String[] args){

	String[] flowers = {"petunia", "pansy", "rose", "violet", "carnation", "lily", "poppy", "daisy", "tulip", "hydrangea"};

	Scanner s = new Scanner(System.in);
	char answer;

	do {

		System.out.print("\n\nDo you want flowers (Y or N)? " );
		answer = s.next().charAt(0);

		System.out.print("\nWhat kind of the flower do you like? ");
		String name = s.next();

		int index = -1;


	//search for the input flower
	for (int i = 0; i<flowers.length; i++)
	if (name.equals(flowers[i]))
	index = i;

	if (index == -1)
	System.out.println("Sorry, we don't have " + name);
	else {

	System.out.print("\nYes, we have " + name +" !" + " How many stems would you like?");
	int num = s.nextInt();}




} while ((answer == 'y') || (answer =='Y'));


}//end main()
}//end class
