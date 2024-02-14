package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopSelect implements ShopSeriver{

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("상품조회(목록)");
		ShopDao dao= ShopDao.getInstance();
		
		List<ShopDto> shopList=dao.shopSelectAll();
		
		if(shopList.isEmpty()) {
			System.out.println("조회 할 상품목록이 없다.");
		}else {
			System.out.println("전체 상품목록");
			System.out.println("=============froeach문==========");
		for(ShopDto shop:shopList) {
			System.out.print("상품번호:"+shop.getNo());
			System.out.print("상품명:"+shop.getTitle());
			System.out.print("상품상세:"+shop.getDetail());
			System.out.print("상품등록자:"+shop.getWriter());
			if(shop.getIsfile()!=1) {
				System.out.println(",이미지(0):상품이미지가 없습니다.");
			}else {
			System.out.println("이미지유무(1):"+shop.getIsfile());
		}
		}
		
		System.out.println("=======forEach()================");
	shopList.forEach(shop->{
		System.out.print("상품번호:"+shop.getNo());
		System.out.print("상품명:"+shop.getTitle());
		System.out.print("상품상세:"+shop.getDetail());
		System.out.print("상품등록자:"+shop.getWriter());
		if(shop.getIsfile()!=1) {
			System.out.println(",이미지(0):상품이미지가 없습니다.");
		}else {
		System.out.println("이미지유무(1):"+shop.getIsfile());
		}
		});
			
		}
		}	
			
		}
		
