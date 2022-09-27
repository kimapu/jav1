package solution.feb22.test2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDA extends DAO {

	public AccountDA(String pATH_FOLDER, String pATH_FILE) {
		super(pATH_FOLDER, pATH_FILE);
		// TODO Auto-generated constructor stub
	}
	
	
	public int remove( String sql, String id ) 
	{
		int row = -1;
		try( PreparedStatement stmt = conn.prepareStatement(sql) ) {
			stmt.setString(1, id);
			row = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return row;
	}
	
	public int update( String sql, String newLine ) 
	{
		int row = -1;
		try( PreparedStatement stmt = conn.prepareStatement(sql) ) {
			String[] split = newLine.split("\\|");
			String id = split[0];
			String usr = split[1];
			String pwd = split[2];
			stmt.setString(1, usr);
			stmt.setString(2, pwd);
			stmt.setString(3, id);
			row = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return row;
	}
	
	public List<String> getAll(String sql)
	{
		List<String> lst = new ArrayList<>();
		
		try(PreparedStatement stmt = conn.prepareStatement(sql);) {
			ResultSet rs = stmt.executeQuery();
			while ( rs.next() ) {
				lst.add( String.join("|", rs.getString("usr"), rs.getString("pwd") ) );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}
	
	public int addNew(String sql, String record)
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

}
