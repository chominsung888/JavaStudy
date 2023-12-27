package org.java.varEX;

public class VarEx2 {
	
	public static void main(String[] args) {
		
		System.out.println("변수");
		System.out.println("객체형(Object),참조형 변수");
		
		
		// 리터럴 -> 그 값 자체 -> 값을 변경 할 수 없다. -> const
		// "문자열1" , 10, 1.1, 'a' 
		int i=10;
		double d=1.1;
		
		// 객체의 주소값을 저장
		// new ->객체 생성 연산자
		// str1(객체 참조변수)
		// str1 -> 인스턴스,객체
		String str1=new String("문자열1"); //인스턴스화(객체화)
		String str2=new String("문자열1");
		String str3="문자열1";
		String str4="문자열1";
		// 문자열 객체의 주소 값을 비교
		System.out.println(str1==str2); // 같으냐?
		System.out.println(str1==str3); // 같으냐?
		System.out.println(str3==str4); // 같으냐?
		System.out.println("===========");
		// 실제 참조값을 비교
		// 객체. -> 객체접근 연산자
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));
		
	}
}
