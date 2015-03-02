//Nathaniel Smith
/**
4-15-13 chap 8
String Manipulations ***/
import java.util.Scanner;

public class TestStrings {
public static void main(String[] args){

	Scanner s = new Scanner(System.in);

//Popular String objects: String(){}, String(char[] x){}, String(String a ){}
//x.length = 10 is a array length
//"abcde".length() = 5 is the String length
/**Suppose that the strings are given as follows.
What are the results of the following expressions ? **/

System.out.println("Enter your name: ");
String name = scan.nextLine();


   String s1 = "Java";//interned String
   String s2 = "Java";//" " " "
    String s3 = new String("Java");
    String s4 = new String("Java");

    String s5 = s3.intern();
    String s6 = "Java";

    String s7 = "Wisconsin";
    String s8 = "Whitewater";

   /*   (s1 == s2);
        (s1 == s3);
        (s1 == s6);
        (s3 == s4);

        (s1.equals(s3));

        (s7.compareTo(s8)); */

        System.out.println(s3 == s4);//compares the referecne location
        System.out.println(s3.equals(s4));
        System.out.println();

 }
}
