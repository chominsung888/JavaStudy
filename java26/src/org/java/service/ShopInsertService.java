package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopInsertService implements ShopSeriver {

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("��ǰ���");
		
		Scanner input =new Scanner(System.in);
		
		System.out.print("��ǰ��ȣ:");
		int no=	input.nextInt();
	
		System.out.print("��ǰ��:");
		String title=input.next();
		
		System.out.print("��ǰ�󼼳���:");
		String detail=input.next();
		
		System.out.print("��ǰ�����:");
		String writer=input.next();
		
		System.out.print("��ǰ�̹��� �߰� (1,0):");
		int isFile=input.nextInt();
		
		//�̱��� ����(DAO�� �ҷ��´�.)
		ShopDao dao=	ShopDao.getInstance();
		
		
		
		
		
		
		//1. �Ű����� ������
		ShopDto shop= new ShopDto(no,title,detail,writer,isFile);
		int result =dao.shopInsert(shop);
		
		int isShop=dao.isShop(shop.getNo());
		if(isShop!=0) {
			System.out.println("�̹� ���� ��ǰ(��ǰ��ȣ)�� ��ϵǾ� �ս��ϴ�.");
			return;
		}
		
		// ��ü-> Dto -> ���, ���� 
		
	//	int result2=dao.shopInsert(shop);
		
		
		if(result !=1) {
			System.out.println("��ǰ��� ����");
		}else {
			System.out.println("��ǰ��� ����");
		}
		
		
	}

}
