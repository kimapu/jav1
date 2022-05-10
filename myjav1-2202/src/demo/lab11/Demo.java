package demo.lab11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
	
	static final String PATH_FOLDER = "src/demo/lab11";
	static final String PATH_FILE = "mydb.accdb";
	
	static Connection conn;
	
	static Scanner scan = new Scanner(System.in);
    public static void show() {
        
    	
    	int option;
    	do {
			System.out.println( "1) Connect to database" );
			System.out.println( "2) Add New" );
			System.out.println( "3) Get All" );
			System.out.println( "4) Update password" );
			System.out.println( "5) Delete" );
			System.out.println("Choose? [-99 to stop]");
    		option = scan.nextInt();
    		
			switch (option) {
			case 1:
				/**
				 * CONNECT TO DB
				 */
				connect( "jdbc:ucanaccess://"+ String.join("/", PATH_FOLDER, PATH_FILE) );
				break;
			case 2:{ 
				/*
				 * INSERT NEW RECORD
				 */
				if ( conn != null ) {
					System.out.println("\nEnter your username [WITHOUT SPACE]: ");
					String loginName = scan.next();
					System.out.println("Enter your password [WITHOUT SPACE]: ");
					String loginPin = scan.next();
					String sql1 = "INSERT INTO Username(LOGIN_NAME, PASSWORD) VALUES(?,?)";
					int row = Demo.addNew(sql1, String.join("|", loginName, loginPin));
					System.out.println( (row > 0) ? "\n> Record is updated successfully!" : "\\n> Record is not updated!" );
					
				} else {
					System.err.println("> Database not connected!");
				}
				break;
			}
			case 3: {
		    	/**
		    	 * SELECT RECORDS
		    	 */
				if ( conn != null ) {
					List<String> accountLst = Demo.getAll("SELECT * FROM Username");
					accountLst.stream()
						.forEach( System.out :: println );
					System.out.println( "\n>> Done!..." );	
				} else {
					System.err.println("> Database not connected!");
				}
				break;
			}
			case 4: {
				/**
				 * UPDATE RECORD
				 */
				if (conn != null) {
					String sql = "UPDATE Username SET PASSWORD=? WHERE LOGIN_NAME=?";
					System.out.println( "Enter your login name: " );
					String loginName = scan.next();
					System.out.println( "Enter new password: " );
					String pwd = scan.next();
					System.out.println( "Reenter new password" );
					String new_pwd = scan.next();
					
					if ( pwd.equals(new_pwd) ) {
						String newLine = String.join("|", loginName, pwd);
						int row = Demo.edit( sql, newLine );
						System.out.println( (row > 0) ? "\n> Record is updated successfully!" : "\n> Record is not updated!" );
					} else {
						System.err.println( "Password unmatached!" );
					}
					
				} else {
					System.err.println("> Database not connected!");
				}
				break;
			}
			case 5: {
				/**
				 * REMOVE RECORD
				 */
				if ( conn != null ) {
					String sql = "DELETE FROM Username WHERE LOGIN_NAME=? AND PASSWORD=?";
					System.out.println( "Enter your login name: " );
					String loginName = scan.next();
					System.out.println( "Enter your password: " );
					String pwd = scan.next();
					int row = Demo.delete(sql, loginName, pwd);
					System.out.println( (row > 0) ? "\n> Record is deleted successfully!" : "\n> Record not found!" );		
				} else {
					System.err.println("> Database not connected!");
				}
				break;
			}
			default:
				break;
			}
	
			System.out.println("\n---------------------");
    		
		} while (option != -99);

    	System.out.println("\nDone...");
		System.out.println("====================================");
    }

    /**
     * 
     * @param sql
     * @return
     */
    static private List<String> getAll(String sql)
	{
		List<String> lst = new ArrayList<>();
		
		try(PreparedStatement stmt = conn.prepareStatement(sql);) {
			ResultSet rs = stmt.executeQuery();
			while ( rs.next() ) {
				lst.add( String.join("|", rs.getString("LOGIN_NAME"), rs.getString("PASSWORD") ) );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}
    
    /**
     * 
     * @param sql
     * @param record
     * @return
     */
    static private int addNew(String sql, String record)
	{
		String[] split = record.split("\\|");
		int row = -1;
		if( split.length == 2 ) 
		{
			try( PreparedStatement stmt = conn.prepareStatement(sql) ) {
				stmt.setString(1, split[0]);
				stmt.setString(2, split[1]);
				row = stmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.err.println( ">> ERROR: Invalid operation!" );
		}
		return row;
	}
    
    /**
     * 
     * @param db
     */
	static private void connect( String db ) 
	{
		try {
			conn = DriverManager.getConnection(db);
			System.out.println( "> Database connected!" );
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    

	/**
	 * 
	 * @param sql
	 * @param loginName
	 * @param pwd
	 * @return
	 */
	static private int delete( String sql, String loginName, String pwd ) 
	{
		int row = -1;
		try( PreparedStatement stmt = conn.prepareStatement(sql) ) {
			stmt.setString(1, loginName);
			stmt.setString(2, pwd);
			row = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return row;
	}

	
	static private int edit( String sql, String newLine ) 
	{
		int row = -1;
		try( PreparedStatement stmt = conn.prepareStatement(sql) ) {
			String[] split = newLine.split("\\|");
			String loginName = split[0];
			String pwd = split[1];
			stmt.setString(1, pwd);
			stmt.setString(2, loginName);
			row = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return row;
	}
	
}
