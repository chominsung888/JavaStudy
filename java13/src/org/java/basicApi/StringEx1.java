package org.java.basicApi;

public class StringEx1 {

	public static void main(String[] args) {
		System.out.println("String");
		//������� 
		String str1= new String("java2024"); //new ��ü
		String str2= "java2024";//���ͳ� ****���� �ʿ� 
		//char [] �̿��ؼ� ���� 
		char[] ch1= {'j','a','v','a','2','0','2','4'};
		String str3=new String(ch1);
		
		System.out.println(str1+","str2+","+str3);
		
		System.out.println(str1==str2);
		System.out.println("�ּҺ�");
		System.out.println(str2==str3);
		System.out.println(str1==str3);
		
		
		
		
		System.out.println(str1.equals(str2));
		
		
		
	}
}
