package org.ForEx1;

public class ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for��");
		
		// ������ ����(���)�� ��ȸ
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
		
		// for�� �̿��ؼ� ��� -> ������ �ʴ� ���� ���ڿ�
		// for�� �̿��ؼ� ��� -> ���ϴ� ���� ������ ����
		
		String html="<div class='shopList'>";
		
		for(int i=0;i<5;i++) {
			System.out.println("<img src=\"spring"+i+".jpg\">");
			
			
		}
	}

}
