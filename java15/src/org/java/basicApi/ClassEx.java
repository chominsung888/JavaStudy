package org.java.basicApi;

public class ClassEx {
	public static void main(String[] args) {
		System.out.println("Class");
		//Ŭ���� �ִ��� Ȯ�� 
		// ������ Exception(����)�� �߻� ��Ų��.
		// ������ �������
		// �ݵ�� ����ó���� ���־���Ѵ�. ->�� �ڵ����� ��������
		
		try {
			// ���ܰ� �߻� �� ���ɼ� �ִ� �ڵ� (��ɹ�)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//����(���� �� �� �ִ� ����)�� �߻��� �Ǹ�
		}catch(ClassNotFoundException e) {
			// ����(���� �� �� �ִ� ����-> ���α׷� ����0
			e.printStackTrace();
			System.out.println("����̹�NO");
		}
		
		System.out.println("���α׷� ���� ����");
		
		
	}
}
