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
		System.out.println("싱글톤");
	}

	private static class SingtonClass {
		// 싱슬톤 패턴 -> 객체를 한번만 생성
		private static final MemberDao INSTANCE = new MemberDao();

	}

	public static MemberDao getInstance() {
		return SingtonClass.INSTANCE;
	}

	// 회원 가입
	public int insert(String userId, String userPw, int age, String name) {
		int result = 0; // 결과값 처리변수
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			// 1.DB연동
			conn = DBConnect.getConnection();
			// 2. 쿼리문
			query = "insert into member0129(userId,userPw,age,name)values(?,?,?,?)";
			// 3.쿼리문 -> Connection 연결
			pstm = conn.prepareStatement(query);
			// 4.외부 입력 값을 처리
			pstm.setString(1, userId);// 1번째 ?
			pstm.setString(2, userPw);// 1번째 ?
			pstm.setInt(3, age);// 3번째 ?
			pstm.setString(4, name);// 4번째 ?
			// 5. 최종실행 -> 결과를 반환 1이면 성공
			result = pstm.executeUpdate(); // insert,update,delete 쿼리문에 사용

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

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String query = "";
		try {
			// 1.DB연동
			conn = DBConnect.getConnection();
			// 2. 쿼리문
			query = "select * from member0129";
			
			// 3.쿼리문 -> Connection 연결
			pstm = conn.prepareStatement(query);
			// 4.외부 입력 값을 처리. 레코드
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

	// 회원 상세조회(특정회원)->CRUD

	// 회원 수정
	public int update(String userId, String userPw, int age, String name) {
		// userId가 일치 하는 의문의 userPw,age,name을 변경하세요
		int result = 0; // 결과 값 처리 변수

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

			// 성공 1
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

	// 회원 탈퇴
	public int delete(String userId) {
		// userId가 일치하면 회원 탈퇴

		int result = 0; // 결과 값 처리 변수

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
