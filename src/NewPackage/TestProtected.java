/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPackage;

/**
 *
 * @author fawwaz
 */
public class TestProtected {
    
    public static void main(String[] args){
        
        //var keyword
        //mulai java 10
        var nama = "Sudemo Sukamto";
        System.out.println(nama);
        
        //keyword final
        final float phi = 3.14F;
        //error
        //phi = 7.5;
        
        //penulisan angka
        var balance = 1_000_000;
        
        //ternary operator
        int a = 10;
        int b = 11;
        
        String test = a > b ? "Lebih Besar" : "Lebih Kecil";
        
        System.out.println(test);
        
        //for-each loop
        int[] angka = {1,2,3,4,5,6,7,8,9,10};
        
        for(int item : angka){
            System.out.print(item+", ");
        }
        
        //switch expression with lambda
        //mulai java 14
        
        var pilihan_menu = "IG";
        
        switch(pilihan_menu)
        {
            case "M" -> System.out.println("Mie Ayam");
            case "S" -> System.out.println("Soto");
            case "A" -> System.out.println("Ayam Geprek");
            case "IG","IK" ->System.out.println("Indomie Goreng / Kuah");
            default -> System.out.println("Pilihan Tidak Ada di Menu");
        }
        
        //switch case with yield
        String menu_dipilih = switch(pilihan_menu)
        {
            case "M" : yield "Mie Ayam";
            case "S" : yield "Soto";
            case "A" : yield "Ayam Geprek";
            case "IG","IK" : yield "Indomie Goreng / Kuah";
            default : yield "Pilihan Tidak Ada di Menu";  
        };
        
        System.out.println("Menu yang dipilih : "+menu_dipilih);
        
        //array
        
        
    }
    
}
