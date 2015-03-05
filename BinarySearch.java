/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natejavaprojects;

/**
 *
 * @author Nathaniel D. Smith
 * Date: 3/5/15
 * Simple Binary Search that asks a user to enter
 * 10 integers, then asks to find one of the integers,
 * and tells user at what index the integer is located.
 */
import java.util.*; 

public class BinarySearch{ 
  public static void main(String[] args){ 
       int[] intArray = new int[10]; 
       int searchValue = 0, index; 
       
       //User input
       System.out.println("Please enter 10 numbers"); 
       Scanner input = new Scanner(System.in); 
       
       for (int i = 0; i < intArray.length; i++){ 
               intArray[i] = input.nextInt(); 
       } 
       //Ask the user to enter a int to find
       System.out.print("Enter a number to search for: "); 
       searchValue = input.nextInt(); 
       index = binarySearch(intArray, searchValue); 
       
       if (index != -1){ 
               System.out.println("Found at index: " + index); 
       } 
       else{ 
               System.out.println("Not Found"); 
       } 
       
  } 
    static int binarySearch(int[] search, int find) 
   { 
           int start, end, midPt; 
           start = 0; 
           end = search.length - 1; 
            
           while (start <= end){ 
                   midPt = (start + end) / 2; 
                   
                   if (search[midPt] == find){ 
                           return midPt; 
                   } 
                    else if (search[midPt] < find){ 
                           start = midPt + 1; 
                    } 
                   else{ 
                           end = midPt - 1; 
                    } 
           } 
            return -1; 
   } 
}
