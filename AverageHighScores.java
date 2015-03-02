//Nathaniel Smith
//Nathaniel D. Smith 
//Date: 2-15-13
//Assignment #2 Problem 1
//This program asks the user to enter three integer scores
//and then displays the average of the two highest scores.

import java.util.*;

class AverageHighScores
{
    public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		double average=0;

		System.out.print("Enter score 1: " );
        double score1 = s.nextDouble();

		System.out.print("Enter score 2: " );
		double score2 = s.nextDouble();

		System.out.print("Enter score 3: " );
		double score3 = s.nextDouble();

		//double larger;
			if ((score1 <= score2) && (score1 <= score3))
					average =(score2 + score3)/2;
			else if ((score2 <= score1 ) && (score2 <= score3))
					average = (score1 + score3)/2;
				else
					average = score3;


		/*for(int i = 1; i<=numOfStudents; i++){

        System.out.print("\nEnter a student " + i +"'s name: " );
        String student = s.nextLine();
		student = s.nextLine();

        System.out.print("Enter a student " + i + "'s score: ");
        double score =s.nextDouble();*/



		 System.out.println("The average of highest scores is :  " + average);


    }//end main method
}//end class
