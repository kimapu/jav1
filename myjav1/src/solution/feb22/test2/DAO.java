package solution.feb22.test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public abstract class DAO 
{
	
	private final String PATH_FOLDER;
	private final String PATH_FILE;
	protected Connection conn;

	public DAO(String pATH_FOLDER, String pATH_FILE) {
		super();
		PATH_FOLDER = pATH_FOLDER;
		PATH_FILE = pATH_FILE;
		connect( "jdbc:ucanaccess://"+ String.join("/", PATH_FOLDER, PATH_FILE) );
	}

	
	private void connect( String db ) 
	{
		try {
			conn = DriverManager.getConnection(db);
			System.out.println( PATH_FILE + " is connected!" );
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public abstract int addNew(String sql, String record);
	public abstract List<String> getAll(String sql);
	public abstract int update( String sql, String newLine );
	public abstract int remove( String sql, String id ); 
	
	
}
