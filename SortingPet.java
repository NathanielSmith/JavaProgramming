/*Nathaniel D. Smith 
Date:5-10-13
Assignment #5, problem 2
This program sorts an array of pets by
name, age, and weight in ascending order
when the user chooses what they want to sort.
*/

import java.text.*;
import java.util.Scanner;

public class SortingPet
  {
  public static void main(String[] args){

	DecimalFormat df = new DecimalFormat("0.00");
 	 Scanner in = new Scanner(System.in);

  Pets[] pet = new Pets[10];

  pet [0] = new Pets("Daisy",8,12.6);
  pet [1] = new Pets("Heidi",4,10.5);
  pet [2] = new Pets("Bandy",5,5.7);
  pet [3] = new Pets("Kitty",2,3.5);
  pet [4] = new Pets("Lucy",5,5.2);
  pet [5] = new Pets("Maggie",3,2.6);
  pet [6] = new Pets("Aimi",6,7.8);
  pet [7] = new Pets("Sassy",1,2.5);
  pet [8] = new Pets("Sandy",7,5.2);
  pet [9]= new Pets("Xiaomi",2,6.7);


System.out.println("What do  you want to sort?");
System.out.println("1 for Name");
System.out.println("2 for Age");
System.out.println("3 for Weight");
System.out.println("4 for Quitting");
System.out.println();
int number = in.nextInt();
//}


while(number != 4){
//switch(number){

	//case 1:
	if (number == 1){
		Pets.SortName(pet);
	System.out.println("Sorting by name in ascending order:");
	System.out.println("\tName"+"\t\tAge"+"\t\tWeight" + "\n");
		for(int i =0; i<=9;i++){
		System.out.println("\t" + pet[i].getName() +"\t\t" +  "   " +  pet[i].getAge() + "\t" + "  " + "\t" + pet[i].getWeight());}}

	//break;

	//case 2:
	if (number == 2) {
	Pets.SortAge(pet);
	System.out.println("Sorting by Age in ascending order:");
	System.out.println("\tName"+"\t\tAge"+"\t\tWeight");
		for(int i =0; i<=9;i++){
	System.out.println("\t" + pet[i].getName() +"\t\t" +  "   " +  pet[i].getAge() + "\t" + "  " + "\t" + pet[i].getWeight());}}

	//break;

	//case 3:
	if (number == 3) {
	Pets.SortWeight(pet);
	System.out.println("Sorting by weight in ascending order:");
	System.out.println("\tName"+"\t\tAge"+"\t\tWeight");
	for(int i =0; i<=9;i++){
	System.out.println("\t" + pet[i].getName() +"\t\t" +  "   " +  pet[i].getAge() + "\t" + "  " + "\t" + pet[i].getWeight());}}

	//break;

	//case 4:
	//return 0;

	System.out.println("\n" + "What do  you want to sort?");
	System.out.println("1 for Name");
	System.out.println("2 for Age");
	System.out.println("3 for Weight");
	System.out.println("4 for Quitting");
	System.out.println();
	 number = in.nextInt();
}
}
}



class Pets{

	//public Pets(){}//constructor
		String Name ;
		int Age ;
		double Weight ;

	public 	Pets(String newName, int newAge, double newWeight) {

	//public void setPet(String newName, int newAge, double newWeight){
		this.Name= newName;
		this.Age = newAge;
		this.Weight = newWeight;}

	public void setName(String newName){
		this.Name= newName;}

	public void setAge(int newAge){
		this.Age = newAge;}

	public void setWeight(double newWeight){
		this.Weight = newWeight;}

	public String getName(){
		return Name;}

	public int getAge(){
		return Age;}

	public double getWeight(){
		return Weight;}


			//define a meth to sort weight
			public static void SortWeight(Pets[] p){
				for(int pass = 0; pass<p.length - 1; pass++){

					for(int i=0; i<p.length-1; i++){
						if(p[i].Weight > p[i+1].Weight ){//inside the Flowers class, dont need get.
							Pets temp;
							//swap
							 temp = p[i];
							 p[i] = p[i+1];
							 p[i+1] = temp;}//end if
				}//end i

			}//end pass

		}//end sortWeight()

		public static void SortName(Pets[] p){
					for(int pass = 0; pass<p.length - 1; pass++){

						for(int i=0; i<p.length-1; i++){
							if((p[i].Name).compareTo (p[i+1].Name) > 0 ){
								Pets temp;
								//swap
								 temp = p[i];
								 p[i] = p[i+1];
								 p[i+1] = temp;}//end if
					}//end i

				}//end pass

			}//end sortName()

		public static void SortAge(Pets[] p){
							for(int pass = 0; pass<p.length - 1; pass++){

								for(int i=0; i<p.length-1; i++){
									if((p[i].Age)> (p[i+1].Age) ){
										Pets temp;
										//swap
										 temp = p[i];
										 p[i] = p[i+1];
								 p[i+1] = temp;}//end if
					}//end i

				}//end pass

		}//end SortAge()

	}//end Pets()





