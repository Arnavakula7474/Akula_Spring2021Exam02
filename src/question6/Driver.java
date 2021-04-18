/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the three sides");
        double len = scan.nextDouble();
        double height = scan.nextDouble();
        double width = scan.nextDouble();
        System.out.println("Enter the color");
        String color = scan.next();
        System.out.println("Enter true or false to know the circle is filled or not");
        boolean filled = scan.nextBoolean();
        Triangle triangle = new Triangle(len,height,width,color,filled);
        System.out.println("Perimeter of triangle is: "+triangle.perimeter());
        System.out.println("Area of triangle is: "+String.format("%.2f", triangle.area()));   
        System.out.println("Color is: "+triangle.getColor());
        if(filled){
            System.out.println("Cirlce is filled");
        }
        else{
            System.out.println("Cirlce is not filled");
        }
    }
    
}
