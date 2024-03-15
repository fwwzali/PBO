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
public class MultidimensionalArray {
    
    public static void main(String[] args)
    {
        String[][] mahasiswa = {
            {"202001", "Dini Andini"},
            {"202002", "Wawan Winarno"},
            {"202003", "Gigi Gunawan"},
        };
        
        System.out.println("NPM\tNama");
        System.out.println(mahasiswa[0][0]+"\t"+mahasiswa[0][1]);
        System.out.println(mahasiswa[1][0]+"\t"+mahasiswa[1][1]);
        System.out.println(mahasiswa[2][0]+"\t"+mahasiswa[2][1]);
        
        System.out.println("NPM\tNama");
        
        //loop with for-each / enhance loop
        for(String[] item : mahasiswa){
            for(String data : item){
                System.out.print(data+"\t");
            }
            System.out.println("");
        }
               
    }
}
