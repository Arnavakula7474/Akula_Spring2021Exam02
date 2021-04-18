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
public class WaterMonster extends Monster {
   /** Constructs a WaterMonster instance with the given name
     * @param name */
   public WaterMonster(String name) {
      super(name);
   }
   /** Subclass provides actual implementation for attack()
     * @return  */
   @Override
   public String attack() {
      return "Attack with water!";
   }
}
