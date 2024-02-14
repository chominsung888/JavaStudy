package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.java.connect.DBConnect;
import org.java.dto.ShopDto;

import oracle.jdbc.proxy.annotation.Pre;

public class ShopDao {

	private ShopDao() {
		System.out.println("싱글톤-> Shop");
	}

	private static class SingleTonClass {

		private static final ShopDao INSTANCE = new ShopDao();
	}

	public static ShopDao getInstance() {
		return SingleTonClass.INSTANCE;
	}

	public int shopInsert(ShopDto shop) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.geConnection();
			query = "insert into shop0131(no,title,detail,writer,isFile) values(?,?,?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, shop.getNo());
			pstm.setString(2, shop.getTitle());
			pstm.setString(3, shop.getDetail());
			pstm.setString(3, shop.getWriter());
			pstm.setInt(2, shop.getIsfile());

			result = pstm.executeUpdate();

		} catch (Exception e) {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		return 0;

	}

	public List<ShopDto> shopSelectAll() {

		List<ShopDto> shopList = new ArrayList<ShopDto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.geConnection();
			query = "select * from shop0131";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					int no = rs.getInt(1);
					String title = rs.getString(2);
					String detail = rs.getString(3);
					String writer = rs.getString(4);
					int isFile = rs.getInt(5);

					ShopDto dto = new ShopDto(no, title, query, title, isFile);
					shopList.add(dto);
//					shopList.add(new ShopDto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));

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
				// 조회 시
				if (rs != null)
					rs.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		return shopList;
	}

	public int shopUpdate(ShopDto shop) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.geConnection();
			query = "update shop0131 set title=?,detail=?,writer=?, isFile=?   where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, shop.getTitle());
			pstm.setString(2, shop.getDetail());
			pstm.setString(3, shop.getWriter());
			pstm.setInt(4, shop.getIsfile());
			pstm.setInt(5, shop.getNo());

			result = pstm.executeUpdate();

		} catch (Exception e) {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		return 0;
	}

	// 5.상품(상품번호)존재하는 지 확인
	public int isShop(int no) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.geConnection();
			query = "select count(*) from shop0131 where no=?";
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, no);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				// 조회 시
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;

	}

// 상품 삭제 
	public int shopDelete(int no) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.geConnection();
			query = "dlete from shop0131 where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);

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

	// 7.상품번호(상품)하나 조회
	public ShopDto serchNo(int no) {
		ShopDto shop = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.geConnection();
			query = "select *from shop0131 where no=?";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			if (rs != null) {
				if (rs.next()) {

					shop = new ShopDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
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

		return null;
	}

	public List<ShopDto> searchWriter(String writer) {

		List<ShopDto> writerList = new ArrayList<ShopDto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.geConnection();
			query = "select * from shop0131 where writer=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, writer);

			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {

					int no = rs.getInt(1);
					String title = rs.getString(2);
					String detail = rs.getString(3);
					String writer2 = rs.getString(4);
					int isFile = rs.getInt(5);

					ShopDto dto = new ShopDto(no, title, detail, writer2, isFile);
					writerList.add(dto);
//					shopList.add(new ShopDto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));

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
				// 조회 시
				if (rs != null)
					rs.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		return writerList;
	}

}
