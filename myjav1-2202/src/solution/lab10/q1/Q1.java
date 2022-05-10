package solution.lab10.q1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Q1 {
	
	static public void show() {

    	final String PATH = "src/solution/lab10/q1";
    	final String fileName = "scores.txt";
    	
    	String fullPath = String.join("/", PATH, fileName);
		try {
			List<String> scoreLst = Files.readAllLines( Paths.get(fullPath) );
	    	
			IntSummaryStatistics stats = scoreLst.stream()
				.map( Integer :: parseInt )
				.mapToInt( Integer :: intValue )
				.summaryStatistics();
				
			System.out.println( "> Total: " + stats.getSum() );
			System.out.println( "> Average: "+ stats.getAverage() );
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
		System.out.println("====================================");
	}

}
