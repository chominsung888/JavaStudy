package org.java.oopEx;

public class ConstructExMain {
	public static void main(String[] args) {
	//�ν��Ͻ�ȭ c1
	//new -> ��ü ����
	ConstructEx c1 = new ConstructEx();
	c1.setUserId("m2");
	c1.setUserPw("333");
	System.out.println(c1.getUserId());
	System.out.println(c1.getUserPw());
	
	// �Ű����� 1
	ConstructEx c2 = new ConstrunctEx("m111");
	//��ü ������ ���� ���� 
//	c2.setUserId("m4"); //�̹� ���� ���� ����
	System.out.println(c2.getUserId());
	
	//�Ű����� 2
	ConstrunctEx c3 new ConstrunctEx("m2","22");
	System.out.println(c3.getUserId());
	System.out.println(c3.getUserPw());
	
	//�Ű����� 3
	ConstructEx new ConstructEx("m4","44",30);
	System.out.println(c4.getUserId());
	System.out.println(c4.getUserPw());
	System.out.println(c4.getAge());
	
	}
}
