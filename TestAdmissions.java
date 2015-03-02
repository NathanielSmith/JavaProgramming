/*Nathaniel D. Smith
Date: 3-25-13
Assignment #3, Problem 3
*/

import javax.swing.JOptionPane;

public class TestAdmissions{
	public static void main(String[] args){
		//enter the grade point average
		String s = JOptionPane.showInputDialog("Enter the point average: " );
		double gpa = Double.parseDouble(s); //parse the inout string to double

		//enter the admission test score
		s = JOptionPane.showInputDialog("Enter the admission test score: ");
		int score = Integer.parseInt(s);

		JOptionPane.showMessageDialog(null, Admission(gpa, score));

}//end main()

public static String Admission(double gpa, int score){
	String result= "";
	if(gpa >= 3.6 && score >= 60 )
	                result = "Student is ACCEPTED";
	else if(gpa >= 3.0 && score >= 70 )
	                result = "Student is ACCEPTED ";
	else if(gpa >= 2.6 && score >= 80 )
	            result = "Student is ACCEPTED ";
	else if(gpa >= 2.0 && score >= 90 )
	            result = "Student is ACCEPTED ";
	else
	result = "Student is NOT REJECTED";

	return result;

}//end Admission method

}



