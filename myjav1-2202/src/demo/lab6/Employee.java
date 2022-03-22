package demo.lab6;

public abstract class Employee {
    
    protected int workload;
            
    //constructor- instantiate the object of Employee
    //In Java, compiler would insert a default constructor to the class
        //IMPLICITLY
    //no-arg constructor
    public Employee() {
    }
    
    //getset methods
    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }
    
    
}
