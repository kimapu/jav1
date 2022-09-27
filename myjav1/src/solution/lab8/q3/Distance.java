package solution.lab8.q3;

public class Distance {

	static private final double MILE_TO_KILO = 1.60934;
	static private final double KILO_TO_MILE = 0.621371;
	
	public static double toKilo(long mile)
	{
		return mile * MILE_TO_KILO;
	}
	
	public static double toMile(long kilo)
	{
		return kilo * KILO_TO_MILE;
	}
	
	
}
