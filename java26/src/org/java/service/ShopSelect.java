package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopSelect implements ShopSeriver{

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("��ǰ��ȸ(���)");
		ShopDao dao= ShopDao.getInstance();
		
		List<ShopDto> shopList=dao.shopSelectAll();
		
		if(shopList.isEmpty()) {
			System.out.println("��ȸ �� ��ǰ����� ����.");
		}else {
			System.out.println("��ü ��ǰ���");
			System.out.println("=============froeach��==========");
		for(ShopDto shop:shopList) {
			System.out.print("��ǰ��ȣ:"+shop.getNo());
			System.out.print("��ǰ��:"+shop.getTitle());
			System.out.print("��ǰ��:"+shop.getDetail());
			System.out.print("��ǰ�����:"+shop.getWriter());
			if(shop.getIsfile()!=1) {
				System.out.println(",�̹���(0):��ǰ�̹����� �����ϴ�.");
			}else {
			System.out.println("�̹�������(1):"+shop.getIsfile());
		}
		}
		
		System.out.println("=======forEach()================");
	shopList.forEach(shop->{
		System.out.print("��ǰ��ȣ:"+shop.getNo());
		System.out.print("��ǰ��:"+shop.getTitle());
		System.out.print("��ǰ��:"+shop.getDetail());
		System.out.print("��ǰ�����:"+shop.getWriter());
		if(shop.getIsfile()!=1) {
			System.out.println(",�̹���(0):��ǰ�̹����� �����ϴ�.");
		}else {
		System.out.println("�̹�������(1):"+shop.getIsfile());
		}
		});
			
		}
		}	
			
		}
		
