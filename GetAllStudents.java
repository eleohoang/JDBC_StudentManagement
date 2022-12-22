package JDBC_ManageStudent;

import java.sql.*;

public class GetAllStudents {
	public void getall() {
		ConnectJDBC connectJdbc = new ConnectJDBC();
		Connection connection = connectJdbc.getconnect();
		
		String query = "SELECT * FROM student";
		Statement st = null;
		try {
			st = connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				System.out.print("ID : " + rs.getInt("id"));
				System.out.print(", Name : " + rs.getString("name"));
				System.out.println(", Age : " + rs.getInt("age"));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
