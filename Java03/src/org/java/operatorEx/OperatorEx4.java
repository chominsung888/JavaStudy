package org.java.operatorEx;

public class OperatorEx4 {

	public static void main(String[] args) {
		System.out.println("�񱳿�����");
		
		String str1=new String("���ڿ�1");
		String str2=new String("���ڿ�1");
		String str3="���ڿ�1";
		String str4="���ڿ�1";
		
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		// ���� �� -> ���� �� ������Ʈ �۾� �� ���-. equlas(��üŸ��,String)
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));
		
		int num1=10;
		int num2=20;
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		
		
		
		
	}
}
