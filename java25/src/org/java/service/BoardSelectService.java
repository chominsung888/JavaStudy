package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;

public class BoardSelectService implements BoardService{

	@Override
	public void excutQureyService() throws IOException, SQLException {
		
		
		System.out.println("게시글조회(하나)");
		// 조회 할 게시글 불러와서
		Scanner input = new Scanner(System.in);
		
		System.out.println("조회 할 게시글 번호");
		int no= input.nextInt();
		
		BoardDao dao = BoardDao.getInstance();
		
		BoardDao board=dao.bSelectOne(no);
		System.out.println("글번호:"+board.getNo());
		System.out.println("글번호:"+board.getTitle());
		System.out.println("글번호:"+board.getContent());
		System.out.println("글번호:"+board.getWriter());
		System.out.println("글번호:"+board.getNickName());
	}else {
		System.out.println("조회 할 게시글이 없다.");
		
	}

}
