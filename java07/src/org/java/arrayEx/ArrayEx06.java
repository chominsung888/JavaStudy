package org.java.arrayEx;

public class ArrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�迭");
		
		char[] arrCh1=new char[5];
		
		// 'A','B','C','D','E'�� arrCh1���߰�
		// 0 1 2 3 4 
		//for���� �̿��� �ۼ�
		int alpha=65;
		
		for(int i=0; i<arrCh1.length;i++) {
			
			arrCh1[i]=(char)(alpha+i); //char -> (char)(int + int)
		}
		System.out.println("�迭�� ��� ��Ҹ� ��ȸ -> for each��");
		for(char ch: arrCh1) {
			System.out.println(ch+" ");
		}
		// �������迭 -> String
		String chStr=new String(arrCh1);
		System.out.println(chStr);
		
		char[] arrCh2=new char[] {'C','A','F','E'};
		String chStr2=new String(arrCh2);
		System.out.println(chStr2);
		
		//int�� �Ʒ�(char,short,byte)�� ����� �ڵ����� int������ ��ȯ
		
		System.out.println((char)('C'-2));
		System.out.println('a'>'A'); // 97>65
		
		
		
		
		
		
	}

}
