package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;

public class ShopDleteService implements ShopSeriver{

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("상품삭제");
		
		
		// 상품 번호가 같은 상품을 삭제
		Scanner input=new Scanner(System.in);
		
		System.out.println("상품번호:");
		int no = input.nextInt();
		
		ShopDao dao=ShopDao.getInstance();
		
		int isShop=dao.isShop(no);
		if(isShop!=1) {
			System.out.println("삭제할 상품(상품번호)이 없습니다.");
			return;
		}
		int result=dao.shopDelete(no);
		
		if(result !=1) {
			System.out.println("상품삭제 실패");
		}else {
			System.out.println("상품삭제 성공");
		}
		
		
	}

}
