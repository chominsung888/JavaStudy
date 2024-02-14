package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import org.java.connect.DBConnect;
import org.java.dto.MeberDto;

//서비스 DB관련 시간일 수행 DAO-> <-DB
public class MemberDao {
	
	public MemberDao() {
		System.out.println("DAO");
	}

	public int insert(int no, String userId, String userPw, String username, int userage) {
		
		int result = 0;
		
		System.out.println("회원가입 수행");
	
		Connection conn=null; //연결객체
		String qurey="";
		PreparedStatement pstm = null;
		
		// 1.DB연동
		try {
			conn=DBConnect.getConnection();
			qurey="insert into member0117(no,userId,userPw,name,age) values(?,?,?,?,?)";
			pstm=conn.prepareStatement(qurey);
			pstm.setInt(1, no);
			pstm.setString(2, userId);
			pstm.setString(3, userPw);
			pstm.setString(4, username);
			pstm.setInt(5, userage);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null)conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
		return result;
	}

	public int update() {
		int result =0;
		System.out.println("회원수정 수행");
		Connection conn=null;
	
		try {
			conn = DBConnect.getConnection();
			
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
		if(conn!=null) conn.close();
	}catch(SQLException e){
		e.printStackTrace();
	
}
		
	}
		return result;
}
	

	
	public MemberDto select() {
		
		MemberDto member = new MemberDto();
		
		System.out.println("회원조회 수행");
		Connection conn =null;
		try {
			conn= DBConnect.getConnection();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)
					conn.close();
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return member;
		
	}
	
	
	//회원가입 -> DBConnect ** 성공하면 1반환 실패면 나머지
	
	//회원수정 -> DBConnect** 성공하면 1반환 실패면 나머지
	//회원탈퇴 -> DBConnect** 성공하면 1반환 실패면 나머지
	
	
	//회원조회 -> DBConnect 
	
}
