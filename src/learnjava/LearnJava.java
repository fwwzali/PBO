/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author fawwaz
 */
public class LearnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");
        System.out.println("My Name is " + "Bima");
        
        //variable
        int a =  10;
        int b = 20;
        int c = a + b;
        String text = "Penjumlahan dari ";
        
        System.out.println(text + a + " dan " + b + " adalah " + c);
        
        //branching
        int angka_check = 11;
        
        if(angka_check % 2 == 0){
            System.out.println("Angka Genap");
        }
        else{
            System.out.println("Angka Ganjil");
        }
        
        //looping
        int tahun = 2020;
        
        System.out.println("List Tahun dari "+tahun);
        
        for(int i = tahun ; i <= 2024 ; i++){
            System.out.println("Tahun "+i);
        }
        
        
        String first = "Andi";
        String last = "Budiman";
        
        System.out.println("Nama : "+fullName(first, last));
        
        Square kotak1 = new Square();
        
        kotak1.setSisi(3);
        kotak1.addNew();
        System.out.println(kotak1.hitungLuas());
        System.out.println(kotak1.hitungKeliling());
        
        System.out.println("");
        
        Square kotak2 = new Square();
        
        kotak2.setSisi(9);
        kotak2.addNew();
        System.out.println(kotak2.hitungLuas());
        System.out.println(kotak2.hitungKeliling());
        
        System.out.println("");
        
        Square kotak3 = new Square();
        
        kotak3.setSisi(10);
        kotak3.addNew();
        System.out.println(kotak3.hitungLuas());
        System.out.println(kotak3.hitungKeliling());
        
        Square kotak4 = new Square();
        
        kotak4.setSisi(19);
        kotak4.addNew();
        System.out.println(kotak4.hitungLuas());
        System.out.println(kotak4.hitungKeliling());
        
        System.out.println("jumlah object kotak = "+ Square.getJumlah());
        
    }
    
    static String fullName(String fname, String lname)
    {
        return fname+" "+lname;
    }
    
    
}
