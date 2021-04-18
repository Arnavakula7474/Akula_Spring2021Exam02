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
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person person = new Person("Arnav","1324 West ParkStreet","2637392028","text@gmail.com");
        Student student = new Student("D", "Pant","1334 East ParkStreet","2837492729","text2@gmail.com");
        Employee employee = new Employee("Managing office",1230,"10-23-2009","Venkat","1304 South ParkStreet","6543456787","text3@gmail.com");
        Faculty faculty = new Faculty(7,4,"Humanities Dept",2346,"10-17-2010","Varun","1344 North ParkStreet","6338391919","text4@gmail.com");
        Staff staff = new Staff("Professor","Criminology",1890,"06-03-2005","Sandhya Rani","1354 West ParkStreet","3646474848","text5@nomail.com");
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
    
}
