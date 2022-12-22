package JDBC_ManageStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteStudent {
	public void delete() {
		Student student = new Student();

		// Enter value
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		student.setId(sc.nextInt());
		sc.close();
		
		// Connect to table
		ConnectJDBC connectJdbc = new ConnectJDBC();
		Connection connection = connectJdbc.getconnect();

		String query = "DELETE FROM student WHERE id=?";

		PreparedStatement pst = null;

		try {
			pst = connection.prepareStatement(query);

			pst.setInt(1, student.getId());
			int row = pst.executeUpdate();
			if (row !=0 ) {
				System.out.println(row +" row(s) deleted success!");
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
