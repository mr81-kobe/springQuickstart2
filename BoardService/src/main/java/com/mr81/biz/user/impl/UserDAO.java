package com.mr81.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mr81.biz.board.impl.JDBCunit;
import com.mr81.user.biz.UserVO;
@Repository
public class UserDAO {
	
	public UserDAO() {
		// TODO Auto-generated constructor stub
	}
	
	private PreparedStatement stmt =null; 
	private ResultSet rs= null;
	
	private static final String INSERT_USER="INSERT INTO USERS VALUES(?,?,?,?)"; 
	private static final String DELETE_USER="DELETE FROM USERS WHERE ID=?"; 
	private static final String UPDATE_USER="UPDATE USERS SET PASSWORD=?, NAME=?,ROLE=?"; 
	private static final String FIND_USER="SELECT * FROM USERS WHERE ID=?"; 
	private static final String FIND_ALL="SELECT * FROM USERS"; 
	
	
	/*회원가입 메소드*/
	public void insert_User(UserVO vo)
	{
		
		Connection conn = JDBCunit.getConnection();
		try {
			 stmt = conn.prepareStatement(INSERT_USER);
			
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			stmt.setString(3, vo.getName());
			stmt.setString(4, vo.getRole()); 
			stmt.executeUpdate(); 
			
			}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCunit.close(stmt, conn);
		}
		
	}
	/*회원탈퇴 메소드*/
	public void delete_User(UserVO vo)
	{
		Connection conn = JDBCunit.getConnection();
		try {
			PreparedStatement stmt = conn.prepareStatement(DELETE_USER); 
			stmt.setString(1, vo.getId()); 
			stmt.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCunit.close(stmt, conn);
		}
	
		
		} 
	/*회원수정 메소드*/
	public void update_User(UserVO vo)
	{
		Connection conn = JDBCunit.getConnection();
		try {
		stmt= conn.prepareStatement(UPDATE_USER);
			stmt.setString(1, vo.getPassword());
			stmt.setString(2, vo.getName());
			stmt.setString(2, vo.getRole()); 
			stmt.executeUpdate();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCunit.close(stmt, conn);
		}
		
	}
	/*회원찾기 메소드*/
	public UserVO find_User(UserVO vo)
	{
		Connection conn = JDBCunit.getConnection();
		UserVO user = null;
		try {
			 stmt = conn.prepareStatement(FIND_USER); 
			stmt.setString(1,vo.getId());
			 rs=stmt.executeQuery();
			
			if(rs.next()){
				user = new UserVO(); 
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getString("role"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCunit.close(stmt, conn, rs);
		}
		return user;
	}
	/*회원리스트 메소드*/
	public List<UserVO> find_All(UserVO vo)
	{
		Connection conn = JDBCunit.getConnection();
		List<UserVO> userList = null;
		try {
			 stmt = conn.prepareStatement(FIND_ALL); 
			 rs= stmt.executeQuery();
			 while(rs.next()){
				UserVO user = new UserVO(); 
					user.setId(rs.getString("id"));
					user.setName(rs.getString("name"));
					user.setPassword(rs.getString("password"));
					user.setRole(rs.getString("Role"));
					userList.add(user);
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCunit.close(stmt, conn, rs);
		}
		return userList;
	}
}
