package org.ForEx1;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for��");
		// ������ ���۴�,������ �Է� �޾Ƽ�(����) �������� ���
		// ��) ���۴� 4, ���� 7 -> 4��,5��,6��,7���� �ֿܼ� ���
		// 2*1=1,,,,,,,, 7*9=63
		// ��. ������ ���۴��� ���ܺ��� �۾ƾ� �ȴ�.
		// ���࿡ ���۴��� ���ܺ��� ���� ������ "���۴��� ���ܺ��� �۾ƾ��մϴ�" ���
		// if~else ,for ��� 
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("���۴� �Է�:");
		int startNum=scn.nextInt(); //�񱳿����� ->int�� 
		

		System.out.println("���� �Է�:");
		int endNum=scn.nextInt(); //�񱳿����� ->int��
		
		if(startNum<endNum) {
			System.out.println("���۴�:"+startNum+", ����:"+endNum);
			
			for(int i=startNum;i<=endNum;i++) {
				System.out.println(i+"���Դϴ�.");
				for(int j=1;j<=9;j++) {
					System.out.println(i+"*"+j+"="+(i*j));
				}
			}
		}else {
			System.out.println("���۴��� ���ܺ��� �۾ƾ��մϴ�.");
		}
	}

}
