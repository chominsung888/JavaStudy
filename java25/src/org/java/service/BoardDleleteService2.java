package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;

public class BoardDleleteService2 implements BoardService {

	@Override
	public void excutQureyService() throws IOException, SQLException {

		System.out.println("�Խñ� ���� üũ");
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("��ȸ �� �Խñ� ��ȣ");
		int no =input.nextInt();
		
		BoardDao dao=BoardDao.getInstance();
		int result=dao.isBoard(no);
		
		if(result!=1) {
			System.out.println("�Խñ��� ���� ���� �ʰڽ��ϴ�.");
		}else {
			System.out.println("�Խñ��� ���� �մϴ�.");
			//����, ����, ��ȸ(�ϳ�)
		}
		
		
	}

}
