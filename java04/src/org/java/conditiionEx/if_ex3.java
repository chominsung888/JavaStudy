package org.java.conditiionEx;

import java.util.Scanner;

public class if_ex3 {
	public static void main(String[] args) {
		System.out.println("if");
		
		
/*		����,����,������ ����� 90�̻��̸� ��A�� �� �ֿܼ� ���
		����,����,������ ����� 80�̻��̸� ��B�� �� �ֿܼ� ���
		����,����,������ ����� 70�̻��̸� ��C�� �� �ֿܼ� ���
		����,����,������ ����� 60�̻��̸� ��D�� �� �ֿܼ� ���
		����,����,������ ����� 60�̸��̸� ��F�� �� �ַܼ� ���
*/		
		//����,����,���� ������ ���� �Է� �޾Ƽ� ��հ��
		Scanner scn= new Scanner(System.in);
		
		System.out.println("��������:");
		int kor=scn.nextInt();
		
		System.out.println("��������:");
		int eng=scn.nextInt();
		
		System.out.println("��������:");
		int math=scn.nextInt();
		//���հ�
		int sum=kor+eng+math;
		//�����
		int subject=3;
		
		
		//���
		double avg=(double)sum/subject;
		
		System.out.println("���հ�:"+sum+",�����:"+subject+",���:"+avg);
		
		if(avg>=90) {
			if(avg>=95) {
				System.out.println("A+");
			}else
			System.out.println("A");
		}else if(avg>80) {
			System.out.println("B");
		}else if(avg>70) {
		
			System.out.println("C");
		}else if(avg>=60) {
			System.out.println("D");
		}else if(avg<60) {
			System.out.println("F");
		}
		
		scn.close();
		
		
	}
}
		
	
	