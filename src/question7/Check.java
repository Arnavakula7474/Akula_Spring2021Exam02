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
public class Check {
    Day day;
  
    // Constructor
    public Check(Day day)
    {
        this.day = day;
    }
  
    // Prints a line about Day using switch
    public void dayIsLike()
    {
        switch (day)
        {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }
}
