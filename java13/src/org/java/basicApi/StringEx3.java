package org.java.basicApi;

import java.util.Scanner;

public class StringEx3 {
	public static void main(String[] args) {
		System.out.println("String");
		System.out.println("substring");
		
		
		String str1="java 2024 project";
		System.out.println("substring(�ε���) -> ���ڿ��� �ε������� ��ȯ(return)");
		
		System.out.println(str1.length()); //17
		System.out.println(str1.substring(0));
		System.out.println(str1.substring(10));
		System.out.println(str1.substring(5));
		System.out.println("project".length()); //project ����
				
					//10    3 <-���ڸ� ���� �� ���ڿ� 
					//10 -3 -> 7 -> �ε���
		String insert="/member_insert.do";
		String dolenth=".do";
		
		// ���� -> ��ü���ڿ� ���� - ������ ���ڿ� (�����ڿ�) -> 
		// substring(���۹���)
		System.out.println(insert.length());
		System.out.println(insert.substring(7));
		// ��ü ���ڿ� ���� - ",do"
		System.out.println(insert.length()-dolenth.length()); //7
		int index=insert.length()-dolenth.length();
		System.out.println(insert.substring(index));
		
		System.out.println("����:");
		//����
		//update, select ,delete ���ڿ����� ������. do�� �ֿܼ� ���
		// �� .substring() �̿��ؾ��մϴ�. 
		
		String update="/member_update.do"; //".do"
		System.out.println(update.substring(update.length()-".do".length()));
		
		String select="/member_select.do"; //".do"
		System.out.println(update.substring(update.length()-".do".length()));
		
		String delete="/member_delete.do"; //".do"
		System.out.println(update.substring(update.length()-".do".length()));
		
		System.out.println("����� ��û ���� �Է�");
		
		Scanner input=new Scanner(System.in);
		System.out.println("�Է�(�ݵ�� ���� .do�� �Է�: ");
		String query=input.next(); 
		System.out.println(query);
		
		// query���� .do�� query2�� �����ϰ� ���
		int index2=query.length()-".do".length();
		String query2=query.substring(index2);//.do��
		System.out.println(query);
	}
	
}
