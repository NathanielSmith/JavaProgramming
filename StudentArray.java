//Nathaniel Smith
//4-5-13, 4-8-13
//StudentArray.java
//object array
// Looks up student data

import java.text.*;
import javax.swing.JOptionPane;

class StudentArray
{
   public static void main(String[] args)
   {
	   //declare and create an array of ten Students
	   	Student[] students = new Student[10];

	   	//initialize each rectangle with the specified width and height
	   students[0] = new Student(1412, "Ninja", 4.0);
	   students[1] = new Student(1536, "Dominique", 3.9);
	   students[2] = new Student(1618, "DJ Awesome", 3.8);
	   students[3] = new Student(1732, "Paul", 3.7);
	   students[4] = new Student(1834, "Johnny", 3.6);
	   students[5] = new Student(2129, "Adrienne", 2.3);
	   students[6] = new Student(2287, "Marilyn", 2.6);
	   students[7] = new Student(2381, "Lawrence", 3.1);
	   students[8] = new Student(2410, "Samantha", 3.5);
	   students[9] = new Student(2367, "Bridget", 2.0);
	   String strID;
	   String message = "Enter an ID: " ;
	   int id;
	   boolean isFound = false; // starts off local vari b/c inside the main, then change to false

	   //while(isFound == false ){
		while (!isFound) {
	   strID = JOptionPane.showInputDialog(null, message);
	   id = Integer.parseInt(strID);


	//search the input id in the students array
	for(int i = 0; i < 10 ; i++)
	if (id == students[i].getID()){
	//System.out.println(students[i])

	//found the id
	idFound = true;
	JOptionPane.showMessageDialog(null, students[i]);
	}
	if (isFound == false)
	message = "Sorry, no student with #ID"
	+ strID +  "\n" + message ;
	       }//end main()
	   }//end TotalArea class


	   class Student{
	       private int id;
	       private String name;
	       private double gpa;

	       //constructor
	       public Student(){}

	       //constructor
	       public Student(int id, String name, double gpa)
	       {
	 		this.id = id;
	 		this.name = name;
	 		this.gpa = gpa;
	       }

			public int getID(){return id;}

	   	//override toString() method to return a rectangle
	   	//instance in the form: (width, height)
	   	public String toString()
	   	{
	   	return "ID#" + id + " " + name + " GPA is " + gpa;
		}

  }
