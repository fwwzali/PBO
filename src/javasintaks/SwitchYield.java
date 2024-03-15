/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasintaks;

/**
 *
 * @author fawwaz
 */
public class SwitchYield {
    
    public static void main(String[] args)
    {
        
        var pilihan_menu = "IG";
        
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
    }
}
