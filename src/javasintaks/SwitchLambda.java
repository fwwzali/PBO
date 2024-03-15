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
public class SwitchLambda {
    
    public static void main(String[] args)
    {
        
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
    }
}
