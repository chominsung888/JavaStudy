package org.java.operatorEx;

public class OperratorEx8 {
	
	 public static void main(String[] args) {
		System.out.println("���׿�����");
		
		
		int i =10;
		// 1. ++
		System.out.println(i++); // �� ó�� �� ���� 10������ ����
		System.out.println(i); //11
		System.out.println(++i);// �� ���� �� ó��
		System.out.println(i); //12
		
		//2. --
		System.out.println(i--); //�� ó�� �� ���� 12
		System.out.println(i); //11
		System.out.println(--i);// �� ���� �� ó�� 10
		System.out.println(i); //10
		
		System.out.println("--------------------");
		// 1~10 ���� �ֿܼ� ���
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.print(5);
		System.out.print(6);
		System.out.print(7);
		System.out.print(8);
		System.out.print(9);
		System.out.println(10);
		
		System.out.println("--------------------");
		
		// ���� for����  0���� ���� -> �迭�� ������ 0���� ����
		for(int i2=0; i2<10; i2++) {
			// ���ǽ��� true�� ��ɹ��� ���� �ϰ�
			// 1���� 
			// 1���� 10����
			
			int i3=i2*50;
			System.out.print((i3)+" ");
		}
		
	}
}
