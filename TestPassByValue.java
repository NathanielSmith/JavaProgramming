//Nathaniel Smith 

/**** When you invoke a method with a parameter,
the value of the argument is passed to the parameter.
This is referred to as pass-by-value. If the argument
is a variable rather than a literal value, the value
of the variable is passed to the parameter. The variable
is not affected, regradless of the change made to the
parameter inside the method. *****/


 public class TestPassByValue{
 public static void main(String[] args) {

     //declare and initialize variables
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking the Swap method, num1= "
        + num1 + " , num2=" + num2);

        //Invoke the swap method to attempt to swap two variables
        swap(num1, num2);

        System.out.println("\n\nAfter invoking the swap method, num1="
        + num1 + " , num2=" + num2 + "\n\n");

    }//end main()

            /**Define a method that swaps two values **/
            public static void swap (int n1, int n2) {
                System.out.println("\n\tInside the swap method");
                System.out.println("\n\t\tBefore swapping n1=" + n1 + ", n2=" + n2);

                //swap n1 with n2
                int temp = n1;
                n1= n2;
                n2 = temp;

                System.out.println("\t\tAfter swapping \tn1=" + n1 + ", n2=" + n2);
            }


 }//end class
