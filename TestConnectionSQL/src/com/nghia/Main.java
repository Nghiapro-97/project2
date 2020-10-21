package com.nghia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String user="QUANLY";
		String password="123";
		String urlString="jdbc:sqlserver://DESKTOP-3JSVSPM\\SQLEXPRESS:1433;databaseName=QUAN_LY_PHONG_TRO2";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		try {
			Connection con=DriverManager.getConnection(urlString, user, password);
			System.out.println("connection successfull!");
			PreparedStatement ps=con.prepareStatement("SELECT MaNV,TenNV,GioiTinh,SinhNhat,DiaChi,Email FROM NHAN_VIEN WHERE TenNV=?");
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));
			}
			con.close();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("connection fall!");
			e.printStackTrace();
		}
	}

}
