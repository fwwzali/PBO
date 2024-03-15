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
public class JavaIf {
    
    public static void main(String[] args)
    {
        //check odd or even number
        var number = 70;
        
        if(number % 2 == 0 )
            System.out.println("number "+number+" is even number");
        else
            System.out.println("number "+number+" is odd number");
        
        //catagorize a points
        var points = 70;
        
        if (points >= 80) {
            System.out.println("You are excellent");
        }
        else if (points < 80 && points > 50) {
            System.out.println("You are good");
        }
        else{
            System.out.println("Sorry, Try again");
        }
        
    }
}
