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
public class Square {
    
    //attribute / props
    private int sisi;
    private static int jumlah = 0;
    
    //method/function
    
    //setter
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    //getter
    public int getSisi(){
        return this.sisi;
    }

    
    public int hitungLuas()
    {
        return sisi*sisi;
    }
    
    public int hitungKeliling(){
        return 4*sisi;
    }
    
    //static
    public void addNew(){
        jumlah += 1;
    }
    
    public static int getJumlah(){
        return jumlah;
    }
    
    
}
