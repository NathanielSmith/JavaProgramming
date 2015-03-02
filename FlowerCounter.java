//Nathaniel Smith

/* 5-6-13
 * FlowerCounter.java
 * like hwk#5 prob 2
 Sorting by price from lower to higher ascending and alphabetical order
 */

import java.util.Scanner;
import java.text.*;

public class FlowerCounter {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        Flowers[] flower = new Flowers[10];

       	flower[0] = new Flowers("petunia", 0.50);
		flower[1] = new Flowers("pansy", 0.75);
		flower[2] = new Flowers("rose", 1.50);
		flower[3] = new Flowers("violet", 0.75);
		flower[4] = new Flowers("carnation", 0.85);
		flower[5] = new Flowers("lily", 1.25);
		flower[6] = new Flowers("poppy", 2.15);
		flower[7] = new Flowers("daisy", 0.85);
		flower[8] = new Flowers("tulip", 2.75);
		flower[9] = new Flowers("hydrangea", 1.30);

		Flowers.SortPrice(flower);
		for (int i=0; i<flower.length; i++){
		        System.out.printf("%-12s%6.2f", flower[i].getName(), flower[i].getPrice());
				System.out.println();}//new line

	 }
}


class Flowers{
	private String name;
	private double price;

	public Flowers(String name, double price){
		this.name = name;
		this.price = price;
	}

	public String getName(){
		return name;
	}

	public double getPrice(){
		return price;
	}

	public void setName(String name){
		this.name =name;}

		public void setPrice(double price){
		this.price = price;}

		//define a meth to sort price
		public static void SortPrice(Flowers[] f){
			for(int pass = 0; pass<f.length - 1; pass++){

				for(int i=0; i<f.length-1; i++){
					if(f[i].price > f[i+1].price ){//inside the Flowers class, dont need get.
						Flowers temp;
						//swap
						 temp = f[i];
						 f[i] = f[i+1];
						 f[i+1] = temp;}//end if
			}//end i

		}//end pass

	}//end sortPrice()

	public static void SortName(Flowers[] f){
				for(int pass = 0; pass<f.length - 1; pass++){

					for(int i=0; i<f.length-1; i++){
						if((f[i].name).compareTo (f[i+1].name) > 0 ){//inside the Flowers class, dont need get.
							Flowers temp;
							//swap
							 temp = f[i];
							 f[i] = f[i+1];
							 f[i+1] = temp;}//end if
				}//end i

			}//end pass

		}//end sortName()


}//end Flowers()





