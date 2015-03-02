/**Nathaniel D. Smith
	Date: 3-25-13
 * This program prints out a sequence starting from a positive
 * integer specified by the user.  It also counts the number of
 * terms in the sequence, and prints out that number.
 */
 import java.util.Scanner;

 public class ComputingSeries {

      public static void main(String[] args) {

         int N;       // for computing terms in the sequence
         int counter; // for counting the terms

        System.out.println("Starting point for sequence: ");
         N = TextIO.getlnInt();
         while (N <= 0) {
            System.out.println("The starting point must be positive. Please try again: ");
            N = TextIO.getlnInt();
	 	}

        counter = 1;
         while (N != 1) {
             if (N % 2 == 0)
                N = N / 2;
             else
                N = 3 * N + 1;

             counter = counter + 1;
         }


         System.out.println("It took ");
       counter++;
         System.out.println("steps" + counter + "to reach 1.");

     }  // end of main()

 }  // end of class
