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
			System.out.println(e);
		}
		
		return con;
	}
	
	public static int save(Emp e) {
		int status=0;
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=((java.sql.Connection) con).prepareStatement("insert into user(name,password,email,country) values (?,?,?,?)");
			ps.setString(1, e.getName());
			ps.setString(2, e.getPassword());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getCountry());
			
			status=ps.executeUpdate();
			con.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		return status;
	}
	
	public static int update(Emp e) {
		int status=0;
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=((java.sql.Connection)con).prepareStatement("update user set name=?,password=?,email=?,country=? where id=?");
			ps.setString(1, e.getName());
			ps.setString(2, e.getPassword());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getCountry());
			ps.setInt(5, e.getId());
			
			status=ps.executeUpdate();
			con.close();
		
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return status;
	}
	
	public static int delete(int id) {
		int status=0;
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=((java.sql.Connection) con).prepareStatement("delete from user where id=?");
			ps.setInt(1, id);
			status=ps.executeUpdate();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static Emp getEmployeeById(int id) {
		Emp emp=new Emp();
		
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=((java.sql.Connection) con).prepareStatement("select * from user where id=?");
		
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if (rs.next()) {
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setPassword(rs.getString(3));
				emp.setEmail(rs.getString(4));
				emp.setCountry(rs.getString(5));
			}
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return emp;
	}
	
	public static List<Emp> getAllEmployee(){
		List<Emp> list=new ArrayList<Emp>();
		
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=((java.sql.Connection) con).prepareStatement("select * from user");
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				Emp emp = new Emp();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setPassword(rs.getString(3));  
                emp.setEmail(rs.getString(4));  
                emp.setCountry(rs.getString(5));
                list.add(emp);
			}
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}

