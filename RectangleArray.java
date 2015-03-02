//Nathaniel Smith
//4-5-13

import java.text.*;

public class RectangleArray {
    public static void main(String[] args){

	//declare and create an array of ten Rectangles
	Rectangle[] RecArray = new Rectangle[10];

	/* Here are the 10 rectangles
	RecArray[0]   x[0]
	RecArray[1]   x[1]
	RecArray[2]
	....
	RecArray[9]  */


	//initialize each rectangle with random width and random height
	//for (int i=0; i<10; i++)
	//RecArray[i] = new
	//Rectangle(Math.random()*100, Math.random()*100);

	//initialize each rectangle with the specified width and height
	RecArray[0] = new Rectangle (2,3);
	RecArray[1] = new Rectangle (12,33);
	RecArray[2] = new Rectangle (20,33);
	RecArray[3] = new Rectangle (52,38);
	RecArray[4] = new Rectangle (22,37);
	RecArray[5] = new Rectangle (223,387);
	RecArray[6] = new Rectangle (112,23);
	RecArray[7] = new Rectangle (78,78);
	RecArray[8] = new Rectangle (23,67);
	RecArray[9] = new Rectangle (12,89);

	//print the ten rectangles and their areas
	for(int i =0; i<10; i++)
	System.out.println("Rectangle  "
	+  i  +  " is  "  + RecArray[i] + " and its area is  "
	+ RecArray[i] .getArea());


    }//end main()
}//end TotalArea class


class Rectangle{
    private double width;
    private double height;

    //constructor
    public Rectangle(){}

    //constructor
    public Rectangle(double w, double h){
    width =w;
    height = h;
    }

    public void setWidth (double w){
        width = w;
    }

    public void setHeight (double h) {
        height = h;
    }

    public double getWidth () {
        return width;
    }

    public double getHeight() {
    return height;
        }

        public double getArea(){
        return width*height;
        }
	//override toString() method to return a rectangle
	//instance in the form: (width, height)
	public String toString(){
		return "(" + width + " , " + height + ")" ;
	}

}//end Rectangle Class
