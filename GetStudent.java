package JDBC_ManageStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetStudent {
	public void get() {
		Student student = new Student();

		// Enter value
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		student.setId(sc.nextInt());
		sc.close();

		// Connect to table
		ConnectJDBC connectJdbc = new ConnectJDBC();
		Connection connection = connectJdbc.getconnect();

		String query = "SELECT * FROM student WHERE id=?";

		PreparedStatement pst = null;

		try {
			pst = connection.prepareStatement(query);
			pst.setInt(1, student.getId());

			ResultSet rs = pst.executeQuery();

			while(rs.next()) {
				System.out.print("ID : " + student.getId());
				System.out.print(", Name : " + rs.getString("name"));
				System.out.println(", Age : " + rs.getInt("age"));
			}
			connection.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}
}
