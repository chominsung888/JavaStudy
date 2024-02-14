package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;


import org.java.connect.MemberConnect;
import org.java.dto.MemberDto;

public class MemberDao {

	private MemberDao() {
		System.out.println("싱글톤");
	}
	
	private static class SingleTon{
		private static final MemberDao INSTANCE = new MemberDao();
	}
	
	
	public static  MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}
	
	public int insert(String userId, String userPw, int age, String name) {
		int result = 0;
		
	
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn= MemberConnect.geConnection();

			query = "insert into member0201(userId,userPw,age,name) values(?,?,?,?)";

			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId); // 서비스에서 전달된 userId
			pstm.setString(2, userPw);// 서비스에서 전달된userPw
			pstm.setInt(3, age); // 서비스에서 전달된 3, age
			pstm.setString(4, name);// 서비스에서 전달된 4 name

			result = pstm.executeUpdate(); //
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			if (pstm != null)
				try {
					pstm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

		return result;
	}
	
	public List<MemberDto> select(){
		List<MemberDto> members=new ArrayList<MemberDto>();
		Connection conn=null;
		PreparedStatement pstm=null;
		String query="";
		ResultSet rs=null;
		
		try {
			conn =MemberConnect.geConnection();
			query="select *from member0201";
			pstm=conn.prepareStatement(query);
			rs=pstm.executeQuery();
			
			if(rs !=null) {
				while(rs.next()) {
					String userId=rs.getString(1);
					String userPw=rs.getString(2);
					int age=rs.getInt(3);
					String name=rs.getString(4);
					
					members.add(new MemberDto(userId,userPw,age,name));
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)
					conn.close();
				if(pstm !=null)
					pstm.close();
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
			return members;
		
	
	
		
	}
	
	
	
	public int update(String userId, String userPw, int age, String name) {
		int result = 0;
		
		
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		String query="";
		
		try {
			conn= MemberConnect.geConnection();
			query="insert into member0201(no,userId,userPw ,age,name";
			pstm=conn.prepareStatement(query);
			
			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, name);
			pstm.setString(4, userId);
			
			result= pstm.executeUpdate();
			
		
				}catch(Exception e) {
					e.printStackTrace();
			}finally {
				try {
					if(conn !=null)
						conn.close();
					if(pstm!=pstm)
						pstm.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return result;
		
	}
	public int delete(String userId) {
		int result =0;
		
		Connection conn=null;
		PreparedStatement pstm=null;
		String query="";
		
		
		try {
			conn=MemberConnect.geConnection();
			query ="delete from member0201 whereuserId=?";
			pstm.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)
					conn.close();
				if(pstm !=null)
					pstm.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
}
