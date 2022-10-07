package org.zdfz;


//You are using Java
import java.sql.*;
import java.util.*;

class nepojo{
	private int id;
	private String name;
	private int marks;
	public nepojo(int id, String name,int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;

	}
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
class ConnectionMan{
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");   
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
		return con;
	}
	public void insertcla(ArrayList<nepojo> list) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		String sql ="insert into STUDENT values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		for (nepojo pp : list) {
			ps.setInt(1,pp.getId());
			ps.setString(2, pp.getName());
			ps.setInt(3, pp.getMarks());
			ps.executeUpdate();
		}
	}
	public void selectcla() throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		String sql ="select * from STUDENT";
		Statement ps = con.createStatement();
		ResultSet rs = ps.executeQuery(sql);

		while(rs.next()){
			System.out.println(rs.getInt(1) +" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}
}

class myclass{
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		ArrayList<nepojo> list = new ArrayList<nepojo>();
		int n = Integer.parseInt(sc.nextLine());

		while(n>0){
			int id = Integer.parseInt(sc.nextLine());
			String name = sc.nextLine();
			int marks = Integer.parseInt(sc.nextLine());
			list.add(new nepojo(id,name,marks));
			n--;
		}
		ConnectionMan cm = new ConnectionMan();
		cm.insertcla(list);
		cm.selectcla();

	}
}

