//Nathaniel Smith
//assignment #4
//3-11-13

class DateDemo
{
	public static void main (String[] args)
	{
		//create an instance of Date
		Date d1 = new Date (7, 8, 2001);
		System.out.println("You entered " + d1);
		System.out.println("There are " + d1.daysSinceJan1() +
		" days from " + d1 + " to 1/1/"  + d1.getYear());

	}//end main()
}//end DateDemo class

class Date
{
	//instances variable
	private int day, month, year;

	//constructor
	Date (int d, int m, int y){

		day = d;
		month= m;
		year = y;}

		int getYear(){return year;}


		int daysSinceJan1(){
			int totalDays;
			totalDays = day + 31*(month -1);

		//remove days for shorter months
		if (month > 4) totalDays --;//April has only 30 days
		if (month > 6) totalDays --;
		if (month > 9) totalDays--;
		if (month > 11) totalDays--;

		if (month >2 &&
		((year % 400 == 0) || (year % 4 ==0 && year % 100 !=0)))
		//this is leap year
			totalDays -=2;

		else if (month > 2 )
			totalDays -= 3;//not leap year take 3 days

		return totalDays;


		}

// override toString () method
public String toString(){//no argument
	return month+"/"+day+"/"+year;} //this is the format for your instance!



}
