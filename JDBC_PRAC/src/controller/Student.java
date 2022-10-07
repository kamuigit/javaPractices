package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		StudentConnection scon = new StudentConnection();
		Connection conn = scon.getConnection();
		if(conn != null) {
			System.out.println("The database connectivity is done. It's ready to use");
		}
		System.out.println("1) Add Student Detail\n2) View Student Details\n3) Edit Student Detail\n4) Delete Student Detail");
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1:{
			// scon.createTable();
			System.out.println("how many students that you want to add in database");
			int studCount = Integer.parseInt(sc.nextLine());
			for(int i=0;i<studCount;i++) {
				System.out.println("Enter student Id");
				int studId = Integer.parseInt(sc.nextLine());
				System.out.println("Enter student name");
				String studName = sc.nextLine();
				System.out.println("Enter student grade");
				int grade = Integer.parseInt(sc.nextLine());
				StudentPojo sp = new StudentPojo(studId,studName,grade);
				scon.insertRecord(sp);
			}
			break;
		}
		case 2:{
			System.out.println("Student records are here");
			System.out.println("Id\tName\tGrade");
			scon.displayRecord();
		}
		}

	}

}

class StudentPojo{
	private int studentId;
	private String studentName;
	private int grade;
	public StudentPojo(int studentId, String studentName, int grade) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}

class StudentConnection{
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		return con;
	}

	public void displayRecord() throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		String sql = "select * from studentdetails order by grade";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
		}
	}

	public void insertRecord(StudentPojo sp) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		String sql = "insert into studentdetails(id,sname,grade) values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, sp.getStudentId());
		ps.setString(2, sp.getStudentName());
		ps.setInt(3, sp.getGrade());
		int result = ps.executeUpdate();
		if(result == 1) {
			System.out.println("Student record is successfully inserted");
		}
	}

	// public void createTable() throws ClassNotFoundException, SQLException {
	// Connection con = getConnection();
	// String sql = "create table studentdetail(id int(11) primary key, name varchar(50), grade int(11))";
	// Statement st = con.createStatement();
	// st.executeUpdate(sql);
	// }
}




