package org.java.arrayEx;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�迭");
		//int���� �����͸� ������ �� �ִ� �迭 arrInt�� �����ߴ�..
		
		int[] arrInt=new int[5];
		System.out.println(arrInt.length);
		// 10~50
		// �迭�� �ε����� = ��ü �迭�� ���� -1 -> < ��ü�迭
						//5
		for(int i=0;i<arrInt.length;i++) {
			arrInt[i]=i*10+10; //�ʱ�ȭ 
			System.out.println("arrInt["+i+"]="+arrInt[i]);
		}
		System.out.println();
		// char�� �迭 -> ���ĺ� ������ -> �ƽ�ũ�ڵ� Ȱ��
		
		char[] arrCh=new char[5];
		
/*		arrCh[0]='a'; //97
		arrCh[1]=98; //98
		arrCh[2]='c';
		arrCh[3]='d';
		arrCh[4]='e';
*/		
		for(int i=0; i<arrCh.length;i++) {
			arrCh[i]=(char)(i+97); //'a','b','c','d','e'
			System.out.println("arrCh["+i+"]="+arrCh[i]);
		}
		
		//string
		String[] arrStr=new String[5];
		
		for(int i=0; i<arrStr.length;i++) {
			arrStr[i]="<li>��ǰ���"+i+"</i>";
			System.out.println("arrStr["+i+"]="+arrStr[i]);
		}
		
	}

}
