package org.java.basicApi;

public class StringEx5 {
	public static void main(String[] args) {
		
		// .do�� ������ ���ڿ��� ����-> �ϳ��� �ż��� substring()
		
		String query1 = "/register.do"; 
		System.out.println(query1.substring(0,query1.length()-3));
		
		String query2 = "/list.do"; 
		System.out.println(query2.substring(0,query2.length()-3));
		
		String query3 = "/modify.do"; 
		System.out.println(query3.substring(0,query3.length()-3));
		
		String query4 = "/memberDelete.do"; 
		System.out.println(query4.substring(0,query4.length()-3));
		
		
		//Ư�� ���ڿ� �����ڿ�(���ڼ�3��) .do -> �ֿܼ� ǥ�� substring(���� �� ���۹���)
		//������ ���۹��� -> ��ü ���ڿ� ����-> ������ ���ڿ� ���� 
		
		System.out.println(query1.substring(query1.length()-3));
		System.out.println(query1.substring(query1.length()-3));
		System.out.println(query1.substring(query1.length()-3));
		System.out.println(query1.substring(query1.length()-3));
		
		
		
		
	}
}
