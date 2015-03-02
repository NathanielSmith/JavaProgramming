//Nathaniel Smith
//3-1-13, 3-4-13

class TestRectangle {
	public static void main(String[] args){
		//create an instance of Rectangle
			int x; //inside, it is a instance, and is zero

		Rectangle r1 = new Rectangle(12, 15);
		Rectangle r2 = new Rectangle(4, 5);
		//Rectangle r3 = new Rectangle();
		//r1 = r2;
		//r1.width = 4;
		//r2.width = 20;
		//r1.width = 20
 	//printthe area of r1
 	System.out.println("r2's width " + r2.width() );//this accesses r2 width

 	//change r2 width to 20
 	//r2.width = 20;
 	r2.setWidth(20);
		System.out.println("The area of r1 is: " + r1.getArea());
}
}//end TestRectangle class

//Create a Rec class
class Rectangle {

	//instnce vari
private double width, height;

	//Date d;//reference data type

	//create a constructor
	Rectangle (double w, double h){
		width = w;
		height = h;

}
Rectangle (){}//no-arg, empty body

public void setWidth(double w ) {
	width = w;}

public void setHeight(double h) {
		height = h;}

public double getWidth(){
	return width;}

public double getHeight(){
	return height;
}

//constructor,  name must be the same



//get area() method
double getArea(){
	double area;
	area=width*height;
	return area;
	}
}
