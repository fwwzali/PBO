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
public class JavaWhile {
    public static void main(String[] args) {
        
        int i = 0;
        while (i < 5) {            
            System.out.println("iteration - "+ (i+1) );
            i++;
        }
        
        String[] name = {"andi","sarah","doni","fitri"};
        int j = 0;
        while (j < name.length) {
            System.err.println("person "+ (j+1) +" is " + name[j] );
            j++;
        }
    }
}
