package org.java.interfaceEx;

public interface interfaceEx1 {

	// �������̽� �ɹ� -> static�ɹ� , �߻� �ż���, default�ż���
	
//	int num1; //�Ϲ� �ɹ�X 
	public static final int num2=100; //static �ɹ� 
	public abstract void ab1(); // �߻�ż���
	
	public static void staticMethod() {
		System.out.println("static�ż���");
	}
	//��ӿ� ���� 0
	default void defaultMethod() {
		System.out.println("default �ż���");
	}
	
	
/*	public void m1() { �Ϲݸż��� X
		System.out.println("�Ϲ� �ż���");
		
	}
*/	
	
	
}
