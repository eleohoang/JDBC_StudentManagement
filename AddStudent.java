package JDBC_ManageStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddStudent {
	public void add() {
		Student student = new Student();

		// Enter value
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		student.setName(sc.nextLine());
		System.out.println("Enter age: ");
		student.setAge(sc.nextInt());
		sc.close();
		
		// Connect to table
		ConnectJDBC connectJdbc = new ConnectJDBC();
		Connection connection = connectJdbc.getconnect();

		String query = "INSERT INTO student(name,age)" + "VALUES (?,?)";

		PreparedStatement ppst = null;

		// Add value to table 
		try {
			ppst = connection.prepareStatement(query);
			ppst.setString(1, student.getName());
			ppst.setInt(2, student.getAge());

			int row = ppst.executeUpdate();
			if (row != 0) {
				System.out.println("Add sucess " + row +" row(s)");
			}

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
