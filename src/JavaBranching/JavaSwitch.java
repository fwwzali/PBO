/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBranching;

/**
 *
 * @author fawwaz
 */
public class JavaSwitch {

    public static void main(String[] args) {
        
        var pilihan_menu = "IG";
        
        System.out.println("Menu yang dipilih ");
        
        switch(pilihan_menu)
        {
            case "M" :
                System.out.println("Mie Ayam");
                break;
            case "S" : 
                System.out.println("Soto");
                break;
            case "A" :
                System.out.println("Ayam Geprek");
                break;
            case "IG" :
                System.out.println("Indomie Goreng");
                break;
            case "IK" :
                System.out.println("Indomie Kuah");
                break;
            default : 
                System.out.println("Pilihan Tidak Ada di Menu");
                break;
        }
        
        
    }
}
