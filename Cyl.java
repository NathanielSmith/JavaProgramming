//Nathaniel Smith
/** 5-1-13
This program draws a cylinder.**/

import javax.swing.*; //for JFrame, JPanel
import java.awt.*; //for Graphics, Color

public class Cyl extends JFrame{

		// create constructor
        public Cyl() {
	FacePanel p = new FacePanel();
          	add(p);
      }

        public static void main(String[] args) {

			//create an instance of HappyFace
            Cyl f = new Cyl();

            f.setTitle("Cylinder");
            f.setLocationRelativeTo(null); //center the frame
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(400, 350);
            f.setVisible(true);
    }
}

//override(redefine) paint() method
class FacePanel extends JPanel{
    public void paint(Graphics g){
		int xCenter = getWidth()/2;//coordinates
		int yCenter = getHeight()/2;

		int  radius = (int)(Math.min(getHeight(),
									getWidth())*0.4);
		//set up the upper left corner
		int x = xCenter - radius;
		int y = yCenter - radius;

        g.setColor(Color.green);

        //draw top oval
        g.drawOval(40, 20, getWidth()-40*2, 40);

        //draw Bottom of cylinder
		g.drawOval(40, getHeight()-60, getWidth()-40*2, 40);
		//draw sides
		g.drawLine(40, 40, 40, getHeight() - 40);//left side
		g.drawLine(getWidth()- 20 *2,  40, getWidth()-20*2, getHeight()-40);
    }
}
