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
public class JavaFor {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            System.out.println("iteration - "+ (i+1) );
        }
        
        String[] name = {"andi","sarah","doni","fitri"};
        
        for (int j = 0; j < name.length; j++) {
            System.err.println("person "+ (j+1) +" is " + name[j] );
        }
    }
}
