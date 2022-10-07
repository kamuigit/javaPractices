package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
class npojo{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class ConnectionManager {
	
	public static Connection stdConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");   //--driver class with DBurl
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "123Di@mond");
		return con;

	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("enter id , name:");
		
		
		Connection con = stdConnection();
		String sql1 ="use newdb";
		PreparedStatement st1 = con.prepareStatement(sql1);
		st1.executeUpdate(sql1);

		String sql ="select * from demotable where id =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1,12);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		}
		
		con.close();

	}
}

