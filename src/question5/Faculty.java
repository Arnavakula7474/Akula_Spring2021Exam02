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
public class Faculty extends Employee{
     private double officeHours;
     private int teachingSubjects;

    public Faculty(double officeHours, int teachingSubjects, String office, double salary, String dateHired, String name, String address, String phoneNumber, String emailId) {
        super(office, salary, dateHired, name, address, phoneNumber, emailId);
        this.officeHours = officeHours;
        this.teachingSubjects = teachingSubjects;
    }

    
    public double getOfficeHours() {
        return officeHours;
    }

    public int getTeachingSubjects() {
        return teachingSubjects;
    }

    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }

    public void setTeachingSubjects(int teachingSubjects) {
        this.teachingSubjects = teachingSubjects;
    }

    @Override
    public String toString() {
        return " Class Name : " + this.getClass().getSimpleName() + " and faculty Name : "+this.getName();
    }
    
}
