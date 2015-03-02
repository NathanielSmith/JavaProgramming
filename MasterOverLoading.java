
//2-27-13
/*** This program invokes a method named Max in order
* to get the maximum value between two.  **/
//MasterOverload Exercise 2 prob 2 ch5

import java.util.Scanner;

class MasterOverLoading {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first int value: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second int value: " );
        int num2 = input.nextInt();

       //call Max()
       System.out.println("\nThe maximum between " + num1
       + " and " + num2 + " is " + Max(num1, num2) + ".");


	   System.out.println("\n\n");
    }//end main method


/**Define a method that returns the max between two numbers */
public  static int Max(int num1, int num2) {

    int result;

    if (num1 > num2)
        result = num1;
    else
        result = num2;
        return result;

	}

public static void int Max(int num1, int num2, int num3){

}//end Max()


}//end class
