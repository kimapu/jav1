package solution.lab11.q1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import solution.lab11.DataAccess;

public class StaffDA extends DataAccess{

	private final String TABLE = "Staff";
	
	public StaffDA(String db) {
		super(db);
	}

	public List<Staff> view() throws Exception
	{
		final String sql = "SELECT * FROM "+ TABLE;
		List<Staff> lst = new ArrayList<>();
		
		ResultSet rs = super.executeQuery(sql);
		if ( rs != null ) {
			while ( rs.next() ) {
				lst.add( new Staff(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7)
						) );
			}
		}
		return lst;
	}
	
	public int insert(Staff staff)
	{
		final String sql = "INSERT INTO "+ TABLE + "(FNAME, LNAME, AGE, DOB, DEPARTMENT, DATE_JOINED) VALUES(?,?,?,?,?,?)" ;
		String[] split = staff.toString().split("\\|");
		int row = -1;
		try( PreparedStatement stmt = conn.prepareStatement(sql) ) {
			stmt.setString(1, split[1]);
			stmt.setString(2, split[2]);
			stmt.setString(3, split[3]);
			stmt.setString(4, split[4]);
			stmt.setString(5, split[5]);
			stmt.setString(6, split[6]);
			row = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}
	
	public int update(String id, Staff newStaff)
	{
		final String sql = "UPDATE "+ TABLE + " SET FNAME=?, LNAME=?, AGE=?, DOB=?, DEPARTMENT=?, DATE_JOINED=? WHERE ID=?" ;
		
		String[] split = newStaff.toString().split("\\|");
		int row = -1;
		try( PreparedStatement stmt = conn.prepareStatement(sql) ) {
			stmt.setString(1, split[1]);
			stmt.setString(2, split[2]);
			stmt.setString(3, split[3]);
			stmt.setString(4, split[4]);
			stmt.setString(5, split[5]);
			stmt.setString(6, split[6]);
			stmt.setString(7, id);
			row = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}
	
	

}
