package org.java.basicApi;

import java.util.Scanner;

public class StringEx6 {
	public static void main(String[] args) {
		
	
	// Scanner �̿��ؼ� �Է°��� ".do"�� ȸ������ ����(while)
	// �Է°��� "exit" -> ��ü while�� ����
	// �Է°��� .do, exit�̿��� ���� �Է��ϸ� -> �ٽ� �Է� �ܼ�
	
	// ���� while�� -> ".do"�� ȸ������ ����(while)
	// "/insert.do" �ԷµǸ� -> "ȸ������" �ܼ�
	// "/select.do" �ԷµǸ� -> "ȸ����ȸ" �ܼ�
	// "/update.do" �ԷµǸ� -> "ȸ������" �ܼ�
	// "/delete.do" �ԷµǸ� -> "ȸ��Ż��" �ܼ�
	// "/fdsafda.do" �߸� .do -> "�ٽ� �Է� ���ּ���"
	// "/exit.do" �ԷµǸ� -> ��ü while���� ����
	System.out.println("����� ��û ���� �Դϴ�.(/inset.do�Է�)");
	Scanner input=new Scanner(System.in);
	
	boolean bool=true;
	while(bool) {
		System.out.println("��û�����Է�:");
		String order=input.next();
		System.out.println(order);
		
		if(order.equals("exit")) {
			bool=false;
		}else {
			
		}
		
		String rsOrder=order.substring(order.length()-3);
		System.out.println(rsOrder);
		
		if(rsOrder.equals(".do")) {
			
			System.out.println("��û����->"+order);
			String url=order.substring(0,order.length()-3);
			System.out.println(".do ����-> "+url);
			
			if(url.equals("/insert")) {
				System.out.println("ȸ������");
			}else if(url.equals("/update")) {
				System.out.println("ȸ������");
			}else if(url.equals("/select")) {
				System.out.println("ȸ����ȸ");
			}else if(url.equals("/delete")){
				System.out.println("ȸ�� Ż��");
			}else
				System.out.println("URL�Է¿���-> �ٽ��Է� ���ּ���"); {
		}
			
			
		}else if(order.equals("exit")) {
			System.out.println("���� ����");
			bool=false;
		}else {
			System.out.println("�ٽ� �Է� ���ּ���");
		}
		
		
		
		
	}

	}
}


