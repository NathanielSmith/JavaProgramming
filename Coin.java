//Nathaniel D. Smith 
//Date: 4-19-13
//Assignment #4, problem 1
//an instance of the class and display the side
//that is initially facing up.
//This program uses a loop to toos the coin 20 times, and tells the
//user the side the coin starts on, and how many times it comes
//up heads or tails.

class Coin{
	private String sideUp;

Coin(){

toss(); //will randomly choose heads or tails for the initial side
}

//randomly choose heads or tails
void toss()
{
	double prob = Math.random();//generates random number

	if(prob > 0.4)
	sideUp = "heads";
	else
	sideUp = "tails";
}

String getSideUp()
{
	return sideUp;
}

public static void main(String[] args)
{
	Coin nickel = new Coin();

System.out.println("The side intially facing up: " + nickel.getSideUp() + "\n");
System.out.println("Now I will toss the coin 20 times.");

int count =0;
for(int i = 0; i < 20; i++)
{
	nickel.toss();
System.out.println("Toss:  " + nickel.getSideUp());
//count++
if(nickel.getSideUp() == "heads")
count ++;
}//end for i

System.out.println("The coin comes up heads " + count + " times and tails " + (20 - count) + " times." + "\n");

}
}
