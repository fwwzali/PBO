/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMethod;

/**
 *
 * @author fawwaz
 */
public class MethodWithReturn {
    
    public static void main(String[] args){
        
        
        //call methods
        System.out.println("Area = "+calculateArea(9, 4));
        
        System.out.println("Multply = "+multiply(5, 6));
   
    }
    
    
    public static int calculateArea(int width, int length){
        return width * length;
    }
    
    public static int multiply(int number, int factor)
    {
        int result = 0;
        for(int i=0; i < factor; i++)
        {
            result += number;
        }
        
        return result;
    }
    
}
