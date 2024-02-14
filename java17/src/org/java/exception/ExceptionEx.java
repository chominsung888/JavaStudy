package org.java.exception;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {						
											// SQL���� ���� -> DB����
											//������ DAO���� ���ż���
											// ���� ������ü -> �������̽�
	public static void main(String[] args) throws SQLException{
		System.out.println("Excetpion");
		
		Scanner input=new Scanner(System.in);
		System.out.println("������ �� �Է�:");
		int num= input.nextInt();
		
		double avg=0.0;
		try {
			//avg=(double)10/num; //���� �߻�
			avg=(double) 10/ num; //double/int -> double/double -> /0.0
			//���� �߻� �� ����X ��
			System.out.println("���� ���� ����!!");
		}catch(InputMismatchException e) {
			// InputMismatchException -> ó��
			// InputMismatchException -> ���ܰ� �߻��� �ȵǸ� ���� �ȵ�
		
			e.printStackTrace();
		}catch(NumberFormatException e) { // "111" "fsada"
			e.printStackTrace();
		}catch(IllegalArgumentException e) {
			// *** �Է� ���� ����(�Ű�����)�� Ʋ�� ���
			// ��й�ȣ ����, �˻���, ȸ���̺�,,,
			e.printStackTrace();
		}catch(ArithmeticException e) {
			e.printStackTrace();
			
		}finally {
			System.out.println("���� �߻��� ��� ���� ������ ����");
		}
		//���ܸ� ó���ϰ� ���� ����
		System.out.println("���:"+avg);
		System.out.println("��������!!!");
		
	}
}
