package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;
import org.java.dto.BoardDto;

public class BoardInsertService implements BoardService {

	@Override
	public void excutQureyService() throws IOException, SQLException {

		System.out.println("�Խñ��ۼ�");

		Scanner input = new Scanner(System.in);

		System.out.println("�۹�ȣ");
		int no = input.nextInt();

		System.out.println("������");
		String title = input.next();

		System.out.println("�۳���");
		String content = input.next();

		System.out.println("�ۼ���");
		String writer = input.next();

		System.out.println("�г���");
		String nickName = input.next();

		BoardDto board = new BoardDto(no, title, content, writer, nickName);

		BoardDao dao = BoardDao.getInstance();

		int result = dao.bInsert(board);

		if (result != 1) {
			System.out.println("���ۼ� ����");
		} else {
			System.out.println("���ۼ� ����");
		}

	}

}
