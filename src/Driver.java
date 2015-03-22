import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		try{
			// Get connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Runningman168");
			// create a statement
			Statement myStmt = myConn.createStatement();
			// execute sql query
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM actor");
			// process the result set
			while(myRs.next()){
				System.out.println(myRs.getString("last_name"));
			}
		}
		catch(Exception exc){
			exc.printStackTrace();
		}

	}

}
