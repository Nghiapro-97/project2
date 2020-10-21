package com.clas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	public static Connection getConnection() {
		Connection con=null;
		try {
			String user="root";
			String password="nghia123";
			String urlString="jdbc:mysql://localhost:3306/qlch";
			Class.forName("com.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection(urlString, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static List<Emp> getRecord(int start, int total){
		List<Emp> list=new ArrayList<Emp>();
		try {
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from employee limit " + (start-1) + "," + total);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				Emp em = new Emp();
				em.setId(rs.getInt(1));
				em.setName(rs.getString(2));
				em.setSalary(rs.getDouble(3));
				
				list.add(em);
			}
			
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
}
