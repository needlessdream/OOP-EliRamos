/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopactivity;

/**
 *
 * @author Eliseo Teuz
 */
public class ape extends primate implements climber{
     public ape(String name, int age, double weight) {
        super(name, age, weight);
     }
     @Override
     public void makeSound() {
    System.out.println("The "+ name +" makes noise");
  }
     @Override
      public void eat() {
    System.out.println("The "+ name +" is eating"); 
  }
     @Override
     public void sleep() {
    System.out.println("The "+ name +" is sleeping");
   
  }
      @Override
     public void climb() {
    System.out.println("The "+ name +" is climbing");
  }
}
