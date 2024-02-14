package otg.java.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.java.concect.DBConnect;
import org.java.dto.MemberDto;

public class MemberDao {

	public MemberDao() {
		System.out.println("DAO");
	}

	// ȸ������ -> ������ 1��ȯ, �����ϸ� ������ �� ��ȯ
	public int insert() {

		System.out.println("ȸ������ ����");

		int result = 0;
		Connection conn = null;

		try {
//		1. ����̹�
//		2. DB����  -> ����̹� JDBC
			conn = DBConnect.getConnection();
//		3. ȸ������-> SQL			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//		4. DB���� X			
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// ȸ������
	public int update() {
		System.out.println("ȸ������ ����");

		int result = 0;
		Connection conn = null;

		try {
			conn = DBConnect.getConnection();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// ȸ��Ż��
	public int delete() {
		System.out.println("ȸ��Ż�� ����");
		int result = 0;

		Connection conn = null;

		try {
			conn = DBConnect.getConnection();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// ȸ����ȸ -> ������ ��ü��ȯ, �����ϸ� null or empty
	public MemberDto select() {
		System.out.println("ȸ����ȸ ����");

//		MemberDto member = new MemberDto();
		MemberDto member = null;

		Connection conn = null;

		try {
			conn = DBConnect.getConnection();
			// DB�����͸� ��ȸ �ؼ� ������->

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return member;
	}

}