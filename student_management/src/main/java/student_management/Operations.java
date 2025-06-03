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

	public List<Student> fetchAllFromDB(){
		List<Student> studentList = new ArrayList<>();
		try {
			String sql = "SELECT stud_roll_no, stud_name, stud_city FROM tbl_student;";
			Connection c = dbConnect();
			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				/*
				 * System.out.println("ROLL NO - "+rs.getInt("stud_roll_no"));
				 * System.out.println("NAME    - "+rs.getString("stud_name"));
				 * System.out.println("CITY    - "+rs.getString("stud_city"));
				 */
				int rollno = rs.getInt("stud_roll_no");
				String name = rs.getString("stud_name");
				String city = rs.getString("stud_city");
				
//				Student s = new Student(rollno,name,city);
//				studentList.add(s);
			}
			
			
			Student s = new Student("Akash","Mumbai");
			saveData(s);
		}catch(SQLException e) {
			System.out.println("SQL ERROR - "+e.getMessage());
		}
		return studentList;
	}
	
	public List<Student> getAllStudents() {
		fetchAllFromDB();
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
	
	public boolean saveData(Student s) {
		boolean success = false;
		try {
			Connection c = dbConnect();
			String sql = "INSERT INTO tbl_student(stud_name,stud_city)VALUES(?,?);";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, s.getStudName());
			ps.setString(2,s.getStudCity());
			ps.executeUpdate();
			success = true;
		}catch(SQLException e) {
			System.out.println("SQL ERROR - "+e.getMessage());
		}
		return success;
	}
}
