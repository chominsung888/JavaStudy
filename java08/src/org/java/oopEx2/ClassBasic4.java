package org.java.oopEx2;

public class ClassBasic4 {

	
	//�ν��Ͻ� ��� 
	public int num1;
	public int num2;
	
	private String userId; //setters,getters
	private String userPw; //setters,getters
	
	
	//�ż��� -> return�� -> <- ��ȯŸ�� Ÿ�� ��ġ �ؾߵȴ�.
	//�ż��� ����1
	// void return���� ����. ��������
	
	public void method1() {
		//��������(local) -> �ż��尡 ����Ǹ� �޸𸮿� ����
		int m1=10;
		int m2=20;
		int s1=m1+m2;
		
		
		System.out.println("�ż���(�ν��Ͻ�)");
//		return;
	}
	//�ż��� ����2
	//void return ���� ����, �Է°��� �ִ�.
	public void method2(int num1,int num2) {
		//��������(local) -> �ż��尡 ����Ǹ� �޸𸮿� ����
		System.out.println(num1+num2);
//		return;
	}
	//�ż��� ����3
	//��ȯŸ�� �� �ݵ�� return���� �־���Ѵ�.
	//�Է°��� ����.
	
	public int method3() {
		return 100;
	}
	
	public String method31() {
		return "��ȯ���ڿ�";
	}
	
	//�ż��� ����4
	// ��ȯŸ�� �� �ݵ�� return ���� �־���Ѵ�.
	//�Է°��� �ִ�.
	
	public int method4(int num1, int num2) {
		int sum=num1+num2;
		return sum;
		
	}
	
}
