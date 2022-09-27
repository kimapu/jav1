package solution.lab11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataAccess {
	protected static Connection conn;
	
	protected final String db;
	
	public DataAccess(String db) {
		this.db = db;
		/**
		 * CONNECT TO DB
		 */
		connect( "jdbc:ucanaccess://"+ String.join("/", Constant.PATH_FOLDER, db) );
	}


	/**
     * 
     * @param db
     */
	protected void connect( String db ) 
	{
		try {
			conn = DriverManager.getConnection(db);
			System.out.println( "> Database connected!" );
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected ResultSet executeQuery( String sql ) {
		try(PreparedStatement stmt = conn.prepareStatement(sql);) {
			return stmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
