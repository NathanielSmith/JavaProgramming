//Nathaniel Smith 
//Date:2-18-13
/*** This program uses the while and do while loop **/


import java.util.*;

class ConLoops{
    public static void main(String[] args) {

		int i = 0;//while loop is the pre test loop
		while (i <= 10){
			System.out.print(i + "  ");
			i++;}//end while loop

		System.out.println("\n\n\n");

		int j = 0;//do while is the post test loop
		do {
			System.out.print(j + "  ");
			j++;
	}while (j <= 10);//does not matter the condition, this will loop once.



    }//end main method
}//end class
