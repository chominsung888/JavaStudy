package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;

public class ShopDleteService implements ShopSeriver{

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("��ǰ����");
		
		
		// ��ǰ ��ȣ�� ���� ��ǰ�� ����
		Scanner input=new Scanner(System.in);
		
		System.out.println("��ǰ��ȣ:");
		int no = input.nextInt();
		
		ShopDao dao=ShopDao.getInstance();
		
		int isShop=dao.isShop(no);
		if(isShop!=1) {
			System.out.println("������ ��ǰ(��ǰ��ȣ)�� �����ϴ�.");
			return;
		}
		int result=dao.shopDelete(no);
		
		if(result !=1) {
			System.out.println("��ǰ���� ����");
		}else {
			System.out.println("��ǰ���� ����");
		}
		
		
	}

}
