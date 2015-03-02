//Author: Nathaniel Smith
// Date: 1-25-13
//Assignment 1, message box pops up and user enters the radius

	//import java.text.DecimalFormat;
	import java.text.*;//import all text package
	import javax.swing.JOptionPane;
//import java.lang.System; // default

class ComputeArea2{
	public static void main(String[] args){

		//declare vari ->dbl
		double radius, area;
		//declare a named constant use key word final
		final double PI = 3.14159;

	//create a Scanner object, it is a built-in class
	//Scanner scan = new Scanner(System.in); Scanner just for console

	DecimalFormat df = new DecimalFormat("0.00");


	//prompt the user to enter a radius

	String inputStr = JOptionPane.showInputDialog(null, "Enter the radius: ");
	//Java will take inputDialog is String, so we convert str to dbl

	//convert the input string to a double
	radius = Double.parseDouble(inputStr);

	//Area = radius * radius * PI

	//Calculate the area
	area = PI*radius*radius;

	//Display the area
	JOptionPane.showMessageDialog(null, "The area is " + df.format(area));
	//JOptionPane is a built in class
	}

}
