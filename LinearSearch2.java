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
 * Simple Linear Search that checks if an element is present
 * in the given list, then compare search element with every element
 * in the list. If the number is found, then success, otherwise
 * the list doesn't contain the element we are searching.
 */
import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args){
        int i, n, search, array[];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of elements: ");
        n = sc.nextInt();
        array = new int[n];
        
        System.out.println("Enter " + n + " intergers");
        
        for (i = 0; i<n; i++)
            array[i] = sc.nextInt();
        
        System.out.println("Now enter value to find: ");
        search = sc.nextInt();
        
        for(i = 0; i<n; i++){
            if(array[i] == search){
                System.out.println(search + " is here at index " + (i+1) + ".");
                break;
            }
        }
        if(i==n)
            System.out.println(search + " is not here in array.");  
    }
}
