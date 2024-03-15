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
public class Kubus {
    //attribute
    public int sisi;
    //static attribute is variable class
    private static int jumlah=0;
    
    public Kubus(){}
    
    public Kubus(int sisi)
    {
        this.sisi = sisi;
    }
    
    //methods
    //getter
    public int getSisi(){
        return this.sisi;
    }
    
    //setter
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    public void addKubus(){
        jumlah += 1;
    }
    
    //get track number of object created
    public static int getJumlah(){
        return jumlah;
    }
}
