//Nathaniel Smith 
//Date:2-15-13 & 2-18-13
/*** Write a program that prompts the user to enter the
number of students and each student's name and score, and
finally displays the student with the highest score. **/

import java.util.Scanner;
//import java.util.*;
import java.text.DecimalFormat;

class HighestScore{
    public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Enter the number of students: " );
        int numOfStudents = s.nextInt();
        double scoreTop = 0;
        String nameTop = "";

		for(int i = 1; i<=numOfStudents; i++){

        System.out.print("\nEnter a student " + i +"'s name: " );
        String name = s.nextLine();

		name = s.nextLine();

		System.out.print("Enter a student " + i + "'s score: ");
        double score =s.nextDouble();
        if (score > scoreTop){
        score = score;
        nameTop = name;}//end if

   		}//end for

		 System.out.println("\n\nTop student: "
		 + nameTop +"'s score is " + df.format(scoreTop ));


    }//end main method
}//end class
