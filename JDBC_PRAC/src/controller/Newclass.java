package controller;


import java.sql.*;
import java.util.Scanner;

public class Newclass {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost/ri_db","test","test123");
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		Statement statement = c.createStatement();
		statement.execute("use ri_db");

		while(x>0){
			int id = Integer.parseInt(sc.nextLine());
			String name = sc.nextLine();
			String dName = sc.nextLine();
			String address = sc.nextLine();
			float gpa = Float.parseFloat(sc.nextLine());
			String sql = "insert into BILL values(" + id + ", '" + name+"', '" + dName+ "', '" +
					address + "', " + gpa + ")";
			PreparedStatement s = c.prepareStatement(sql);
			s.execute();
			x--;
		}
		Statement s= c.createStatement();
		String dept =sc.nextLine();
		String s1 = "select * from BILL where DNAME ='" +dept + "'";
		ResultSet set = s.executeQuery(s1);
		ResultSetMetaData setMetaData = set.getMetaData();
		int columnsNumber= setMetaData.getColumnCount();
		if(set.next()==false){
			System.out.println("No students in " + dept + " department");
		}
		else {
			for (int i = 1; i <= columnsNumber; i++) {
				String columnValue = set.getString(i);
				if (i != columnsNumber) {
					System.out.print(columnValue + " ");
				} else {
					System.out.println(columnValue);
				}
			}

			while (set.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					String columnValue = set.getString(i);
					if (i != columnsNumber) {
						System.out.print(columnValue + " ");
					} else {
						System.out.println(columnValue);
					}
				}
			}

		}
	}
}

