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

//Class Animal
class Animal{

    public Animal() {
        System.out.println("I am an Animal");
    }
    
    public void speak()
    {
        System.out.println("Hello");
    }   
    
}


//Class Bird -> child of Animal
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


//main Class
public class SingleInheritanceOverriding {
    //example single inheritance
    public static void main(String[] args) {
        //Animal
        Animal animal = new Animal();
        animal.speak();
        
        //Bird
        Bird bird = new Bird();
        bird.speak(); // methods from animal
        bird.fly();        
    }
}
