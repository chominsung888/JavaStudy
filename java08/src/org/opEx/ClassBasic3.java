package org.opEx;

public class ClassBasic3 {
	//���
	
	//1.�ʵ�,������Ƽ,(�Ӽ�), �ϳ��ǰ� 
	// �ν��Ͻ� ��� -> ��ü�� ���� �� �� ��� ���� new
	// ClassBasic3 c1 = new Class Basic3();
	// c1.�ż����(); c1.instancMethod
	// c1.num1; c1.num2; c1.name;c1.arrInt;
	public int num1; // 0 
	public int num2;
	public String name; //�ּҰ�,��ü���� �⺻ �� ->null 
	public int[] arrInt;
	int sum; // ���� ��Ű���������� ���� ���� 
	
	//private �ʵ� -> ���� Ŭ������������ ���� ����
	// ������ ���̽��� �����ϰ� ���� ������ �ʿ��� ����� private����
	//�ܺο��� ���� �� �� ���� ������ �ܺο��� ���� ������ �ż��带 �����Ͽ� ����Ѵ�.
	// setters, getters �ż����.
	private String userId;
	private String userPw;
	
	// static(Ŭ����)��� -> ��ü ���� ���� ��� ����,���� ������ 
	// ��ü ���� ���� Ŭ������.static ��� 
	public static int num3;
	
	//2.�ż��� -> ���, �� ó��, ����
	//�ν��Ͻ� �ż��� ��� -> ��ü�� ���� �� �� ���� new
	//ClassBasic3 c1 = new Class Basic3();
	//c1.�ż����();
	//����������  ��ȯŸ�� �ż����() {	//������}
	
	//����� 
	public void instnacMethod() {
		//������ -> ó��,����,����
		System.out.println("�ż���(�ν��Ͻ�)");
		//�ż���� �⺻�� return(��ȯ��)�ִ�.
//		return;
		
		
		
	}
	//Ŭ����(static)�ż��� -> ��ü ���� ���� ��밡��
	public static void staticMethod() {
		System.out.println("static(Ŭ����)�ż���");
	//	return;
	}
	// ���������� static ��ȯŸ�� �ż����() { //������}
	//getters,setters
	//private String userId;
	// �ܺο��� setters -> �ʱ�ȭ
	public void setUserId(String userId) {
		this.userId=userId;
		
		public String getUserId() {
			return userId;
		
		}
		public void setUserPw(String userPw) {
			this.userPw=userPw;
		}
		public String getUserPw() {
			return userPw;
		}
		
	}
	
	
	
}
