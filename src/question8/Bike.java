/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author S542308
 */
public abstract class Bike {
     Bike(){System.out.println("bike started");}  
   abstract void run();  
   void changeGear(){System.out.println("gear changed");
   }
}