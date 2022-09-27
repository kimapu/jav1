package solution.lab6.q4;

import java.util.Comparator;

public class DobComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getDob().compareTo(o2.getDob());
	}
	
}
