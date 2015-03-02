//Nathaniel Smith
/** 5-3-13
Displaying a checkerboard: Write a program that displays
a checkerboard. */

import javax.swing.*;//For JFrame
import java.awt.*;//for Graphics, Color
import java.util.Scanner;

public class CheckerboardFrame extends JFrame {
	//constructor
	CheckerboardFrame(){
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the number of rows:");
			int row = s.nextInt();
		System.out.print("Enter the number of columns: ");
			int col = s.nextInt();
		checkerboard c = new checkerboard(row, col );
		//add c to CheckerboardFrame
		add(c);}

	public static void main(String[] args) {
    CheckerboardFrame f = new CheckerboardFrame();

    f.setTitle("CheckerBoard");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(300, 250);
    f.setLocationRelativeTo(null); // Center the frame
    f.setVisible(true);
  }
}
class checkerboard extends JPanel {
	int row;
	int col;
	//construct
	checkerboard(int x, int y){
		row = x;
		col = y;}

  public void paint(Graphics g) {

		int width = getWidth()/col;// size of the checker board
		int height = getHeight()/row;

		int x =0;//set at upper left corner
		int y =0;
		boolean isWhite = true;

		for(int j = 0; j<row;j++)
		{
			//first row
		for(int i =0; i <col; i++)//for columns
		{
			if (isWhite)
			{
		g.setColor(Color.white);//pen set to white
		g.fillRect(x,y,width,height);
		//increasing x by adding width
		x += width;
		isWhite = false;
		}

		else{
		//change the color to black
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
		x += width;
		isWhite = true;}
	}//end for i

	if (j % 2 ==0)
	isWhite = false;
	else
	isWhite = true;

  	//second row
  	y += height; //increasing the y by adding height
  	x = 0; //reset the x to 0

}//end for j
	/*for(int i=0; i<8; i++)
			{
		g.setColor(Color.white);//pen set to white
		g.fillRect(x,y,width,height);
		//increasing x by adding width
		x += width;

		//change the color to black
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
		x += width;*/




  }
}
