
package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.java.connect.DBConnect;
import org.java.dto.MemberDto;

public class MemberDao {

	private PreparedStatement pstm;

	private MemberDao() {
		System.out.println("�̱���");
	}

	private static class SingtonClass {

		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingtonClass.INSTANCE;

	}
	// 1.ȸ������

	public int insert(String userId, String userPw, int age, String name) {
		int result = 0;
		
		// ���� -> ȸ������
//		int bool=selectBool( userId);
//		if(bool==1) {
//			return 2;
//		}
//		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();

			query = "insert into member0130(userId,userPw,age,name) values(?,?,?,?)";

			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId); // ���񽺿��� ���޵� userId
			pstm.setString(2, userPw);// ���񽺿��� ���޵�userPw
			pstm.setInt(3, age); // ���񽺿��� ���޵� 3, age
			pstm.setString(4, name);// ���񽺿��� ���޵� 4 name

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

// ȸ�� ��ȸ(��� ��ȸ)-> ��üȸ�� ��ȸ
	public List<MemberDto> select() {
		List<MemberDto> members = new ArrayList<MemberDto>();
		// 1.DB����
		Connection conn = null;
		// 2. SQLó��
		PreparedStatement pstm = null;
		// 3. SQL��ó��
		String query = "";
		// 4.ResultSet -> DB������get
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select *from member0130";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();// ���̺� ���ڵ� ��ȯ

			if (rs != null) {
				while (rs.next()) {// ���ڵ�
					String userId = rs.getString(1);// ���ڵ�1(Į��)
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String name = rs.getString(4);

					members.add(new MemberDto(userId, userPw, age, name));

				}
			}

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
		return members;
	}

// ȸ�� ����ȸ(Ư��ȸ��)->CRUD

// ȸ�� ����
	public int update(String userId, String userPw, int age, String name) {
		// userId�� ��ġ �ϴ� �ǹ��� userPw,age,name�� �����ϼ���
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update member0130 set userPw=?,age=?,name=? where userId=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, name);
			pstm.setString(4, userId);

			result = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (conn != pstm)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	// 4.ȸ�� Ż��

	public int delete(String userId) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delte from member0130 where userId=?";
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

	// 5.ȸ�� ��ȸ
	public MemberDto selectOne(String userId) {
		MemberDto member = null;
		Connection conn = null;
		String query = null;
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select *from member0130 where userId=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);

			rs = pstm.executeQuery();// ���̺� ���ڵ� ��ȯ

			if (rs != null) {
				while (rs.next()) {// ���ڵ�

					member = new MemberDto(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4));
				}
			}

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
		return member;

	}

	// 6.ȸ�� ��ȸ(ȸ�� ����)-> 1�̸� �����ϰ� ������X
	public int selectBool(String userId) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from member0130 where userId=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			rs = pstm.executeQuery();
			if (rs != null) {
				if (rs.next()) {
					result = rs.getInt(1); //1 -> ȸ���� ����, 0-> ����X
				}
			}

			pstm.executeQuery();
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
