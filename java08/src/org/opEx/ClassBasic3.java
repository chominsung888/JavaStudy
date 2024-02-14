package org.opEx;

public class ClassBasic3 {
	//멤버
	
	//1.필드,프로퍼티,(속성), 하나의값 
	// 인스턴스 멤버 -> 객체를 생성 한 후 사용 가능 new
	// ClassBasic3 c1 = new Class Basic3();
	// c1.매서드명(); c1.instancMethod
	// c1.num1; c1.num2; c1.name;c1.arrInt;
	public int num1; // 0 
	public int num2;
	public String name; //주소값,객체형의 기본 값 ->null 
	public int[] arrInt;
	int sum; // 같은 패키지내에서만 접근 가능 
	
	//private 필드 -> 같은 클래스내에서만 접근 가능
	// 데이터 베이스에 접근하고 또한 보안이 필요한 멤버는 private설정
	//외부에서 접근 할 수 없기 떄문에 외부에서 접근 가능한 매서드를 생성하여 사용한다.
	// setters, getters 매서드다.
	private String userId;
	private String userPw;
	
	// static(클래스)멤버 -> 객체 생성 없이 사용 가능,공유 데이터 
	// 객체 생성 없이 클래스명.static 멤버 
	public static int num3;
	
	//2.매서드 -> 기능, 일 처리, 구현
	//인스턴스 매서드 멤버 -> 객체를 생성 한 후 가능 new
	//ClassBasic3 c1 = new Class Basic3();
	//c1.매서드명();
	//접근지정자  반환타입 매서드명() {	//구현부}
	
	//선언부 
	public void instnacMethod() {
		//구현부 -> 처리,수행,실행
		System.out.println("매서드(인스턴스)");
		//매서드는 기본이 return(반환값)있다.
//		return;
		
		
		
	}
	//클래스(static)매서드 -> 객체 생성 없이 사용가능
	public static void staticMethod() {
		System.out.println("static(클래스)매서드");
	//	return;
	}
	// 접근지정자 static 반환타입 매서드명() { //구현부}
	//getters,setters
	//private String userId;
	// 외부에서 setters -> 초기화
	public void setUserId(String userId) {
		this.userId=userId;
		
		public String getUserId() {
			return userId;
		
		}
		public void setUserPw(String userPw) {
			this.userPw=userPw;
		}
		public String getUserPw() {
			return userPw;
		}
		
	}
	
	
	
}
