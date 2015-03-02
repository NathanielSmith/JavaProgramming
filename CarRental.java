//Nathaniel D. Smith 
//date: 3-1-13
//Assignment #2 problem 2
//This program asks the user to enter the number of days, model of car, then
//adds up the cost to rent.

import java.util.Scanner;
import java.text.DecimalFormat;

class CarRental
{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$0.00");
		double charge;
		double cost = 0.0;
		double vehiclePrice;

		//int W, C, R;
		String vehicleModel;


		System.out.print("Enter a vehicle model to rent: " +
		"\n" + "W for Jeep Wrangler" + "\n" +
		"C for Jeep Grand Cherokee" + "\n" +
		"R for Land Rover: ------");
		char vehicleChoice = sc.next().charAt(0);
		switch(vehicleChoice){
			case 'W' :
			case 'w' :
			vehicleModel = "Jeep Wrangler";
			vehiclePrice = 55.00;

		break;

			case 'C' :
			case 'c' :
			vehicleModel = "Jeep Grand Cherokee";
			vehiclePrice = 85.00;

		break;

			case 'R' :
			case 'r' :
			vehicleModel = "Land Rover";
			vehiclePrice = 125.00;


		break;

			default:
			vehiclePrice = 0;
			vehicleModel = " ";}

		int daysNumber = 0;

		System.out.print("\nNumber of days to rent: ");
		daysNumber = sc.nextInt();

		System.out.print("\nWill you fill up the tank before returning the car? <Y or N> : ");
		char gasFill =sc.next().charAt(0);
		String answer;
		answer = "";
		if(gasFill == 'Y'|| gasFill == 'y'){
		answer = "Yes";
		charge = 0;}
		if (gasFill == 'N' || gasFill == 'n'){
			answer = "No";
		charge = 52;}



		System.out.print("\n\nCar Rental Information: " + "\n");
		System.out.print("\t\nVehicle Model: " +  vehicleModel);
		System.out.print("\t\nRental Days:   " + daysNumber);
		System.out.print("\t\nFill Tank:     " + answer + "\n\n\n");

		double total = daysNumber * cost;

		System.out.println("The charge is: " + total );


}
}

