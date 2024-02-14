package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import org.java.connect.DBConnect;
import org.java.dto.MeberDto;

//���� DB���� �ð��� ���� DAO-> <-DB
public class MemberDao {
	
	public MemberDao() {
		System.out.println("DAO");
	}

	public int insert(int no, String userId, String userPw, String username, int userage) {
		
		int result = 0;
		
		System.out.println("ȸ������ ����");
	
		Connection conn=null; //���ᰴü
		String qurey="";
		PreparedStatement pstm = null;
		
		// 1.DB����
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
		System.out.println("ȸ������ ����");
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
		
		System.out.println("ȸ����ȸ ����");
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
	
	
	//ȸ������ -> DBConnect ** �����ϸ� 1��ȯ ���и� ������
	
	//ȸ������ -> DBConnect** �����ϸ� 1��ȯ ���и� ������
	//ȸ��Ż�� -> DBConnect** �����ϸ� 1��ȯ ���и� ������
	
	
	//ȸ����ȸ -> DBConnect 
	
}
