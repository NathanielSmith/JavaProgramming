//Nathaniel Smith
/*** 4-22-13 This program gives an example that creates an
instance of PrintWriter and writes two lines to the
file "Scores.txt". Each line consists of first name
(a string), middle name initial(a character), last name
(a string), and score (an integer). ****/
import java.io.*; //imports all input/output data files

public class WriteData {//for FileOutputStream and PrintWriter
public static void main(String[] args) throws Exception {

    //step 1: open a text file
	FileOutputStream file = new FileOutputStream("score.txt");

    //step 2: create a file
	PrintWriter output = new PrintWriter(file);


    //step 3: write formatted output to the file
    output.print("John T Smith  ");
    output.println(90);
    output.print("Eric K Jones  ");
    output.println(85);
    output.print("Mary N Wu ");
    output.println(89);
    output.print("Lisa T Lee  ");
    output.println(92);

    //step 4: close the file
    output.close();

}
}
