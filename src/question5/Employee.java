/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author S542308
 */
public class Employee extends Person {
    private String office;
    private double salary;
    private String dateHired;

    public Employee(String office, double salary, String dateHired, String name, String address, String phoneNumber, String emailId) {
        super(name, address, phoneNumber, emailId);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return " Class Name : " + this.getClass().getSimpleName() + " and employee Name : "+ this.getName();
    }
    
}

