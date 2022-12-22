package JDBC_ManageStudent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {

	private String hostName ="localhost";
	private String dbName ="student_management";
	private String userName ="root";
	private String passWord="1234";
	
	private String connectionURL= "jdbc:mysql://"+ hostName +"/" +dbName +"?useSSL=false";
	
	public Connection getconnect() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionURL, userName, passWord);
//			System.out.println("Connected success!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void main(String[] args) {
		ConnectJDBC connectJdbc = new ConnectJDBC();
		try (Connection connection = connectJdbc.getconnect()) {
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
