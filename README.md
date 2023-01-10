# JDBC_StudentManagement
Management student (create, update, get, list, delete) using JDBC in Java

Step 1: Let create a Student table in MySQL student_management database: 

CREATE TABLE Student(

   ID   INT NOT NULL AUTO_INCREMENT,
   
   NAME VARCHAR(20) NOT NULL,
   
   AGE  INT NOT NULL,
   
   PRIMARY KEY (ID)
   
);
![create student](https://user-images.githubusercontent.com/78299978/209236497-b9cc8055-1615-4b93-aaff-174867d94c17.png "Student")

https://user-images.githubusercontent.com/78299978/209236497-b9cc8055-1615-4b93-aaff-174867d94c17.png

Step 2: Call Main.java class to choose option:

    // Choose option you want:
    System.out.println("Choose option: ");
    System.out.println("1 - Add student");	
    System.out.println("2 - Get sudent by id");	
    System.out.println("3 - List all students");	
    System.out.println("4 - Update for student");	
    System.out.println("5 - Delete for student");
		

https://user-images.githubusercontent.com/78299978/209236503-1bb0f155-7b76-4ed6-9e7c-55fd17f27827.png

https://user-images.githubusercontent.com/78299978/209236502-1e97f9e2-cbe7-44c7-9566-ecf51f9128fa.png
