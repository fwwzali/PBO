/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMethod;

/**
 *
 * @author fawwaz
 */
public class MethodVoid {
    public static void main(String[] args){
        String first_name = "Heru";
        String last_name = "Heri";
        
        //call methods
        greetings(first_name);
        getFullName(last_name, last_name);
   
    }
    
    
    public static void greetings(String name){
        //not return value
        System.out.println("Hello, "+name);
    }
    
    public static void getFullName(String fname, String lname)
    {
        //not rtuen value
        System.out.println("My Name "+fname+" "+lname);
    }
}
