/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopactivity;

/**
 *
 * @author Eliseo Teuz
 */
 abstract class animal {
   public String name;
   public int age;
   public double weight;
    public animal(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    
     abstract void makeSound();
     
    abstract void eat();
       
    abstract void sleep();
     
}
