package JDBC_ManageStudent;

import java.util.Scanner;

public class Main {
	private static int option;
	
	public static void main(String[] args) {
		// Choose option you want:
		System.out.println("Choose option: ");
		System.out.println("1 - Add student");
		System.out.println("2 - Get sudent by id");
		System.out.println("3 - List all students");
		System.out.println("4 - Update for student");
		System.out.println("5 - Delete for student");
		//Check option
		checkoption();
		
		if (option == 1) {
			System.out.println("-------Add a new student--------");
			AddStudent addstudent = new AddStudent();
			addstudent.add();
			return;
		}
		if (option == 2) {
			System.out.println("-------Get a student--------");
			GetStudent getstudent = new GetStudent();
			getstudent.get();
			return;
		}
		if (option == 3) {
			System.out.println("-------Get all students--------");
			GetAllStudents getallstudent = new GetAllStudents();
			getallstudent.getall();
			return;
		}
		if (option == 4) {
			System.out.println("-------Update a student--------");
			UpdateStudent updatestudent = new UpdateStudent();
			updatestudent.update();
			return;
		}
		if (option == 5) {
			System.out.println("-------Delete a student--------");
			DeleteStudent deletestudent = new DeleteStudent();
			deletestudent.delete();
			return;
		}
	}
	public static void checkoption() {
		boolean flag;
		Scanner sc = new Scanner(System.in);
		do {
			option = sc.nextInt();
			if (option < 1 || option > 5) {
				flag = false;
				System.out.println("Option " +option+ " is invalid! Please choose again.");
			} else {
				flag = true;
			}
		} while (!flag);
	}
}
