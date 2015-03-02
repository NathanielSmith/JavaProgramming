//Nathaniel Smith 

class SwapperDemo
{
	public static void main(String[] args){
	Swapper s1 = new Swapper(12,3);

	//print the first variable
	System.out.println("Before Swapping: num1 = " + s1.getX() + "\n\n"); //x is private

	//call swap
	s1.swap();

	System.out.println("After Swapping: num1 = " + s1.getX() + "\n\n");

}
}
class Swapper{
//instance variables
private int x, y;

//create constructor
Swapper(int a, int b){
	//this.x = x;  .x is x ,and x is a, and .y is y and y is b
	//this.y = y;}
	x = a;
	y = b;
	}
//methods
int getX() {return x; }
int getY() {return y; }

void swap (){
	//swap a and b
	int temp;//local variable, b/c vari is dec inside this message
	temp= x;
	x=y;
	y=temp;


}//end swap
}//end Swapper class
