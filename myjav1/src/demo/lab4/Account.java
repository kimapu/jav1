package demo.lab4;

public class Account {
	/**
	 * Encapsulation concept
	 *  private keyword is used along with 
        public get/set method for each private field
        get/set methods can be defined as accessor/mutator methods
	 */
   
    
    //data / instance variable
    private int id;
    private double balance, annualInterestRate;
    
    private static String type;
    public static void setType(String type) {
        Account.type = type;
    }
    
    //operation
    public void withdraw(double amount){
        balance = getBalance() - amount;
    }
    
    public void deposit(double amount){
        balance = balance + amount;
    }
    
    public double getMonthlyInterestRate(){
        //insert your logic code...
        return annualInterestRate / 12;
    }
    
    public Account(){}
    
    public int getId(){
        return id;
    }
    
    public void setId( int id ){
        this.id = id;//this keyword means current obj instance
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public String toString() {
        return "Account object";
    }

}
