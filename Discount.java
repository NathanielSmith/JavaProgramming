//Nathaniel Smith
//2-6-13
//if else

import java.util.Scanner;

class Discount {
	public static void main(String[] args) {

	int items;
 	double values;

 Scanner s = new Scanner (System.in);

 System.out.println("Enter the number of items bought:");
 	items = s.nextInt();

 System.out.println("Enter the purchase amount: ");
 	 values = s.nextDouble();

 	double disRate=0.0;
 	/*if( items >= 5)
 	disRate = 0.1;
 	else if (values >= 3000)
 	disRate = 0.2;*/

 	if (items >= 5 || values >= 3000)
 	disRate = 0.1;
 	else
 	disRate = 0;

	System.out.println("The discount is "
	+ disRate*values);

}
}
