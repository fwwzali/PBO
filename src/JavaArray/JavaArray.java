/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaArray;

/**
 *
 * @author fawwaz
 */
public class JavaArray {
    
    public static void main(String[] args)
    {
        //deklarasi array
        //#1
        int[] deretAngka;
        deretAngka = new int[3];
        
        //#2
        int[] barisAngka = new int[3];
        
        //inisialisasi array
        deretAngka[0] = 1;
        deretAngka[1] = 2;
        deretAngka[2] = 3;
        
        //akses array
        System.out.println(deretAngka[1]);
    }
    
}
