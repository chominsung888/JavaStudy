package org.java.oopExTest;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Register member1 =new Register();
		
		Scanner input=new Scanner(System.in);
		
		boolean bool=false;
		
		while(!bool) {
			System.out.println("ȸ�������� ���� �Ͻðڽ��ϱ�?"
					+ "\n while�� ����� exit, ȸ�� ���� ������ yes,ȸ������ ���� no");
			String order=input.next();
			if(order.equals("yes")) {
				System.out.println("ȸ������ ���� 0");
				// ���̵�, ��й�ȣ, ���� �Է��ϰ�
				// ���̵�, ��й�ȣ, ���� �Է��ϰ� �ֿܼ� id: m11, password:m11, age:11 ����ϰ�
				// setters,getters �̿�, toString �̿�
				// �ٽ� ó������ ���ư����� �ۼ��غ�����.
				
				System.out.println("���̵� �Է�:");
				String userId=input.next();
				member1.setId(userId);
				
				System.out.println("��й�ȣ �Է�:");
				String password=input.next();
				member1.setPassword(password);
				
				System.out.println("���� �Է�:");
				int age=input.nextInt();
				member1.setAge(age);
				
				

				System.out.println();
				String info=member1.toString();
				System.out.println(info);
				
				
			}else if(order.equals("no")) {
				System.out.println("ȸ������ ���� X,�ٸ� �۾�-> ");
			}else if(order.equals("exit")) {
				System.out.println("while����");
				bool=false; //true -> false
				
				
			}else {
				System.out.println("�Է°� ����-> �ٽ� �Է� �ϼ���");
			}
			
			
		}
	
		input.close();
	}
	
}
