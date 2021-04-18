/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author S542308
 */

public class FireMonster extends Monster {
   /** Constructs a FireMonster with the given name
     * @param name */
   public FireMonster(String name) {
      super(name);
   }
   /** Subclass provides actual implementation for attack()
     * @return  */
   @Override
   public String attack() {
      return "Attack with fire!"; 
   }
}