//Nathaniel Smith
/*** This program shows an example that creates
an instance of Scanner and reads data from the
file "scores.txt". ***/

import java.io.*;
import java.util.*;

public class ReadData {
public static void main(String[] args) throws Exception {

    //step 1: open the file
	  FileInputStream file =new FileInputStream ("scores.txt")

    //step 2: create a Scanner for the file
	 Scanner input = new Scanner(file);

    //step 3: read data from a file
		while (input.hasNext()) {
		        String firstName = input.next();
		        String mi = input.next();
		        String lastName = input.next();
		        long score = input.nextInt();
		        System.out.println(
		        firstName + " " + mi+ " " + lastName + " " + score);
		        }


        //step 4: close the file
		input.close();

	}//end main()
}//end class
