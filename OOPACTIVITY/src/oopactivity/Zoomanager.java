/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopactivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Eliseo Teuz
 */
public class Zoomanager{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try  (Scanner scanner = new Scanner(System.in)) {
            List<animal> animals = new ArrayList<>();
             boolean exit = false;
            
            while (!exit) {
             System.out.println("What would you like to do:");
             System.out.println("[1] add an animal");
             System.out.println("[2] view all animals");
             System.out.println("[3] animal behavior simulation");
             System.out.println("[4] Exit");
             
             
        int action = scanner.nextInt();
            switch(action){
                case 1:
            // User input to create animals
            System.out.println("Enter the number of animals:");
            int numAnimals = scanner.nextInt();
            scanner.nextLine(); // consume newline
            for (int i = 0; i < numAnimals; i++) {
                System.out.println("Enter animal type (Mammal/Bird/fish/reptile):");
                String type = scanner.next();
                
                System.out.println("Enter name:");
                String name = scanner.next();
                
                System.out.println("Enter age:");
                int age = scanner.nextInt();
                
                System.out.println("Enter weight:");
                double weight = scanner.nextDouble();
                
                if (type.equalsIgnoreCase("Mammal")) {
                    animals.add(new mammal(name, age, weight));
                } else if (type.equalsIgnoreCase("Bird")) {
                    animals.add(new bird(name, age, weight));
                }else if (type.equalsIgnoreCase("Fish")) {
                    animals.add(new fish(name, age, weight));
                }else if (type.equalsIgnoreCase("Reptile")){
                    animals.add(new reptile(name, age, weight));
                }
            }
    break;
    
                case 2:
                     System.out.println("All animals in the zoo:");
                    for (animal animal : animals) {
                        System.out.println(animal.name);
                    }
                    break;
               
                  
                    
                case 3:
                     for (animal animal : animals) {
                animal.makeSound();
                animal.eat();
                animal.sleep();
                
                // Additional behaviors based on type
                if (animal instanceof flyable) {
                    ((flyable) animal).fly();
                }
                if (animal instanceof swimmable) {
                    ((swimmable) animal).swim();
                }
            }
                      break;
                      
                     case 4:
                        exit = true;
                        System.out.println("Exiting the Zoo Manager. Goodbye!");
                        break;
                        
                    default:
                        System.out.println("Invalid option. Please choose again.");
                        break;
            }
            }   
           
        }
  
   
    }
}

