package solution.lab11.q3;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import solution.lab11.DataAccess;

public class ProductDA extends DataAccess {

	private final String TABLE = "Product";
	
	public ProductDA(String db) {
		super(db);
		// TODO Auto-generated constructor stub
	}

	public List<Product> getAll() throws Exception
	{
		final String sql = "SELECT * FROM "+ TABLE + " ORDER BY NAME ASC";
		List<Product> lst = new ArrayList<>();
		
		ResultSet rs = super.executeQuery(sql);
		if ( rs != null ) {
			while ( rs.next() ) {
				lst.add( new Product(
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
	
}
