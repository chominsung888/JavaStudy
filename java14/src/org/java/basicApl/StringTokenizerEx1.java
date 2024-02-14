package org.java.basicApl;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
		
		System.out.println("StringTokenizer");
		
		String url="userId=m111&userPw=1111&userName=���̸�";
		//������(��ȣ) &�� �̿��ؼ� ��ū �и�
		StringTokenizer token=new StringTokenizer(url, "&");
		int total=token.countTokens(); // ��ü ��ū�� ����
		System.out.println(total); // userId=m111, userPw=1111, userName=���̸�
		// ���ڿ��� ��� ��ū�� ��ȸ -> while
		// ��ū�� ���� �ϸ� while���� ���� has~
		while(token.hasMoreTokens()) {
			//���ڿ��� ��ū�� �ϳ��� ��ȸ
		String elToken=	token.nextToken(); //next~
		System.out.println(elToken);
		}
		
		System.out.println("======================");
		String phone="010-1234-5678";
		//while���� �̿��ؼ� �ֿܼ� ������(-)�� �����ϰ� ����غ�����
		
		StringTokenizer token2=new StringTokenizer(phone,"-" );
		System.out.println(token2.countTokens());
		while(token2.hasMoreTokens()) {
			String elToken =token2.nextToken();
			System.out.println(elToken);
			
			// StringBuffer -> String 
		StringBuffer sf3=new StringBuffer("String ����");
		//String.valueOf(sf3); -> Ư����ü�� String���� ��ȯ 
		
		String sf3Tost=sf3.toString();
		System.out.println(sf3Tost+"<< String");
		
		
		
		
		
		}
		
		
	}
}
