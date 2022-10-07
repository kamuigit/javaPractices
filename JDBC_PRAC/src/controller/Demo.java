package controller;

//You are using Java
import java.sql.*;
import java.util.*;

class nepojo{
	private int sid;
	private String sname;
	private String dname;
	private String address;
	private float gpa;

	public nepojo(int sid, String sname,String dname,String address,float gpa) {
		this.sid = sid;
		this.sname = sname;
		this.dname=dname;
		this.address=address;
		this.gpa=gpa;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
}
class ConnectionMan {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");   
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
		return con;
	}
	public void insertcla(ArrayList<nepojo> list) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		String sql ="insert into BILL values(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		for (nepojo pp : list) {
			ps.setInt(1,pp.getSid());
			ps.setString(2, pp.getSname());
			ps.setString(3, pp.getDname());
			ps.setString(4, pp.getAddress());
			ps.setFloat(5, pp.getGpa());
			ps.executeUpdate();
		}
	}

	public void selectcla(String val) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		String sql ="select * from BILL where DNAME = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, val);
		ResultSet rs = ps.executeQuery();
		 
		if(!rs.next()) {
			System.out.println("No students in "+val+" department");
		}
		else {
			do{
				System.out.println(rs.getInt(1) +" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getFloat(5));
			}while(rs.next());
		}
	}
}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		ArrayList<nepojo> list = new ArrayList<nepojo>();
		int n = Integer.parseInt(sc.nextLine());
		ConnectionMan cs = new ConnectionMan();
		
		while(n>0) {
			int sid = Integer.parseInt(sc.nextLine());
			String sname =sc.nextLine();
			String dname =sc.nextLine();
			String address =sc.nextLine();
			float gpa =Float.parseFloat(sc.nextLine());
			list.add(new nepojo(sid, sname, dname, address, gpa));
			n--;
		}
		ConnectionMan cm = new ConnectionMan();
		cm.insertcla(list);
		String val =sc.nextLine();
		cm.selectcla(val);
		
		

	}
}