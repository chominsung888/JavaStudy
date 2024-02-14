package org.ForEx1;

public class ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for문");
		
		// 동일한 구조(요소)를 조회
		// <img src="spring0.jpg" > 
		// <img src="spring1.jpg" > 
		// <img src="spring2.jpg" > 
		// <img src="spring3.jpg" > 
		// <img src="spring4.jpg" > 
		
		
		System.out.println("<img src=\"spring0.jpg\">");
		System.out.println("<img src=\"spring1.jpg\">");
		System.out.println("<img src=\"spring2.jpg\">");
		System.out.println("<img src=\"spring3.jpg\">");
		System.out.println("<img src=\"spring4.jpg\">");
		
		// for문 이용해서 출력 -> 변하지 않는 것은 문자열
		// for문 이용해서 출력 -> 변하는 값은 변수로 설정
		
		String html="<div class='shopList'>";
		
		for(int i=0;i<5;i++) {
			System.out.println("<img src=\"spring"+i+".jpg\">");
			
			
		}
	}

}
