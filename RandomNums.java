//Nathaniel Smith
/**** Write a program to create a file named randoms.txt.
Wirte one hundred integers created randomly into the file
using text I/O. Intgers are separated by spaces in the file.
Read the data back from the file and display the sorted data.**/

import java.io.*;
import java.util.*;


public class RandomNums {
public static void main(String[] args) throws Exception {

	//create and open a file for output
    FileOutputStream file = new FileOutputStream("randoms.txt");
    PrintWriter output = new PrintWriter(file);

    //write 100 random numbers to the file




    //open the file for input




    //print the sorted array on the screen



}

//sorting method
public static void bubbleSort(int[] a) {

        for (int pass = 0; pass<a.length-1; pass++) { //passes

            for (int i= 0; i<a.length-1; i++) { //one pass
                if (a[i] >a[i+1]) {   //comparison
                    int temp;
                    temp = a[i];        //swap
                    a[i] = a[i+1];
                    a[i+1] = temp;} //end if

                }//end for i
            }//end for pass

    }//end bubbleSort()

}
