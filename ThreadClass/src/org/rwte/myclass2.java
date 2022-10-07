package org.rwte;

//You are using Java
import java.sql.*;
import java.util.*;

class Main{
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");   
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
		return con;
	}
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    Scanner sc = new Scanner(System.in);
	
	    Connection con = getConnection();
	
	    int n = Integer.parseInt(sc.nextLine());
     String sql="insert into student values(?,?,?,?,?)";
     PreparedStatement ps = con.prepareStatement(sql);

     for(int i=0;i<n;i++) {
         ps.setString(1,sc.nextLine());
         ps.setString(2, sc.nextLine());
         ps.setInt(3,Integer.parseInt(sc.nextLine()));
         ps.setInt(4,Integer.parseInt(sc.nextLine()));
         ps.setInt(5,Integer.parseInt(sc.nextLine()));
         ps.executeUpdate();
     }
     System.out.println(n);
	}
}
