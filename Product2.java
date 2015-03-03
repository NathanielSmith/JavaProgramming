/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natejavaprojects;

/**
 *
 * @author Nathaniel D. Smith, NetBeans
 * Date: 3/3/15
 * Program that calculates and prints the product of three integers, but this
 * time without JFrames and Swing
 */
import java.util.Scanner;

public class Product2 {
    
    public static void main(String[] args){
    //create Scanner to obtain the input form user
    Scanner input = new Scanner(System.in);
    
        int x; // first number
        int y; //second number
        int z; //third number
        int result; //product of numbers
        
        System.out.print("Enter the first integer: ");
        x = input.nextInt();// reads first int
        
        System.out.print("Enter the second integer: ");
        y = input.nextInt();// reads second int
        
        System.out.print("Enter the third integer: ");
        z = input.nextInt();// reads third int
        
        result = x * y * z; //calculates product of numbers
        
        System.out.printf("Product is %d\n", result);
    
    }
}
