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
public class MainKubus {
    
    public static void main(String args[]){
        
        Kubus kubus1 = new Kubus();
        kubus1.setSisi(7);
        kubus1.addKubus();
        Kubus kubus2 = new Kubus(8);
        kubus2.addKubus();
        Kubus kubus3 = new Kubus(10);
        kubus3.addKubus();
        Kubus kubus4 = new Kubus(14);
        kubus4.addKubus();
        
        System.out.println("Jumlah kubus saat ini = " + Kubus.getJumlah());
        
    }
    
}
