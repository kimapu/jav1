package solution.lab9.q3;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Q3 {

	public static void show()
	{
		Set<String> nameLst = new LinkedHashSet<>();
		try {
			
			List<String> userLst = Files.readAllLines( Paths.get("src/solution/lab9/q3/Username.txt") );
			for (String user : userLst) {
				String split[] = user.split("\\;");
				Name name = new Name(split[4], split[5]);
				nameLst.add( name.getFullName() );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			nameLst.stream().sorted().forEach( System.out :: println );
		}
		System.out.println("====================================");
	}

}
