package org.studyeasy.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.studyeasy.config.DatabaseConfig;
import org.studyeasy.entity.User;


public class UsersModel {
	public List<User> listuser(){
		List<User> listusers=new ArrayList<>();
		Connection connect=DatabaseConfig.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		
		String query="Select * from users";
		try{
			stmt=connect.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next()) {
				listusers.add(new User(rs.getInt("user_id"),rs.getString("username"),rs.getString("email")));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listusers;
	}
	
	public void addUser(User newUser) {
		Connection connect=null;
		PreparedStatement statement=null;
		try {
			connect=DatabaseConfig.getConnection();
			String username=newUser.getUsername();
			String email=newUser.getEmail();
			String query="insert into users (username,email) values (?,?)";
			statement = connect.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			statement.execute();	
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateUser(User updateUser) {
		Connection connect=null;
		PreparedStatement statement=null;
		try {
			connect=DatabaseConfig.getConnection();
			int user_id=updateUser.getUser_id();
			String username=updateUser.getUsername();
			String email=updateUser.getEmail();
			String query="update users set username=?, email=? where user_id=?";
			statement = connect.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			statement.setInt(3, user_id); 
			statement.execute();	
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleteUser(int user_id) {
		Connection connect=null;
		PreparedStatement statement=null;
		try {
			connect=DatabaseConfig.getConnection();
			String query="delete from users where user_id=?";
			statement = connect.prepareStatement(query);
			statement.setInt(1, user_id);
			statement.execute();	
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
