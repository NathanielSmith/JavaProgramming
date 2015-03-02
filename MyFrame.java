//Nathaniel Smith
/*4-29-13//happy face!!!
Chap 10 JFrames
*/
import javax.swing.*;
import java.awt.*;


class MyFrame extends JFrame{

	//constructor
	public MyFrame(){
		MyPaper p = new MyPaper();
		add(p);

	}
	public static void main(String[] args){
		//create a frame
		MyFrame f = new MyFrame();

		f.setSize(400, 350);//set frame size
		f.setLocation(200, 200);//upper left hand croner is the default, so set your location
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when we close the frame, stops the program!
		f.setVisible(true);//must set to visible

	}
}

class MyPaper extends JPanel{//Paper
	public void paint(Graphics g) {//Pen
		//set the color
		g.setColor(Color.RED);
		//draw a circle
		g.drawOval(50, 50, 200, 200);
		//draw eyes
		g.fillOval(90, 100, 10, 20);//left eye
		g.fillOval(190, 100, 10, 20);//right eye
		g.drawArc(100, 124, 100, 50, 180, 180); //smile

		//g.drawString("Hello Computer, Adam is Crazy!", 10, 20);//sets location to a place on the JFrame
		//g.drawLine(10, 10, 50, 50);//starting point(10, 10  and ending point 50, 50)


	}


}
