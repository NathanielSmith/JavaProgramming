//3-1-13
//Objects and classes pwr pt #6!
public class VehicleDemo //can put two classes into one file
{
	public static void main(String[] args){
		//int x;

		//create an instance of Vehicle
		Vehicle car = new Vehicle(5, 12, 30); //reference variable (instance)
		Vehicle van = new Vehicle(12, 16, 20);

		car.mpg = 25;//how to assign the value
		van.passenger=12;

		System.out.println("my car can "
		+ car.passenger + "."); //to call, use instance dot int
		// display the van range
		van.range();


	}//end main

}


class Vehicle
{
	//data fields, instance variables
	int passenger;
	int fuelCap;
	int mpg;

	//create a constructor
	Vehicle (int x, int y, int z){
		passenger = x;
		fuelCap = y;
		mpg = z;}//end constructor

		// compute the reange assuming a full tank of gas'
		void range()
		{
			System.out.println("Range: " + fuelCap*mpg);}





}
