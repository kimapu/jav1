package solution.lab6.q4;

import java.util.Comparator;

public class AgeComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		if( o1.getAge() > o2.getAge() )
			return 1;
		else if( o1.getAge() < o2.getAge() )
			return -1;
		else
			return 0;
	}

}
