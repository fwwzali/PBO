/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOPinheritance;

/**
 *
 * @author fawwaz
 */

//class Animal
class Animal{

    public Animal() {
        System.out.println("I am an Animal");
    }
    
    public void speak()
    {
        System.out.println("Hello");
    }   
    
}


//class Bird -> child class of Animal
class Bird extends Animal 
{

    public Bird() {
        //access parent's constructor
        super();
        System.out.println("I am Bird");
    }
    
    //override parent methods
    //redefining methods
    @Override
   public void speak()
   {
       System.out.println("Crip.. Crip...");
   }
    
    public void fly()
    {
        System.out.println("I am flying");
    }
}


//Class Pinguin -> child class of Bird
class Pinguin extends Bird
{
    //override parent methods
    @Override
    public void fly()
    {
        System.out.println("No Thanks, I'd rather swimming");
    }
}


//Class Main
public class MulitilevelInheritance {
    //example single inheritance
    public static void main(String[] args) {
        //Animal
        Animal animal = new Animal();
        animal.speak();
        
        //Bird
        Bird bird = new Bird();
        bird.speak(); // methods from animal
        bird.fly();    
        
        //Pinguins
        Pinguin pinguin = new Pinguin();
        pinguin.speak();
        pinguin.fly();
    }
}
