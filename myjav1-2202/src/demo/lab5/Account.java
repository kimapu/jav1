package demo.lab5;

public class Account {
    
    //tips:
       //Parent/general class contains "common members and implementation"..
    
    protected String number;
    protected double balance, rate;
    
    //this keyword means 'current object'
    public void deposit(double amount){
        this.balance += amount;
    }
    
    public void withdraw(double amount){
        //place your code logically
        this.balance -= amount;
    }
    
}
