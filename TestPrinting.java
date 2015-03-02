/*** Write a method that prints a message n times.**/

class TestPrinting{
public static void main(String[] args) {

	//calling nPrint() method
    nPrint("Hello", 5);

    System.out.println("\n\n");

}//end main method


//define a method that prints a message n times
public static void nPrint(String message, int n) {
    for (int i = 0; i<n; i++)
    System.out.println(message);

}//end nPrint()

}//end class
