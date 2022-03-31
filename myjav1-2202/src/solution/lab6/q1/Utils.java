package solution.lab6.q1;

public class Utils {

	static public Object max( Comparable[] a )
	{
		Comparable max = a[0];
		for (int i = 1; i < a.length; i++) {
			if( a[i].compareTo( max ) > 0 )
				max = a[i];
		}
		return max;
	}
}
