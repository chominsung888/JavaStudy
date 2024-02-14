package org.java.inherclass;
//외부클래스 -> Outer
public class InnerClassBasic2 {
	int num1; // 인스턴스 멤버
	//필드 
	//인스턴스 클래스
	class instanceClass{
		void m1() {
			System.out.println("인스턴스 클래스");
		}
	}
	static class staticClass{
		static int NUM=100;
		static void m2() {
			System.out.println("static클래스");
		}
	}
	
	void localMethod(int age) {
		class LocalClass{
			void m3(int age) {
				System.out.println("로컬클래스");
				System.out.println("나이:"+age);
			
			}
		}
		LocalClass local =new LocalClass();
	}
	public static void main(String[] args) {
		InnerClassBasic2 inner =new InnerClassBasic2();
		inner.num1=10;
		
		inner.localMethod(20);
		
		InnerClassBasic2.instanceClass insClass=new InnerClassBasic2().new instanceClass();
		insClass.m1();
		
		System.out.println(InnerClassBasic2.staticClass.NUM);
		InnerClassBasic2.staticClass.m2();
		
	}
}
