package student_management;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Operations {
	public Connection dbConnect() {
		Connection c = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_school","root","admin");
			System.out.println("CONNECTION ESTABLISHED SUCCESSFULLY - "+c);
		} catch (Exception e) {
			System.out.println("INTERNAL ERROR OCCURED - "+e.getMessage());
		}
		return c;
	}

	public List<Student> getAllStudents() {
		List<Student> studentlist = new ArrayList<>();
		dbConnect();
		Student s1 = new Student(101, "Kamal", "Solapur");
		Student s2 = new Student(102, "Sahil", "Pune");
		Student s3 = new Student(103, "Peerahmed", "Nagpur");
		Student s4 = new Student(104, "Rumaiza", "Mumbai");
		Student s5 = new Student(105, "Manisha", "Satara");
		Student s6 = new Student(106, "Rajni", "Bengaluru");

		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);
		studentlist.add(s5);
		studentlist.add(s6);

		return studentlist;
	}
}
