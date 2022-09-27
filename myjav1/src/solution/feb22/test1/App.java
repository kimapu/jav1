package solution.feb22.test1;

import java.text.DecimalFormat;

public class App {

	public static void main(String[] args) {

		Invoice pymt1 = new CardPay( "alibaba", 1000.0 );
		pymt1.compute();
		Invoice pymt2 = new CashPay( "billgates", 1990.0, 2000.0 );
		pymt2.compute();
		SaleOrder sale1 = new SaleOrder( pymt1 );
		SaleOrder sale2 = new SaleOrder( pymt2 );
	
		System.out.println( sale1 );
		System.out.println( sale2 );
		
	}

}

class SaleOrder
{
	public Invoice pymt;

	public SaleOrder(Invoice pymt) {
		super();
		this.pymt = pymt;
	}

	@Override
	public String toString() {
		return "SaleOrder [pymt=" + pymt + "]";
	}

	
	
}

abstract class Invoice implements Payable 
{
	DecimalFormat df = new DecimalFormat("$##.##");
	
	protected String name;
	protected double totalAmount;
	protected double gstTax;
	
	public Invoice(String name, double amount) {
		super();
		this.name = name;
		this.totalAmount = amount;
	}

	@Override
	public String toString() {
		return "Invoice [name=" + name + ", totalAmount=" + totalAmount + "]";
	}
	
}

class CardPay extends Invoice
{
	private final double TAX = 0.1;
	private double serviceTax;
	
	public CardPay(String name, double amount) {
		super(name, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double compute() {
		super.gstTax = super.totalAmount * super.GST;
		this.serviceTax = super.totalAmount * TAX;
		super.totalAmount += (gstTax+serviceTax);
		return 0;
	}

	@Override
	public String toString() {
		return "CardPay [name="+ super.name +", totalAmount=" + df.format(totalAmount) + ", gstTax="
				+ df.format(gstTax) + ", serviceTax=" + df.format(serviceTax) + "]";
	}
	
}

class CashPay extends Invoice
{
	private double change;
	private double tenderAmt;
	
	public CashPay(String name, double amount, double tenderAmt) {
		super(name, amount);
		this.tenderAmt = tenderAmt;
	}

	@Override
	public double compute() {
		super.gstTax = super.totalAmount * super.GST;
		super.totalAmount += gstTax;
		this.change = this.tenderAmt - super.totalAmount;
		return 0;
	}

	@Override
	public String toString() {
		return "CashPay [name="+ super.name +", totalAmount=" + df.format(totalAmount) + ", tenderAmt=" + df.format(tenderAmt) + ", gstTax=" + df.format(gstTax) + "]";
	}
	
}

interface Payable
{
	double GST = 0.06;
	double compute();
}