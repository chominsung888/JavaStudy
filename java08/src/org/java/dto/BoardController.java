package org.java.dto;

public class BoardController {
	
	public static void main(String[] args) {
		
		BoardDto  board1=new BoardDto();
		
		board1.setNo(1);
		board1.setTitle("������1");
		board1.setContent("�۳���1");
		board1.setWriter("�ۼ���1");
		board1.setNickName("�г���1");
		board1.setHit(1);
		
		String info=board1.toString();
		System.out.println(info);
		
		int no=board1.getNo();
		String title=board1.getTitle();		
		String content=board1.getContent();		
		String writer=board1.getWriter();		
		String nickname=board1.getNickName();		
		String hit=board1.getHit();		
	}
}

