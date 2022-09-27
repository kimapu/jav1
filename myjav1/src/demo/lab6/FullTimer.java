package demo.lab6;

public class FullTimer extends Staff{
    
    public FullTimer(){}

    @Override
    public void calcSalary() {
        //place your logic code here...
        if (super.workload >= 40) {
            super.salary = 3000;
        }
    }
    
}
