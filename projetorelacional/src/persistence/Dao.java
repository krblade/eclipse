package persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


public class Dao {

	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	
	
	public void open() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection
	("jdbc:mysql://localhost:3306/BDontheline","andre","fabiana21");
	}		
	public void close() throws Exception {
		con.close();
	}
	
}
