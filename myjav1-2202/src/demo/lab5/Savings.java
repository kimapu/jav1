package demo.lab5;

//inheritance relationship- extends
    //can also be defined as 'is-a-kind-of' relationship
//Savings 'is-a-kind-of' Account
public class Savings extends Account{
 
    public Savings(){}
    
    //we can override the method deposit/withdraw to the Parent class's
        //this happen when you'r having a requirement for deposit/withdraw in 
            //savings class
    @Override //overriding method
    public void withdraw(double amount){
        if( amount > super.balance ){
            System.out.println("Insufficient fund!");
        }else{
            super.withdraw(amount);
        }
    }

    //overloading method
    public void withdraw(String amount){
    	double amt = Double.parseDouble(amount);
        this.withdraw(amt);
    }
    
    
    //Another mechanism for implementing polymorhism
        //overloading method...
    
}
