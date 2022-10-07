package org.rwte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class myclass7{
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Scanner sc = new Scanner(System.in);
        String gender,dept;
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ri_db","test","test123");
            if(con!=null)
            {
                gender=sc.nextLine();
                dept=sc.nextLine();
                String searchque="select emp_no,first_name,last_name from employee where gender='"+gender+"'and dept='"+dept+"'";
                PreparedStatement pst=con.prepareStatement(searchque);
                ResultSet rs=pst.executeQuery();
                while(rs.next())
                {
                    System.out.println("Employee ID : "+rs.getInt(1)+" Name : "+rs.getString(2)+" "+rs.getString(3));
                }
            }
            con.close();
    }
}
