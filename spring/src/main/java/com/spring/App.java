package com.spring;

import java.sql.SQLException;

import com.user.dao.UserDao;
import com.user.dao.naver.NUserDao;
import com.user.domain.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        UserDao dao = new NUserDao();
        
        User user = new User();
        user.setId("Teranas");
        user.setName("Tony");
        user.setPassword("1111");
        
        dao.add(user);
        
        System.out.println("등록 성공 : " + user.getId());
        
        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println("조회 성공 : " + user2.getId());
        
    }
}
