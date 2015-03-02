//Nathaniel Smith
//4-3-13
//counting single digits
//write a program that generates on hundred random digits
//0 and 9 displays the count for each digit


class CountingDigits {
	public static void main(String[] args){
		int x, counter = 0;
		int[] digits = new int[10];


		for(int i = 0; i < 100; i++){
			x = (int)(Math.random()*10);
			digits[x]++;
		System.out.printf("%5d", x);
		counter ++;
		if(counter == 10){
		//start a new line
		System.out.println();
		//reset counter to 0
		counter = 0;
		}//end if

		}//end for loop
System.out.println("\n\n\n");
//print the digits[]
for (int i = 0; i < 10 ; i++)
System.out.print(digits[i] + "  ");


}

}

