//Nathaniel Smith 
//2-25-13
import java.util.Scanner;
class TestSum{
	public static void main(String[] args ) {

		Scanner s = new Scanner(System.in);
		//test sumDigit(). Use the test to call the method out!

		char answer;

		do {
		System.out.print("Enter an integer number: ");
		int x = s.nextInt();



		System.out.println("The sum of " + x + " Is "
		+  sumDigits(x));
		System.out.print("Do you want to test again?");
		answer = s.next().charAt(0);

	}while(answer == 'y' || answer == 'Y');




	}//end main()

//define a method that computes the sum of the digits
// in an int
public static int sumDigits(int n) {
//method body goes here
int sum =0;
while (n != 0){
//extract out the ones digit, removes the number in the ones postion
int lastDigit = n %10;
//add the extract digit to sum
sum = sum + lastDigit;
//remove the extract digit from n
n = n /10;
}//end while loop

return sum;

}//end method()

}//end main
