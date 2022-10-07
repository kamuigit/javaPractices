package org.rwte;

//You are using Java
import java.sql.*;
import java.util.*;

class ConnectionMan {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");   
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
		return con;
	}

	public void selectcla(int val) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		String sql ="select * from stall where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, val);
		ResultSet rs = ps.executeQuery();

		System.out.format("%-10s %-10s %-10s\n","ID","Name","Deposit");
		while(rs.next()){
			System.out.format("%-10s %-10s %-10s\n",rs.getInt(1),rs.getString(2),rs.getDouble(3));
		}
	}
}

class myClass{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		int val = Integer.parseInt(sc.nextLine());

		ConnectionMan cm = new ConnectionMan();
		cm.selectcla(val);
		
	}
}
