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
//		System.out.println("��ǰ�˻�");
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
//			System.out.println("��ȸ �� ��ǰ(��ǰ��ȣ)�� ����.");
//			return;
//		}
//		
//		
//		//��ȣ�� �ش� �ϴ� ��ǰ�� ��ȸ-> get
//		ShopDto shop=	dao.serchNo(no);
//		
//		if(shop!=null) {
//			System.out.println("��ǰ��ȣ:"+shop.getNo());
//			System.out.println(",��ǰ��:"+shop.getTitle());
//			System.out.println(",��ǰ��:"+shop.getDetail());
//			System.out.println(",��ǰ�����:"+shop.getWriter());
//			
//			
//		}else {
//			System.out.println("��ȸ�� ��ǰ(��ǰ ��ȣ)�� ����.");
//		}

		System.out.println("��ǰ����� �Է�:");

		Scanner input = new Scanner(System.in);
		String writer = input.next();

		ShopDao dao = ShopDao.getInstance();

		List<ShopDto> writerList = dao.searchWriter(writer);

		if (writerList.isEmpty()) {
			System.out.println("��ȸ �� ����� �����ϴ�.");
		} else {
			System.out.println("��ǰ���");

			for (ShopDto shop : writerList) {
				System.out.print("��ǰ��ȣ:" + shop.getNo());
				System.out.print("��ǰ��:" + shop.getTitle());
				System.out.print("��ǰ��:" + shop.getDetail());
				System.out.print("��ǰ�����:" + shop.getWriter());
				if (shop.getIsfile() != 1) {
					System.out.println(",�̹���(0):��ǰ�̹����� �����ϴ�.");
				} else {
					System.out.println("�̹�������(1):" + shop.getIsfile());
				}

			}

		}
	}
}