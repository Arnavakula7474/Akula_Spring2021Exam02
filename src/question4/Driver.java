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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monster m1 = new FireMonster("r2u2");   // upcast
        Monster m2 = new WaterMonster("u2r2");  // upcast

        // Invoke the actual implementation
        System.out.println(m1.attack());  // Run FireMonster's attack()
        //Attack with fire!
        System.out.println(m2.attack());  // Run WaterMonster's attack()
        //Attack with water!

        Monster m4 = new Monster("u2u2");
        System.out.println(m4.attack());
    }

}
