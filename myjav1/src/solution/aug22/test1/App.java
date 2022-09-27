package solution.aug22.test1;

public class App {

}

class Customer{
	private Membership membership;
	public long id;
	public String name, emaillAddr, telNo;
	
	public Customer() {
	}

	public void create() {}
	public int modify() { return 0; }
	public int remove() { return 0; }
	public String[] getAll() { return null; }
	public String getById(long id) { return Long.toString(id); }
	
	
	public Membership getMembership() {
		return membership;
	}

	public void setMembership(Membership m) {
		this.membership = m;
	}

	@Override
	public String toString() {
		return "Customer [membership=" + membership + ", id=" + id + ", name=" + name + ", emaillAddr=" + emaillAddr
				+ ", telNo=" + telNo + "]";
	}
	
	
}

abstract class Membership{
	protected long id;
	protected String name;
	protected double tax;
	
	public Membership() {}

	@Override
	public String toString() {
		return "Membership [id=" + id + ", name=" + name + ", tax=" + tax + "]";
	}
}

class Premium extends Membership implements Discountable{
	public final double DISOUCNT_RATE = 0.30;

	@Override
	public double calcDiscount() {
		return getRate();
	}

	@Override
	public double getRate() {
		return this.DISOUCNT_RATE;
	}
}

class General extends Membership implements Discountable{
	public final double DISOUCNT_RATE = 0.10;

	@Override
	public double calcDiscount() {
		return getRate();
	}

	@Override
	public double getRate() {
		return this.DISOUCNT_RATE;
	}
}

class Basic extends Membership{

	public Basic() {
		super();
	}
	
}

interface Discountable{
	double calcDiscount();
	double getRate();
}