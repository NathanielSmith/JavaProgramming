// Author: Nathaniel D. Smith 
// Date: 2-3-13
// Assignment #1 problem 3, uses Swing
// This program inputs a five-digit number, then separates them.

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SeparateInteger{
    public static void main(String args[]) {// To print digits.

        //Scanner read=new Scanner(System.in);
        //System.out.println("Enter 5 digit number:");
        String inStr = JOptionPane.showInputDialog(null, "Enter 5 digit number:");

        int n=Integer.parseInt(inStr);//read integer from user

        int Five = n/10000;

        int Remainder4 = n%10000;
		int Four = Remainder4/1000;

        int Remainder3 = Remainder4 % 1000;
		int Three = Remainder3/100;

        int Remainder2 = Remainder3 % 100;
		int Two = Remainder2/10;

        int Remainder1 = Remainder2 % 10;
		int One = Remainder1/10;

  		int Remainder0 = Remainder1 / 1;
		int Zero = Remainder0;

        //System.out.printf("%d   %d   %d   %d   %d   ",
        //Five, Four, Three, Two, Zero);
		JOptionPane.showMessageDialog(null, "The input integer was: " + n +
		". The individual digits are: " + Five + "  " + Four +
		"  " + Three + "  " + Two + "  " + One);
    }

}
