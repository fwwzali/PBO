/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLooping;

/**
 *
 * @author fawwaz
 */
public class JavaDoWhile {
    public static void main(String[] args) {
        
        
        int i = 0;
        
        do{            
            System.out.println("iteration - "+ (i+1) );
            i++;
        }
        while (i < 5);
        
        
        
        String[] name = {"andi","sarah","doni","fitri"};
        int j = 0;
        
        do{
            System.err.println("person "+ (j+1) +" is " + name[j] );
            j++;
        }
        while (j < name.length);
    }
}
