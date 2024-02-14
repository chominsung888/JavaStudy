package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopSelectsearchService implements ShopSeriver {

	@Override
	public void excuteQueryService() throws IOException, SQLException {
//		System.out.println("상품검색");
//		
//		
//		Scanner input= new Scanner(System.in);
//		int no =input.nextInt();
//		
//		ShopDao dao= ShopDao.getInstance();
//		
//		int isShop =dao.isShop(no);
//		
//		if(isShop !=1) {
//			System.out.println("조회 할 상품(상품번호)가 없다.");
//			return;
//		}
//		
//		
//		//번호에 해당 하는 상품을 조회-> get
//		ShopDto shop=	dao.serchNo(no);
//		
//		if(shop!=null) {
//			System.out.println("상품번호:"+shop.getNo());
//			System.out.println(",상품명:"+shop.getTitle());
//			System.out.println(",상품상세:"+shop.getDetail());
//			System.out.println(",상품등록자:"+shop.getWriter());
//			
//			
//		}else {
//			System.out.println("조회할 상품(상품 번호)가 없다.");
//		}

		System.out.println("상품등록자 입력:");

		Scanner input = new Scanner(System.in);
		String writer = input.next();

		ShopDao dao = ShopDao.getInstance();

		List<ShopDto> writerList = dao.searchWriter(writer);

		if (writerList.isEmpty()) {
			System.out.println("조회 할 목록이 없습니다.");
		} else {
			System.out.println("상품등록");

			for (ShopDto shop : writerList) {
				System.out.print("상품번호:" + shop.getNo());
				System.out.print("상품명:" + shop.getTitle());
				System.out.print("상품상세:" + shop.getDetail());
				System.out.print("상품등록자:" + shop.getWriter());
				if (shop.getIsfile() != 1) {
					System.out.println(",이미지(0):상품이미지가 없습니다.");
				} else {
					System.out.println("이미지유무(1):" + shop.getIsfile());
				}

			}

		}
	}
}