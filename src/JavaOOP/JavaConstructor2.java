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
public class JavaConstructor2 {
    String class_name;
    String description;

    public JavaConstructor2(String class_name, String description) {
        this.class_name = class_name;
        this.description = description;
    }

    public JavaConstructor2(String class_name) {
        this(class_name, null);
    }
   
    
    public JavaConstructor2(){
        this(null);
    }
    
    public void showInfo(){
        System.out.println("Class Name : "+this.class_name);
        System.out.println("Class Description : " + this.description+"\n------------------");
    }
    
}

//class main
class MainJavaConstructor2{
    public static void main(String[] args) {
        
        JavaConstructor2 constructor1 = new JavaConstructor2();
        
        JavaConstructor2 constructor2 = new JavaConstructor2("Kubus");
        
        JavaConstructor2 constructor3 = new JavaConstructor2("Kubus", "Class Kubus");
        
        constructor1.showInfo();
        constructor2.showInfo();
        constructor3.showInfo();
    }
}
