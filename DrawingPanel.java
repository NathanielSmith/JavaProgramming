//Nathaniel Smith
/** This program demonstrates drawings on a JPanel.
The example declares the NewPanel class, which extends
JPanel and overrides the paintComponent method to
draw a line and a string. ***/

import javax.swing.*;


public class DrawingPanel extends JFrame {
    public static void main(String[] args) {

        DrawingPanel f = new DrawingPanel();

        f.setTitle("Drawing Panel");
        f.setSize(250, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); //center the frame
        f.setVisible (true);
    }
}

//define a class, which extends JPanel and
//vorrides the paint method
