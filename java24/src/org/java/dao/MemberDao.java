package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.java.conect.DBConnect;
import org.java.dto.MemberDto;

public class MemberDao {

	private MemberDao() {
		System.out.println("�̱���");
	}

	private static class SingtonClass {
		// �̽��� ���� -> ��ü�� �ѹ��� ����
		private static final MemberDao INSTANCE = new MemberDao();

	}

	public static MemberDao getInstance() {
		return SingtonClass.INSTANCE;
	}

	// ȸ�� ����
	public int insert(String userId, String userPw, int age, String name) {
		int result = 0; // ����� ó������
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			// 1.DB����
			conn = DBConnect.getConnection();
			// 2. ������
			query = "insert into member0129(userId,userPw,age,name)values(?,?,?,?)";
			// 3.������ -> Connection ����
			pstm = conn.prepareStatement(query);
			// 4.�ܺ� �Է� ���� ó��
			pstm.setString(1, userId);// 1��° ?
			pstm.setString(2, userPw);// 1��° ?
			pstm.setInt(3, age);// 3��° ?
			pstm.setString(4, name);// 4��° ?
			// 5. �������� -> ����� ��ȯ 1�̸� ����
			result = pstm.executeUpdate(); // insert,update,delete �������� ���

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

	// ȸ�� ��ȸ(��� ��ȸ)-> ��üȸ�� ��ȸ
	public List<MemberDto> select() {
		List<MemberDto> members = new ArrayList<MemberDto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String query = "";
		try {
			// 1.DB����
			conn = DBConnect.getConnection();
			// 2. ������
			query = "select * from member0129";
			
			// 3.������ -> Connection ����
			pstm = conn.prepareStatement(query);
			// 4.�ܺ� �Է� ���� ó��. ���ڵ�
			rs = pstm.executeQuery();// select

			if (rs != null) {

				while (rs.next()) {
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String name = rs.getString(4);
					members.add(new MemberDto(userId, userPw, age, name));

				}
			}
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
		return members;
	}

	// ȸ�� ����ȸ(Ư��ȸ��)->CRUD

	// ȸ�� ����
	public int update(String userId, String userPw, int age, String name) {
		// userId�� ��ġ �ϴ� �ǹ��� userPw,age,name�� �����ϼ���
		int result = 0; // ��� �� ó�� ����

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update member0129 set userpw=? ,age=? , name=? where userId=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, name);
			pstm.setString(4, userId);

			// ���� 1
			result = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// ȸ�� Ż��
	public int delete(String userId) {
		// userId�� ��ġ�ϸ� ȸ�� Ż��

		int result = 0; // ��� �� ó�� ����

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delte from member0129 where userId=?";
			pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
