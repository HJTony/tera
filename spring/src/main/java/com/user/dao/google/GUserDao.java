//package com.user.dao.google;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//import com.user.dao.UserDao;
//
//public class GUserDao extends UserDao {
//
//	@Override
//	public Connection getConnection() throws ClassNotFoundException, SQLException {
//		// TODO Auto-generated method stub
//				Class.forName("com.mysql.cj.jdbc.Driver");
//				Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/google?useSSL=false&serverTimezone=UTC","root","1111");
//				return c;
//	}
//
//}
