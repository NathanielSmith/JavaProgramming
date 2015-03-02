//Nathaniel D. Smith 
//Date: 2-15-13

/*** Write a program that displays all the numbers
from 100 to 1000, ten per line, that are divisible
by 5 and 6.****/

class FindNumbers {
    public static void main(String[] args){

		int count=0 ;

		for (int i = 100; i<=1000; i++)
		//display all the numbers that are divisible by 5
		if (i % 5 ==0 && i % 6 ==0)

		{//add braces here, breaks up the ifs
		System.out.print(i + " ");
		count++; //count = count + 1
		if (count % 10 ==0)
		//start a new line
		System.out.println(); } //end the first if


    }//end main method
}//end class
