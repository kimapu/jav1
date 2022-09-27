package demo.lab6;

public abstract class Staff extends Employee implements Payable {

    protected double salary;
    
    //default constructor is automatically provided by the Java compiler 
        //to the Staff class, although we dont write one for it..

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
