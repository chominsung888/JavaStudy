package org.ForEx1;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("while");
		
		// �׽�Ʈ �ڵ� ��� �� �� �ִ�.
		// �Է°��� insert�� -> ȸ������
		// �Է°��� select�� -> ȸ����ȸ
		// �Է°��� update�� -> ȸ������
		// �Է°��� delete�� -> ȸ��Ż��
		// �Է°��� exit�� -> ���α׷� ����
		// �Է°��� �� 5���� �����ϸ� ->  �ֿܼ� ���
		
		Scanner scn=new Scanner(System.in);
		
		while(true) {
			System.out.println("�������� �Է����ּ���");
			System.out.println("������: ");
			
			String query=scn.next();
			if(query.equals("insert")) {
				System.out.println("ȸ������");//��ǰ���, ��ٱ���,�Խñ۵��
			}else if(query.equals("select")) {
				System.out.println("ȸ����ȸ");// ��ǰ��ȸ,��ٱ���, �Խñ���ȸ,�˻�
			}else if(query.equals("update")) {
				System.out.println("ȸ������");
			}else if(query.equals("delete")) {
				System.out.println("ȸ��Ż��");//��ǰ����, ��ٱ��ϻ���,�Խñ� ����
			}
			if(query.equals("exit")) {
				System.out.println("���α׷� ����");
				break;
			}
			
		}
		
		scn.close();
		System.out.println("main����");
		
	}

}
