package com.user.dao.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.user.dao.UserDao;

public class NUserDao extends UserDao {

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/naver","root","1111");
		return c;
	}

}
