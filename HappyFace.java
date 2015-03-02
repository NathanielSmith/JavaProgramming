//Nathaniel Smith
/** 5-1-13
This program draws a happy face...not quite, have to come back to**/

import javax.swing.*; //for JFrame, JPanel
import java.awt.*; //for Graphics, Color

public class HappyFace extends JFrame{

		// create constructor
        public HappyFace() {
	FacePanel p = new FacePanel();
          	add(p);
      }

        public static void main(String[] args) {

			//create an instance of HappyFace
            HappyFace f = new HappyFace();

            f.setTitle("Happy Face");
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
        g.drawOval(x,  y,  radius*2, radius*2);
		g.fillOval(x + radius /2,  y + radius /2, radius / 10 , radius / 10 );//left eye
		g.fillOval(x * 2 + radius , y *2 + radius , radius / 10,  radius / 10);
        // g.fillOval(155, 100, 10, 20);//left eye
        //g.fillOval(230, 100, 10, 20);//right eye
      g.drawArc(x + radius /2,  y + radius,  radius, radius/2, 180, 180);//mouth
    }
}
