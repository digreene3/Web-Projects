package flashcards.persistence;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DatabaseAccess {
	static final String DRIVE_NAME = "com.mysql.jdbc.Driver";

	static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/flash_cards";

	static final String DB_CONNECTION_USERNAME = "root";

	static final String DB_CONNECTION_PASSWORD = "root";

	/**
	* Initiates connection to database.
	* 
	* @return The connection object.
	*/
	public Connection connect() {
		Connection con = null;
		try {
			Class.forName(DRIVE_NAME);
			con = DriverManager.getConnection(CONNECTION_URL, DB_CONNECTION_USERNAME, DB_CONNECTION_PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	} // end of connect

	/**
	* Retrieves data from the database based on a SQL query.
	*
	* @param con The open connection to the database.
	* @param query The SQL query to execute.
	*
	* @return The results generated from the SQL query.
	*/
	public ResultSet retrieve(Connection con, String query) {
		ResultSet rset = null;
		try {
			Statement stmt = con.createStatement();
			
			rset = stmt.executeQuery(query);
			return rset;
		} catch (SQLException e) {
			e.printStackTrace();
			return rset;
		}
	}// end of retrieve
	
	/**
	* Updates the database based on a SQL query.
	*
	* @param con The open connection to the database.
	* @param query The SQL query to execute.
	*
	* @return The number of updated rows in the database.
	*/
	public int update(Connection con, String query) {
		int rowsAffected = 0;
		try {
			Statement stmt = con.createStatement();
			rowsAffected = stmt.executeUpdate(query);
			return rowsAffected;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return rowsAffected;
		}
	}
}
