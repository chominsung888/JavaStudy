package org.java.basicApl;import java.util.Scanner;

import javax.naming.directory.SearchControls;

public class StringEX7 {
	public static void main(String[] args) {
		System.out.println("String");
		
		String str1="java";
		String str2="2024";
		// ���ڿ�1+���ڿ�2 -> ���ο� ���ڿ� ** ������ ������ ����
		String str3=str1.concat(str2);
		System.out.println(str3);
		System.out.println(str1);
		//Ư�� ���ڿ��� ���ԵǾ� �ִ���? ->�˻�
		String search="java";
		String oldContent="java project"; 
						//�����ڿ����� ã�� Ű����
		boolean result=oldContent.contains(search);//������(�������� ����)
		System.out.println(result);
		if(result==true) {
			System.out.println("java �˻� �� �� �ֽ��ϴ�.");
		}else {
			System.out.println("java�� �˻� �� �� �����ϴ�.");
		}
		//��û ���ڿ��� ���ϴ� ��ġ���� ��ȸ(���ڿ� ����) -> ���� ��Ʈ�ѷ����� Ȱ��
		
		String requestURL="/insert.do";
		// ����1
		int size=requestURL.length(); // ��ü ���ڿ� ����
		int valSize=".do".length();   // ������ ������ ���ڿ� ����
		int startIdx=size=valSize;    // ������ ������ ���ڿ� ù��° �ε���
		
		// ���ڿ� ���ڷ� 3�� ���� .do
		// subString(�ε���) -> ��ü����-3 -> ������ ���۹���
		System.out.println(requestURL.substring(startIdx));
		//������ Ư��(�ݺ� ���ڿ�) ���ڿ��� �����ϰ� 0��������(ó��) ���� 
		// /insert.do, modyfy.do,memberUpdate.do
		// ��ü���� -������ ���� �� ���ڿ� ���� -> startIdx -> ������ ���ڿ� ����
		System.out.println(requestURL.substring(0,startIdx));
		
		System.out.println("���ڿ� �Է�(���� .do�� �����ߵȴ�.)");
		
		Scanner input= new Scanner(System.in);
		
		String requestInput=input.next();
		System.out.println("�ԷµȰ�: "+requestInput);
		String rsStr=requestInput.substring(0,requestInput.length()-3);
		System.out.println(".do��ȸ ���ڿ�:"+rsStr);
		
		
		
		
		
		
		
		
	}
}
