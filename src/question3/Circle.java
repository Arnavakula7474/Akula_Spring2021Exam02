/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author S542308
 */
public class Circle {
    private double radius;
    private double area;

    public Circle(double radius, double area) {
        this.radius = radius;
        this.area = area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "radius=" + radius + ", area=" + area ;
    }
    
    
}
