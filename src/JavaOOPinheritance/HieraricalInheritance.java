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
class Animal
{
    String name;

    public Animal() {
        System.out.println("I am an Animal");
    }
    
    public void speak()
    {
        System.out.println("Hello");
    }
    
}

//class Bird -> child class of Animal
class Bird extends  Animal
{

    public Bird() {
        super();
        name = "Bird";
        System.out.println("I am a "+name);
    }
    
    @Override
    public void speak()
    {
        System.out.println("Chrip.. Chrip..");
    }
    
    public void fly()
    {
        System.out.println("I am flying");
    }
    
}

//class Cat -> child class of Animal
class Cat extends Animal
{

    public Cat() {
        super();
        name = "cat";
        System.out.println("I am a "+name);
    }
    
    @Override
    public void speak()
    {
        System.out.println("Meow...");
    }
    
}

//Class Main

public class HieraricalInheritance {
    public static void main(String[] args) {
        //object animal
        Animal animal = new Animal();
        animal.speak();
        
        //object bird
        Bird bird = new Bird();
        bird.speak();
        
        //object cat
        Cat cat = new Cat();
        cat.speak();
        
        
    }
}
