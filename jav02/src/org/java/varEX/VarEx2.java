package org.java.varEX;

public class VarEx2 {
	
	public static void main(String[] args) {
		
		System.out.println("����");
		System.out.println("��ü��(Object),������ ����");
		
		
		// ���ͷ� -> �� �� ��ü -> ���� ���� �� �� ����. -> const
		// "���ڿ�1" , 10, 1.1, 'a' 
		int i=10;
		double d=1.1;
		
		// ��ü�� �ּҰ��� ����
		// new ->��ü ���� ������
		// str1(��ü ��������)
		// str1 -> �ν��Ͻ�,��ü
		String str1=new String("���ڿ�1"); //�ν��Ͻ�ȭ(��üȭ)
		String str2=new String("���ڿ�1");
		String str3="���ڿ�1";
		String str4="���ڿ�1";
		// ���ڿ� ��ü�� �ּ� ���� ��
		System.out.println(str1==str2); // ������?
		System.out.println(str1==str3); // ������?
		System.out.println(str3==str4); // ������?
		System.out.println("===========");
		// ���� �������� ��
		// ��ü. -> ��ü���� ������
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));
		
	}
}
