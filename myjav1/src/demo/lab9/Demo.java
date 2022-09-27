package demo.lab9;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Demo {
    
    public static void show() {
        
    	List<String> nameLst = new ArrayList<>();

    	System.out.println( ">> Reading is in progress..." );
    	
    	try {
    		TimeUnit.SECONDS.sleep(3);
			List<String> memberLst = Files.readAllLines( Paths.get("src/demo/lab9/memberLst.txt") );
			if ( memberLst.size() > 0 ) {
				for (String line : memberLst) {
					String[] token = line.split("\\,");
					nameLst.add( token[1] );
				}
			}
			
			System.out.println( "--- Member list ---" );
	    	disp(nameLst);
	    	
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	System.out.println("\nDone...");
		System.out.println("====================================");
    }
    
    static void disp( List<String> lst ) throws Exception
    {
    	System.out.println( "Total: "+ lst.size() );
    	for (String s: lst) {
    		TimeUnit.SECONDS.sleep(1);
			System.out.println( "> "+s );
		}
    }
    
}
