package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;

public class BoardSelectService implements BoardService{

	@Override
	public void excutQureyService() throws IOException, SQLException {
		
		
		System.out.println("�Խñ���ȸ(�ϳ�)");
		// ��ȸ �� �Խñ� �ҷ��ͼ�
		Scanner input = new Scanner(System.in);
		
		System.out.println("��ȸ �� �Խñ� ��ȣ");
		int no= input.nextInt();
		
		BoardDao dao = BoardDao.getInstance();
		
		BoardDao board=dao.bSelectOne(no);
		System.out.println("�۹�ȣ:"+board.getNo());
		System.out.println("�۹�ȣ:"+board.getTitle());
		System.out.println("�۹�ȣ:"+board.getContent());
		System.out.println("�۹�ȣ:"+board.getWriter());
		System.out.println("�۹�ȣ:"+board.getNickName());
	}else {
		System.out.println("��ȸ �� �Խñ��� ����.");
		
	}

}
