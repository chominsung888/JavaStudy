package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.java.connect.DBConnect;
import org.java.dto.BoardDto;

public class BoardDao {

	

	private BoardDao() {
		System.out.println("�̱��� -> Board");
	}
	private static class SingleTonClass{
		private static final BoardDao INSTANCE=new BoardDao();
	}
	public static BoardDao getInstance() {
		return SingleTonClass.INSTANCE;
	}
	
	//1.�Խñ� �ۼ�  BoardDto board= new BoardDto(no, title, content, writer, nickName);
	public int bInsert(BoardDto board) {
		
		int result=0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {	
			conn = DBConnect.getConnection();
			query = "insert into board0130(no,title,content,writer,nickname) values(?, ?,?,?,?) ";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, board.getNo()); 
			pstm.setString(2, board.getTitle()); 
			pstm.setString(3, board.getContent()); 
			pstm.setString(4, board.getWrite()); 
			pstm.setString(5, board.getNickName()); 

			result = pstm.executeUpdate();// ����, ����, ������ �����̸� 1, �������� ����

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
}
	//2. �ۼ���
	//3. �ۻ���
	//4. ����ȸ(���)
	//5. ����ȸ(�ϳ�)


//6.���� �����ϴ� �� Ȯ��
public int isBoard(int no) {
	int result=0;
	
	Connection conn=null;
	PreparedStatement pstm=null;
	ResultSet rs=null;//��ȸ
	String query="";
	
	try {
	conn=DBConnect.getConnection();
	query="select count(*) from borad0130 where no=?";
	pstm=conn.prepareStatement(query);
	pstm.setInt(1, no);
	
	pstm.executeQuery(); //��ȸ �� 
	
	if(rs!=null) {
		if(rs.next()) {
			rs.getInt(1)
		}
	}
		
		
		
	}catch{Exception e){
		e.printStackTrace();
	}finally {
	
	}
	conn=DBConnect.getConnection();
	
	
	
	
	
	
	return result;
	
}

public BoardDto bSelectOn(int no) {
	Connection conn =null;
	PreparedStatement pstm =null;
	String query= "";
	ResultSet rs=null;
	int result=0;
	
	try {
		conn= DBConnect.getConnection();
		query="select* from board01030 wghere no=?";
		pstm=conn.prepareStatement(query);
		
		rs=pstm.conn.prepareStatement(query);
		
		pstm.setInt(1, no);
		rs=pstm.executeQuery();
		
		if(rs!=null) {
			if(rs.next()) {
			 	board=new BoardDto(getInt, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
		}
		
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(conn !=null)
				conn.close();
			if(pstm !=null)
				conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	return result;
	
	
	
	
	
	
	
	
}

public BoardDao bSelectOne(int no) {
	// TODO Auto-generated method stub
	return null;
}
}




