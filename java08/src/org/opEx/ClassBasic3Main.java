package org.opEx;

public class ClassBasic3Main {
	public static void main(String[] args) {
	//인스턴스화(객체화)
	// new->객체 생성 연산자
    // c1-> 객체 ,인스턴스 -> 객체의 주소값 저장(객체참조변수)
	ClassBasic3	c1=new ClassBasic3();
	
	System.out.println(c1);
	System.out.println(c1.hashCode());
	//인스턴스 멤버 -> 필드,매서드
	
	c1.num1=100;
	c1.num2=200;
	System.out.println(c1.num1+c1.num2);
	c1.name="이름";
	System.out.println(c1.name);
	
	c1.arrInt=new int[] {1,2,3,4,5};
	for(int i: c1.arrInt) {
		System.out.println(i+" ");
	}
	//private 필드에 접근 -> 조회
		c1.setUserId("m111");
		//private 필드에 접근 ->조회
		c1.getUserId();
		System.out.println(c1.getUserId());
		c1.getUserId();
	
	}

}
