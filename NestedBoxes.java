/*Nathaniel D. Smith 
Date: 5-1-13
Assignment #5, problem 3
This program asks the user to enter a number a boxes,
then displays the number of boxes nested inside one another.
*/

import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.util.Scanner;


class NestedBoxes extends JFrame{

	//constructor
	public NestedBoxes(){
		Scanner s = new Scanner (System.in);
				//System.out.print("Enter the number of boxes:");
				 String inputStr = JOptionPane.showInputDialog(null, "Enter the number of boxes you want to display: ");
				 int num = Integer.parseInt(inputStr);
			//int box = s.nextInt();
		boxes b = new boxes(num);
		add(b);

	}
        public static void main(String[] args) {

			NestedBoxes f = new NestedBoxes();

            f.setTitle("Nested Boxes");
            f.setLocationRelativeTo(null); //center the frame
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(550, 500);
            f.setLocationRelativeTo(null); // Center the frame
            f.setVisible(true);

    }
}

//override(redefine) paint() method
class boxes extends JPanel{
	int num;

	//construct
	boxes(int x ){
		num = x;}

    public void paint(Graphics g){


		int x = 20;
		int y = 20;

		int width=0;
		int height = 0;


        g.setColor(Color.black);

	for (int i = 0; i<num; i++) {
		 width = (getWidth()- x*2);//coordinates
		 height = (getHeight() - y*2);
        g.drawRect(x, y, width, height);
        x +=20;
        y +=20;
	}


    }
}
