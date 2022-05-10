package solution.lab10.q3;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Q3 {

	static Scanner scan = new Scanner(System.in);

	static public void show() {
	
		final String PATH = "src/solution/lab10/q3";
    	final String dataFileName = "ints.txt";

    	String fullPath = String.join("/", PATH, dataFileName);

    	if ( !new File(fullPath).exists() ) {
    		
    		try {

        		File txtFile = new File(fullPath);
        		System.out.println( (!txtFile.createNewFile()) ? dataFileName +" not created!" : dataFileName +" created!" );
    			
			} catch (Exception e) {
				e.printStackTrace();
			}
    		
		} else {
			Random rand = new Random();
			System.out.println( "\n--- RANDOM NUMBER GENERATOR ---" );
			System.out.println( "\n> Writing is being processed..." );

			rand.ints(10).forEach( n -> {
				System.out.println( n );
				try {
					TimeUnit.SECONDS.sleep(1);
					Files.write( Paths.get(fullPath), String.valueOf(n).concat(System.lineSeparator()).getBytes() , StandardOpenOption.APPEND);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} );
			System.out.println( "\n> Writing complete!" );
			
		}
    	
    	System.out.println( "\n> Do you want to view updated data file [yes/no]? " );
    	if ( scan.next().equalsIgnoreCase("yes") ) {
			try {
				System.out.println( "\n\n> --- UPDATED DATA FILE ---" );
				Files.readAllLines(Paths.get(fullPath)).forEach( System.out :: println );
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
    	
		System.out.println("====================================");
	}
}
