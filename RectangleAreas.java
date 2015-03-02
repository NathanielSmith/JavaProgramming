//Nathaniel Smith
//4-3-13
//Object arrays

import java.text.*;

public class RectangleAreas
{
    public static void main(String[] args)
    {
		//declare an array of Rectangle with 10 elements
		Rectangle[] RecArray = new Rectangle[10];

		//initialize each element of the array using
		//random() method
		for(int i=0; i<10; i++)
		RecArray[i] = new
		Rectangle (Math.random() * 100, Math.random()*100);

		//for(int i=0; i<10; i++);



		//width = 2
		//height = 3
		RecArray[0] = new Rectangle (2, 3);
		//print the area of the first rectangle
		System.out.print("The area is " + RecArray[0].getArea());


    }//end main()
}//end TotalArea class


class Rectangle{
    private double width;
    private double height;

    //constructor
    public Rectangle(){}

    //constructor
    public Rectangle(double w, double h)
    {
    	width =w;
    	height = h;
    }

    public void setWidth (double w)
    {
        width = w;
    }

    public void setHeight (double h)
    {
        height = h;
    }

    public double getWidth ()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public double getArea()
    {
    	return width*height;
    }

}
