package org.opEx;

public class ClassBasic3Main {
	public static void main(String[] args) {
	//�ν��Ͻ�ȭ(��üȭ)
	// new->��ü ���� ������
    // c1-> ��ü ,�ν��Ͻ� -> ��ü�� �ּҰ� ����(��ü��������)
	ClassBasic3	c1=new ClassBasic3();
	
	System.out.println(c1);
	System.out.println(c1.hashCode());
	//�ν��Ͻ� ��� -> �ʵ�,�ż���
	
	c1.num1=100;
	c1.num2=200;
	System.out.println(c1.num1+c1.num2);
	c1.name="�̸�";
	System.out.println(c1.name);
	
	c1.arrInt=new int[] {1,2,3,4,5};
	for(int i: c1.arrInt) {
		System.out.println(i+" ");
	}
	//private �ʵ忡 ���� -> ��ȸ
		c1.setUserId("m111");
		//private �ʵ忡 ���� ->��ȸ
		c1.getUserId();
		System.out.println(c1.getUserId());
		c1.getUserId();
	
	}

}
