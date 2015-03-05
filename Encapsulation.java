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
 */
public class Encapsulation {
    private String manufacturer;
    private String OpSys;
    public String model;
    private int cost;
    
    //Constructor 
    Encapsulation(String manufact, String OperSys, String mod, int cst){
        
        this.manufacturer = manufact;
        this.OpSys = OperSys;
        this.model = mod;
        this.cost = cst;
    }
    
    public String getModel(){
        return this.model;
    }
    
    public String getManufacturer(){
        return this.manufacturer;
    }
    
    public int getcost(){
        return this.cost;
    }
    
    public String getOperatingSystem(){
        return this.OpSys;
    }
    
    public static void main(String[] args){
        Encapsulation encap = new Encapsulation("Linux",
        "CentOS", "2014", 500);
        
        System.out.println("Manufacturer: " + encap.getManufacturer()); 
        System.out.println("OS: " + encap.getOperatingSystem()); 
        System.out.println("Model: " + encap.getModel()); 
        System.out.println("Cost: " + encap.getcost()); 
        
    }
}
