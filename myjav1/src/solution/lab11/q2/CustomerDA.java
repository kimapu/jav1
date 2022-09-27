package solution.lab11.q2;

import java.sql.ResultSet;

import solution.lab11.DataAccess;

public class CustomerDA extends DataAccess {
	
	private final String TABLE = "Customer";
	
	public CustomerDA(String db) {
		super(db);
		// TODO Auto-generated constructor stub
	}
	
	public Customer findByUsername(String username)
	{
		final String sql = "SELECT * FROM "+ TABLE + " WHERE USERNAME='" + username + "'";

		Customer cust1 = new Customer();
		ResultSet rs = super.executeQuery(sql);
		try {
			if ( rs.next() ) {
				cust1.setId( rs.getString("ID") );
				cust1.setFname( rs.getString("FNAME") );
				cust1.setLname(rs.getString("LNAME"));;
				cust1.setDob(rs.getString("DOB"));
				cust1.setUsername(rs.getString("USERNAME"));
				cust1.setPassword(rs.getString("PASSWORD"));
			}	
		} catch (Exception e) {
			e.printStackTrace();
			cust1 = null;
		}
		
		return cust1;
		
	}

}
