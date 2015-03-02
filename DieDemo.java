//die class exercise
//3-4-13, 3-6-13

class DieDemo {
	public static void main(String[] args){

	//create two instances
	Die d1 = new Die();
	Die d2 = new Die();
	System.out.println(d1);

	System.out.println("d1's sideUp value is " + d1.getsideUp());

	d1.roll();

	d2.roll();
	System.out.println("Rolling d1. Now d1's sideUp value is " + d1.getsideUp());

	}
}

class Die{
	private int sideUp;

	//constructor
	Die(){sideUp = 1;} //default

	int getsideUp() {return sideUp;}

	//the method that changes the sideUp to a random value from 1-6
	void roll(){
		sideUp = (int)(Math.random()*6 +1);

	}

}


	//instance variables
	/*int sideUp =1;
	public int getSideUp(){
		return sideUp;*/








