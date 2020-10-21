package com.dao;

import java.sql.*;

import com.bean.User;
import com.provider.ConnectionProvider;

public class RegisterDao {
	public static int register(User u) {
		int status=0;
		try {
			Connection con=ConnectionProvider.getCon();
			PreparedStatement ps=((java.sql.Connection) con).prepareStatement("insert into account(username,password,email) values(?,?,?)");
			ps.setString(1, u.getUname());
			ps.setString(2, u.getUpass());
			ps.setString(3, u.getUemail());
			
			status=ps.executeUpdate();
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return status;
	}
}
