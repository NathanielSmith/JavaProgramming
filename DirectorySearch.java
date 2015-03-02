//Nathaniel Smith
//4-24-13
//Reading data using a Scanner I/O
import java.io.FileInputStream;
import java.util.Scanner;

class DirectorySearch{

	public static void main(String[] args)
	throws Exception{

		//open the file
		FileInputStream is = //"'is' is 'in String'
		new FileInputStream("EmployeeData.txt");


		//create a Scanner for the file
		Scanner input = new Scanner(is);//the object is 'is' here : )


		Scanner s =new Scanner(System.in);
		System.out.println("Enter the person's name:  ");
		String name = s.nextLine();

		while(input.hasNext()){
		//input the first line
		String line = input.nextLine();
		//split the input line into items
		String[] tokens = line.split(",");

		//print the first line, input name,
		//if(tokens[0].equalsIgnoreCase(name))//normal search
		if((tokens[0].toUpperCase().indexOf(name.toUpperCase()))
		!= -1){
			//searches just part of the name,

			System.out.printf("%-15s%-10s%-8%-10s" ,
			"Name" , "Dept", "Phone");
			System.out.println();
											//and returns those with the part in thier name
		System.out.printf("%-15s%-10s%-8%-10s", tokens[0],
		tokens[1].trim(),tokens[2].trim(),tokens[3].trim());

}

		//read the next line from my file
}//end while loop

//do {

		//System.out.print("Do you want to find person? (Y or N) ");
		//answer =s1.next().charAt(0);

}	//if (answer == 'y' || answer =='Y') {





}
