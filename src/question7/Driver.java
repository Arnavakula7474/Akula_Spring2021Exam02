/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

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
        String str = "TUESDAY";
        Check check1 = new Check(Day.valueOf(str));
        check1.dayIsLike();
    }
    
}
