package JDBC_ManageStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudent {
	public void update() {
		Student student = new Student();
		
		ConnectJDBC connectJdbc = new ConnectJDBC();
		Connection connection = connectJdbc.getconnect();
		
		String query = "UPDATE student SET name =?, age = ? where id = ?";
		PreparedStatement pst = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter id: ");
			student.setId(sc.nextInt());
			System.out.println("Enter new name: ");
			student.setName(sc.next());
			System.out.println("Enter new age: ");
			student.setAge(sc.nextInt());
			sc.close();
			
			pst = connection.prepareStatement(query);
			pst.setString(1, student.getName());
			pst.setInt(2, student.getAge());
			pst.setInt(3, student.getId());
			
			int row = pst.executeUpdate();
			if(row !=0) {
				System.out.println("Updated sucess!");
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
