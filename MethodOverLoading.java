
//Nathaniel Smith
//2-27-13
/*** This program invokes a method named Max in order
* to get the maximum value between two.  **/
//MethodOverload Exercise 2 prob 2 ch5

import java.util.Scanner;

class MethodOverLoading {

    public static void main(String[] args) {
		System.out.println("The larger one is : "
		+ Max(12, 45));

		System.out.println("The largest number is: "
		+ Max(2, 45, 12));

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

public static int Max(int num1, int num2, int num3){

	int result;

	if (num1 > num2 )
	result = num1;
	else
	result = num2;

	if (num3 > result)
	result = num3;

	return result;

}//end Max()


}//end class
