package org.rwte;

//You are using Java
import java.sql.*;
import java.util.*;

//class ItemType
class ItemType{
	private long id;
	private String name;
	private Double deposit;
	private Double costPerDay;

	public ItemType(long id, String name,Double deposit,Double costPerDay) {
		this.id = id;
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;

	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public Double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay =costPerDay;
	}

}


//class ItemTypeDAO
class ItemTypeDAO{
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");   
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
		return con;
	}
	public ItemType getItemType(int id) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		String sql ="select * from STUDENT where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1,id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		ItemType item = new ItemType(rs.getLong(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4));
		return item;
	}

}

class myclass3{
	//Type your code here
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();

		ItemTypeDAO it = new ItemTypeDAO();
		ItemType item = it.getItemType(d);
		System.out.format("%-5s %-15s %-10s\n","ID","Name","Deposit","Cost per day");
		System.out.format("%-5s %-15s %-10s\n",item.getId(),item.getName(),item.getDeposit(),item.getCostPerDay());

	}
}

