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
public class Loan {
    private String personName;
    private double amount;
    private double interestRate;

    public Loan(String personName, double amount, double interestRate) {
        this.personName = personName;
        this.amount = amount;
        this.interestRate = interestRate;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "person name is : " + personName + ", amount taken = " + amount + ", interestRate is  : " + interestRate;
    }
    
}
