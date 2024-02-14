package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopUpdateService	implements ShopSeriver {

	@Override
	public void excuteQueryService() throws IOException, SQLException {
	System.out.println("상품 수정");
	Scanner input =new Scanner(System.in);
	
	System.out.print("상품번호:");
	int no=	input.nextInt();

	System.out.print("상품명:");
	String title=input.next();
	
	System.out.print("상품상세내역:");
	String detail=input.next();
	
	System.out.print("상품등록자:");
	String writer=input.next();
	
	System.out.print("상품이미지 추가 (1,0):");
	int isFile=input.nextInt();
	
	//싱글톤 패턴(DAO를 불러온다.)
	ShopDao dao=	ShopDao.getInstance();
	
	//1. 매개인자 여러개
	ShopDto shop= new ShopDto(no,title,detail,writer,isFile);
	// 객체-> Dto -> 등록, 수정 
	
	
	
	
	int result =dao.shopUpdate(shop);	
	
	
	if(result !=1) {
		System.out.println("상품수정 실패");
	}else {
		System.out.println("상품수정 성공");
	}
	
	}

}
