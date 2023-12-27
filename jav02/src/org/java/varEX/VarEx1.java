package org.java.varEX;

public class VarEx1 {
	public static void main(String[] args) {
		System.out.println("변수");
		//1. 주소값
		//2. 주소가 참조 하는 값
		
		System.out.println("자바의 기본자료형(primitive Type)");
		//정수형 자료형(타입) -> 10 기본형 int
		// byte b; b=10;	
		byte b=10;   //byte형 변수 b를 선언하고 byte형 정수 10으로 초기화 했다. 1byte
		short s=10; //short형 변수 s를 선언하고 short형 정수 10으로 초기화 했다. 2byte
		int i=10;   //int형 변수 i를 선언하고 i형 정수 10으로 초기화 했다. 4byte
		long l =10; //long형 변수 l를 선언하고 l형 정수 10으로 초기화 했다. 8byte
		
		//실수형 자료형(타입) -> 1.1 기본 double(8byte)
		// (float)1.1 -> 강제 형변환
		float f=1.1f; //float 형 변수 f를 선언하고 float 형 실수 1.1.으로 초기화 했다. 4byte
		double d=1.1; //dlouble형 변수 d를 선언하고 double형 실수 1.1.으로 초기화 했다. 8byte
		
		//문자형 자료형(char) -> '', 한글자 
		char ch='a'; //char 형 변수 ch를 선언하고 char 형 실수 'a'으로 초기화 했다. 2byte
		boolean bool=false;////boolean 형 변수 bool를 선언하고 boolean 형 false로 초기화 했다. 1byte
		
		
	}
}
