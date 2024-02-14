
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
		System.out.println("싱글톤");
	}

	private static class SingtonClass {

		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingtonClass.INSTANCE;

	}
	// 1.회원가입

	public int insert(String userId, String userPw, int age, String name) {
		int result = 0;
		
		// 먼저 -> 회원유무
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

// 회원 조회(목록 조회)-> 전체회원 조회
	public List<MemberDto> select() {
		List<MemberDto> members = new ArrayList<MemberDto>();
		// 1.DB연동
		Connection conn = null;
		// 2. SQL처리
		PreparedStatement pstm = null;
		// 3. SQL문처리
		String query = "";
		// 4.ResultSet -> DB데이터get
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select *from member0130";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();// 테이블 레코드 반환

			if (rs != null) {
				while (rs.next()) {// 레코드
					String userId = rs.getString(1);// 레코드1(칼럼)
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

// 회원 상세조회(특정회원)->CRUD

// 회원 수정
	public int update(String userId, String userPw, int age, String name) {
		// userId가 일치 하는 의문의 userPw,age,name을 변경하세요
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
	// 4.회원 탈퇴

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

	// 5.회원 조회
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

			rs = pstm.executeQuery();// 테이블 레코드 반환

			if (rs != null) {
				while (rs.next()) {// 레코드

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

	// 6.회원 조회(회원 유무)-> 1이면 존재하고 나머지X
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
					result = rs.getInt(1); //1 -> 회원이 존재, 0-> 존재X
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
