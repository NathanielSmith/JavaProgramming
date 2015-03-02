//Nathaniel Smith
/* 4-17-13, using Swing
Write a program that prompts the user for a customer's
first and last names. The application then extracts these
names so that a friendly business letter can be constructed.*/

import javax.swing.*;

public class BusinessLetter{
public static void main(String[] args){
	String fullName, firstName, familyName;
	int spacePostion;

	fullName= JOptionPane.showInputDialog(null,
	"Please enter customer's first name and last name");

	spacePostion = fullName.indexOf(" ");
	firstName = fullName.substring(0, spacePostion);
	familyName = fullName.substring(spacePostion+1);

	JOptionPane.showMessageDialog(null, "Dear " + firstName +
	",\nI am so glad we are on a first name basis"+
	"\nbecause I would like the opportunity to"+
	"\ntalk to you about an affordable insurance"+
	"\nprotection plan for the entire " + "?????" +
	"\nfamily. Call A-One Family Insurance today" +
	"\nat 1-800-555-9287.");
}
}
