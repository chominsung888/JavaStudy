package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;

public class BoardDleleteService2 implements BoardService {

	@Override
	public void excutQureyService() throws IOException, SQLException {

		System.out.println("게시글 유무 체크");
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("조회 할 게시글 번호");
		int no =input.nextInt();
		
		BoardDao dao=BoardDao.getInstance();
		int result=dao.isBoard(no);
		
		if(result!=1) {
			System.out.println("게시글이 존재 하지 않겠습니다.");
		}else {
			System.out.println("게시글이 존재 합니다.");
			//수정, 삭제, 조회(하나)
		}
		
		
	}

}
