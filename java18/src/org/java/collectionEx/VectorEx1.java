package org.java.collectionEx;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		System.out.println("Vector");
		//정수형 데이터를 저장할 수 있는 Vector생성
	Vector<Integer> v1=	new Vector<Integer>();
		
	Integer i1= new Integer(10); //박싱
	Integer i3=40;
	
	v1.add(i1); // 생성 객체를 참조하는 인스턴스를 추가 
	v1.add(new Integer(20)); //생성된 객체를 바로 추가 
	v1.add(new Integer(30));
	v1.add(40); //자동 박싱
	v1.add(50); //자동 박싱
	// Vector 요소의 타입 -> Integer
	// v1 -> 백터객체
	for(Integer i: v1) {
		//모든 백터요소를 조회
		System.out.println(i);
	}
	
	System.out.println();
	
	//컬렉션에 객체를 추가 하는 방법
	// 1.기본자료형(8가지) -> Wrapper, 인스턴스, new, 자동박싱
	Vector<Double> v2= new Vector<Double>();
	//인스턴스
	Double d= new Double(1.1); //박싱
	Double d2=3.3;//자동박싱
	v2.add(3.3);//자동박싱
	v2.add(4.3);
	v2.add(5.3);
	v2.add(new Double(2.2));
	//v2의 모든 요소를 콘솔에 출력 foreach문
	for(Double i: v2) {
		System.out.println(v2);
	}
	
	
	
	
	Vector<Float> v3= new Vector<Float>();
	v3.add(1.1f);
	v3.add(1.2f);
	v3.add(1.3f);
	v3.add(1.4f);
	for(Float i: v3) {
		System.out.println(v3);
	}
	
	// 2. String -> new, ""
	
	Vector<String> v4 =new Vector<String>();
	String str1=new String("문자열1");
	String str2 ="문자열2";
	
	v4.add(str1);
	v4.add(str2);
	v4.add(new String("문자열3"));
	v4.add("문자열4");
	v4.add("문자열5");
	
	for(String i: v4) {
		
		System.out.print(i);
	   System.out.print("길이:"+i.length());
	   System.out.println(i.equals("문자열1"));
	   
	}
	System.out.println();
	
	// 3. 일반 클래스 -> new, 타입 변수
	
	
			MemberDto member1= new MemberDto(10,"m1");
			MemberDto member2= new MemberDto(20,"m2");
			MemberDto member3= new MemberDto(30,"m3");
			MemberDto member4= new MemberDto(40,"m4");
			MemberDto member5= new MemberDto(50,"m5");
	
			
			
			
	
			Vector<MemberDto> members= new Vector<MemberDto>();
			members.add(member1);	
			members.add(member2);	
			members.add(member3);	
			members.add(member4);	
			members.add(member5);	
			
			System.out.println();
	
	System.out.println(members.size());
	System.out.println(members.get(0));
	
	//meber 0번지요소 
	System.out.println(members.get(0).getAge());
	System.out.println(members.get(0).getName());
	
	// foreach이용 모든 members의 요소를 출력 해보세요
	
	for(MemberDto member :members) {
		System.out.println(member);
		System.out.println("나이:"+member.getAge()+",이름:"+member.getName());
	}

	System.out.println("===================");
	
	Vector<MemberDto> members2= new Vector<MemberDto>();
	
	 members2.add(new MemberDto(11,"m11"));
	 members2.add(new MemberDto(21,"m21"));
	 members2.add(new MemberDto(31,"m31"));
	 members2.add(new MemberDto(41,"m41"));
	 members2.add(new MemberDto(51,"m51"));
	System.out.println(member2);
	 
	 for(int i=0; i<member2.size();i++) {
		 System.out.println(members2.get(i));
	 }
	 System.out.println();
		 // foreach -> 모든 컬렉션 객체의 
		 for(MemberDto member:members2) {
			 System.out.println(member.getAge()+","+member.getName());
		 }
	
	}
}

