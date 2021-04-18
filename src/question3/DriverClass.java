/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author S542308
 */
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList list = new ArrayList();
        Loan loan = new Loan("Ravi Teja",300000,9.3);
        Date date = new Date();
        Circle circle = new Circle(3,9);
        String string = new String("Remember, this is a string");
        list.add(loan);
        list.add(date);
        list.add(circle);
        list.add(string);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
    
}
