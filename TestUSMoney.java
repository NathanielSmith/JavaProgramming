//Nathaniel Smith
//3-13-11
//assinmemt #4
//asks use to add the complex number (a + bi) + (c + di)

class TestUSMoney{
public static void main (String[] args){
	//create a instance
	USMoney m1 = new USMoney (5, 67);
	USMoney m2 = new USMoney (4, 89);
	System.out.println("m1 = " + m1);
	System.out.println("m2 = " + m2);
	USMoney sum = m1.plus(m2);

	System.out.println("m1 + m2 is " + sum);

}

}

class USMoney{
	private int dollars, cents;

//constructor
	USMoney (int d, int c){
		dollars = d;
		cents= c;

		//ensure cents is b/w 0 and 99
		while (cents >= 100){
			dollars++;
			cents = cents -100;
		}
		while (cents < 0){
			dollars--;
			cents = cents +100;}


		}//end constructor

		//define method plus ()
		USMoney plus(USMoney m){
			USMoney result;
			result = new USMoney(this.dollars + m.dollars, this.cents + m.cents);
			return result;}



//override the toString() method
public String toString (){
	return "$" + dollars + "." + cents;

}

}//end USMoney class


