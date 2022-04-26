package solution.lab9.q4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q4 {

	public static void show()
	{

		try {
			List<String> essayLine = Files.readAllLines( Paths.get("src/solution/lab9/q4/essay.txt") );
			
			System.out.println( "> Essay..." );
			essayLine.forEach( System.out :: println );
			
			System.out.println("\n> Sorted word list:");
			essayLine.stream().map( elem -> {
				elem = elem.replaceAll("[,.]", "").toLowerCase();
				String[] token = elem.split("\\s");
				List<String> lst = new ArrayList<>();
				Arrays.stream(token).forEach( e -> lst.add(e) );
				Collections.sort(lst);
				return lst;
			} ).forEach( System.out :: println );
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("====================================");
	}
}
