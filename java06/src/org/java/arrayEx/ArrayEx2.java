package org.java.arrayEx;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("배열");
		//int형의 데이터를 저장할 수 있는 배열 arrInt를 선언했다..
		
		int[] arrInt=new int[5];
		System.out.println(arrInt.length);
		// 10~50
		// 배열의 인덱스는 = 전체 배열의 길이 -1 -> < 전체배열
						//5
		for(int i=0;i<arrInt.length;i++) {
			arrInt[i]=i*10+10; //초기화 
			System.out.println("arrInt["+i+"]="+arrInt[i]);
		}
		System.out.println();
		// char형 배열 -> 알파벳 증감식 -> 아스크코드 활용
		
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
			arrStr[i]="<li>상품목록"+i+"</i>";
			System.out.println("arrStr["+i+"]="+arrStr[i]);
		}
		
	}

}
