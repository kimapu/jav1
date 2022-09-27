package demo.lab10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner; 

public class Demo {

	//Scanner obj
    static Scanner scan = new Scanner(System.in);

    public static void show() {

    	final String PATH = "src/demo/lab10";
    	
    	System.out.println( "Enter filename with extension [i.e., narrative.txt]: " );
    	String fileName = scan.next();
    	
    	String fullPath = String.join("/", PATH, fileName);
    	
    	Document doc = new Document(fullPath);
    	
    	System.out.println( "\nFile "+ fileName + " has \n" + doc.chars() + " characters, " );
    	System.out.println( doc.word() +" words and " + doc.lines() +" lines." );
    	
        System.out.println("\n====================================");
        
    }
    

}

class Document
{
	private final File path;

	public Document(String path) {
		super();
		this.path = new File(path);
	}
	
    public int lines() {
    	try(BufferedReader reader = new BufferedReader(new FileReader(path)) ) {
			String line;
    		int count = 0;
    		while ( ( line = reader.readLine() )!=null ) {
				count++;
			}
    		return count;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
    }

    public int word() {
    	try(Scanner scan = new Scanner(new FileReader(path)) ) {
			int count = 0;
    		while ( scan.hasNext() ) {
				count++;
				scan.next();
			}
    		return count;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}	
	}
	
    public int chars() {
    	try(FileReader reader = new FileReader(path) ) {
    		int count = 0;
    		while ( reader.read() != -1 ) {
				count++;
			}
    		return count;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}