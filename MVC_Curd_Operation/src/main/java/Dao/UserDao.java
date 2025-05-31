package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.User;

public class UserDao {
		
	Connection cn = null;
	public UserDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/19feb_java","root","");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public int addUser(User user)
	{
		int i = 0;
		try {
			PreparedStatement ps =
					cn.prepareStatement("insert into users values(?,?,?,?)");
		
			ps.setInt(1, 0);
			ps.setString(2, user.getUname());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPass());
			
			 i = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
		
	}

	public List<User> getAllUser() {
		
		List<User> users = new ArrayList();
		
		try {
			PreparedStatement ps = 
					cn.prepareStatement("select * from users");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				User u = new User();
				u.setId(rs.getInt(1));
				u.setUname(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPass(rs.getString(4));
				
				users.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;
	}

	public int deleteUser(int id) {
      
		int i = 0;
		
		try {
			PreparedStatement ps  =
					cn.prepareStatement("delete from users where id = ?");
			ps.setInt(1, id);
			
			i = ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
public User userById(int id) {
		
		User user = new User();
		
		try {
			PreparedStatement ps = 
					cn.prepareStatement("select * from users where id=?");
			
			ps.setInt(1, id);
			
			ResultSet rs  =ps.executeQuery();
			
			if(rs.next())
			{
				user.setId(rs.getInt(1));
				user.setUname(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setPass(rs.getString(4));
			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	public int updateUser(User user) {
	
		int i = 0;
		try {
			PreparedStatement ps =
					cn.prepareStatement("update users set name=?,email=?,pass=? where id = ?");
			ps.setString(1, user.getUname());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPass());
			ps.setInt(4 , user.getId());
			
			i = ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public boolean isEmailExist(String email) 
	{
		boolean b = false;
		try {
			PreparedStatement ps = 
					cn.prepareStatement("select * from user where email=?");
			ps.setString(1, email);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				b = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}
	
	public User loginCheck(User u)
	{
		User user = null;
		try {
			PreparedStatement ps =
					cn.prepareStatement("select * from users where email=? and pass=?");
		
			ps.setString(1, u.getEmail());
			ps.setString(2, u.getPass());
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				user = new User();
				user.setId(rs.getInt(1));
				user.setUname(rs.getString(2));
				user.setEmail(rs.getString(3));
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}
	
}
