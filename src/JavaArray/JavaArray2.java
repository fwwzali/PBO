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
public class JavaArray2 {
    
    public static void main(String[] args)
    {
        //deklarasi array & inisialisasi
        int[] deretAngka = new int[]{1,2,3};
        
        //mengambil informasi panjang array
        int panjang_arr = deretAngka.length;
        
        System.out.println("Array dengan panjang "+panjang_arr+" dengan sisi:");
        
        for(int item : deretAngka){
            //akses array
            System.out.println(item);
        }
        
        
        
    }
    
}
