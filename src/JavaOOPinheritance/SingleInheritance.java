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


//class Bird -> child of Animal
class Bird extends Animal 
{
    public void fly()
    {
        System.out.println("I am flying");
    }
}

public class SingleInheritance {
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
