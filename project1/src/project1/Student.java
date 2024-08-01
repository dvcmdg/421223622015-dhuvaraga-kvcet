package project1;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class Student{
	public static void main(String[] args)
	{
		String url="jdbc:mysql://localhost:3306/student";
		String username="root";
		String password="root";
		
		try {
			Driver d=new Driver();
			DriverManager.registerDriver(d);
			Connection con=DriverManager.getConnection(url,username,password);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from student1");
			System.out.println("sno name address");
			while(rs.next()) {
				int sno=rs.getInt(1);
				String name=rs.getString(2);
				String address=rs.getString(3);
				System.out.println(sno+" "+name+"\t"+address);
			}
			rs.close();
			stmt.close();
			con.close();
			
			}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
}


