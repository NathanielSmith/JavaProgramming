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
 * Enumeration Sort, uses a random generated integers
 * and then puts them in order from smallest to largest.
 */
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;
import java.util.List;
import java.util.Random;

public class EnumerationSort {
    
    public static void main(String[] args){
        
        //Makes random data for sorting source
        //Using Vector to store random int generator
        
        Random random = new Random();
        Vector<Integer>data = new Vector<Integer>();
        
        for(int i = 0; i<10; i++){
            data.add(Math.abs(random.nextInt()));     
        }
        
        //Now recieve the Enum for vector
        Enumeration enumeration = data.elements();
        List<Integer>list = Collections.list(enumeration);
        Collections.sort(list);
        
        //Print out gen nums after sorted
        list.stream().forEach((Integer number) -> {
            System.out.println("number = " + number);
        });
    }
}
