package demo.lab6;

public class PartTimer extends Staff{
    
    //IF--- I say I provide a different version of constructor
        //... this takes an input argument
    
    //Unlike, no-arg constructor...
    public PartTimer( int workload ){
        super.workload = workload;
    }
        
    //Apparently, a default/no-arg constructor is needed
    //public PartTimer(){}

    @Override
    public void calcSalary() {
        //place your logic code here...
        super.salary = super.workload * 5;
    }
}
