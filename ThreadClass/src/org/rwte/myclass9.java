package org.rwte;
import java.sql.*;
import java.util.*;
public class myclass9 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ri_db","test","test123");
		
		Statement st=con.createStatement();
		String dept=sc.nextLine();
		String cgpa=sc.nextLine();
		String d="delete from student where dept= ? and cgpa> ?";
		PreparedStatement ps = con.prepareStatement(d);
		ps.setString(1,dept);
		ps.setString(2, cgpa);
		String q="select*from student";
		ps.executeUpdate(d);
		ResultSet rs=st.executeQuery(q);
		while(rs.next()){
			String cg=rs.getDouble(8)+"";
			if(cg.endsWith(".0")){
				cg=cg.replace(".0","");
			}
			System.out.println(rs.getInt(1)+" "+
					rs.getString(2)+" "+
					rs.getString(3)+" "+
					rs.getString(4)+" "+
					rs.getString(5)+" "+
					rs.getString(6)+" "+
					rs.getString(7)+" "+
					cg+" "+
					rs.getString(9));
		}
		con.close();
	}
}

