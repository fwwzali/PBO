/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP;

/**
 *
 * @author fawwaz
 */
public class JavaConstructor {
    
    //attribute
    String class_name;
    int number_of_class;
    
    //default constructor
    public JavaConstructor() {
    }
    
    public JavaConstructor(String class_name)
    {
        //variable shadowing
        //menggunakan nama varaible yang sama dengan scope yang berbeda
        this.class_name = class_name;
    }
    
    public JavaConstructor(int number_of_class)
    {
        this.number_of_class = number_of_class;
    }

    public JavaConstructor(String class_name, int number_of_class) {
        this.class_name = class_name;
        this.number_of_class = number_of_class;
    }
    
    public void showInfo(){
        System.out.println("------------------\nClass Name : "+this.class_name);
        System.out.println("Number of Class : " + this.number_of_class+"\n------------------");
    }
        
}

//class main
class MainJavaConstructor{
    public static void main(String[] args) {
        
        JavaConstructor constructor1 = new JavaConstructor();
        
        JavaConstructor constructor2 = new JavaConstructor("Kubus");
        
        JavaConstructor constructor3 = new JavaConstructor(5);
        
        JavaConstructor constructor4 = new JavaConstructor("Kubus", 5);
        
        constructor1.showInfo();
        constructor2.showInfo();
        constructor3.showInfo();
        constructor4.showInfo();
    }
}
