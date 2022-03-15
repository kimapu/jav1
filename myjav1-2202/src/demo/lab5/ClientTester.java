package demo.lab5;

public class ClientTester {

    public static void main(String[] args) {
        
        Savings savings = new Savings();
        
        savings.balance = 20000;
        System.out.println( savings.balance );
        
        //deposit 10000
        savings.deposit(10000);
        System.out.println("\nNew balance: " + savings.balance);

        System.out.println( "\nDone..." );
        
    }
    
}
