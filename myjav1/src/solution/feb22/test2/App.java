package solution.feb22.test2;

import java.util.List;

public class App {

	public static void main(String[] args) {

		String path2folder = "src/solution/test2";
		String path2file = "ACCOUNT.accdb";
		DAO entity = new AccountDA( path2folder, path2file );
		
		/**
		 * INSERT NEW ACCOUNT
		 */
//		String sql1 = "INSERT INTO login(USR, PWD) VALUES(?,?)";
//		int row = entity.addNew(sql1, "usr2|pwd2");
//		System.out.println( (row > 0) ? "\n> Record is updated successfully!" : "\\n> Record is not updated!" );
//		System.out.println( "\n>> Done!..." );


		/**
		 * READ ALL ACCOUNT
		 */
//		List<String> accountLst = entity.getAll("SELECT * FROM login");
//		accountLst.stream()
//			.forEach( System.out :: println );
//		System.out.println( "\n>> Done!..." );

		
		/**
		 * UPDATE ACCOUNT
		 */
//		String sql2 = "UPDATE login SET USR=?, PWD=? WHERE ID=?";
//		int row = entity.update( sql2, "6|user6|pwd6" );
//		System.out.println( (row > 0) ? "\n> Record is updated successfully!" : "\\n> Record is not updated!" );

		/**
		 * DELETE A RECORD
		 */
//		String sql3 = "DELETE FROM login WHERE ID=?";
//		int row = entity.remove( sql3, "6" );
//		System.out.println( (row > 0) ? "\n> Record is deleted successfully!" : "\\n> Record is not deleted!" );
//		
	}
	


}
