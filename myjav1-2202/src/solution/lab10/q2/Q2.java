package solution.lab10.q2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q2 {

	static Scanner scan = new Scanner(System.in);
	
	static public void show() {

		final String PATH = "src/solution/lab10/q2";
    	final String dataFileName = "datafile.txt";
    
    	try {
		
    		List<String> lineLst = Files.readAllLines( Paths.get( String.join("/", PATH, dataFileName) ) );
    		System.out.println( "\n--- DATA FILE ["+ dataFileName +"] ---" );
    		lineLst.forEach( System.out :: println );
    		
     		
    		System.out.println( "\n\nEnter string to remove: " );
    		String str2Remove = scan.next();
        	
    		System.out.println( "Enter new filename [e.g., export.txt]: " );
    		String toFile = scan.next();
    		
    		List<String> newLineLst = lineLst.stream()
    				.map( elem -> elem.replaceAll(str2Remove, "") )
    				.collect(Collectors.toList());
    		
    		System.out.println();
    		System.out.println( "\n--- DATA FILE ["+ toFile +"] ---" );
    		
    		//newLineLst.forEach( System.out :: println );
    		newLineLst
    			.forEach( elem -> {
					try {
						String newLine = elem + System.lineSeparator();
						Files.write( Paths.get( String.join("/", PATH, toFile) ), newLine.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
					} catch (IOException e) {
						e.printStackTrace();
					}
				} );
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
		System.out.println("====================================");
	}

}
