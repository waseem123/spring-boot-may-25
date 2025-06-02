package student_management;

public class Student {
	private int rollNo;
	private String studName;
	private String studCity;
	
	public Student() {}

	public Student(String studName, String studCity) {
		this.studName = studName;
		this.studCity = studCity;
	}

	public Student(int rollNo, String studName, String studCity) {
		this.rollNo = rollNo;
		this.studName = studName;
		this.studCity = studCity;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudCity() {
		return studCity;
	}

	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}
}
