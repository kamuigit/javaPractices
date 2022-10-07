package controller;
//You are using Java
import java.sql.*;
import java.util.*;

class ConnectionManu {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");   
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
		return con;
	}
	public String selectcla(String val) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		String sql ="select pass_word from userdetails where user_name = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, val);
		ResultSet rs = ps.executeQuery();
		
		rs.next();
		String out = rs.getString(1);
		return out;
	}
	
}
class Myclass{
 public static void main(String[] args)throws ClassNotFoundException, SQLException {
     Scanner sc = new Scanner(System.in);
     String user = sc.nextLine();
     String pass = sc.nextLine();
     
     ConnectionManu cm = new ConnectionManu();
     String pass1 = cm.selectcla(user);
     
     if(pass.equals(pass1)){
         System.out.println("Login Successful");
     }
     else{
         System.out.println("Invalid username/password");
     }
 }
}

