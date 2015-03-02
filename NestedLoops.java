//Nathaniel Smith
//2-20-13 & 2-22-13
//Nested loops.java
//Exercise: Sample outputs for using nested loops

class NestedLoops
{
	public static void main(String [] args)
{
	final double unitPrice = 20.50;
	//print three blank spaces
	System.out.print("   "); //aligns top row three spaces right

	//print the col tab
	for (int i = 5; i<=25; i+=5)
	System.out.printf("%8d", i);

	System.out.println("\n");

	for (int row =5; row<=15; row++) {
	   	System.out.printf("%3d" , row);

		for (int col = 5; col <= 25; col +=5)//col++ would be 1, +=5 is by 5
		System.out.printf("%8.1f", row*col*unitPrice); //f stands for format, %d is decimal integer
													//%s is string
													//%8.1f format double, col eight and decimal one
		System.out.println();//start a new line

  	}//end first for

  }//end main()
}//end class()
