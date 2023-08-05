package com.tech.blog.dao;

import com.tech.blog.entities.User;
import java.sql.*;
import org.apache.tomcat.dbcp.dbcp2.PoolablePreparedStatement;

public class UserDao {

    private Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }

    //method to insert user to data base:
    public boolean saveUser(User user) {
        boolean f = false;
        try {
            //user -->database

            String query = "insert into user(name,email,password,gender,about) values (?,?,?,?,?)";
            PreparedStatement pstmt = this.con.prepareStatement(query);
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getGender());
            pstmt.setString(5, user.getAbout());

            pstmt.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;

    }
    
//    get user by useremail and userpassword
    
    public User GetUserByEmailAndPassword(String email, String password){
        
        User user = null;
        
        try {
            
            String quary ="select * from user where email =? and password =?";
            PreparedStatement pstmt  = con.prepareStatement(quary);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            
            ResultSet set =  pstmt.executeQuery();
            
            if(set.next()){
                user = new User();
                
//                data from DB

                String name = set.getString("name");
//                set to user object
                user.setName(name);
                user.setId(set.getInt("id"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));
                user.setGender(set.getString("gender"));
                user.setAbout(set.getString("about"));
                user.setDateTime(set.getTimestamp("rdate"));
                
                
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return user;
    }
    
}
