package org.java.inherclass;

public class InnerCalssBasic {
	
	//인스턴스클래스 
	class InstanceClass{
		int num1;
		int num2;
		
		class InterfaceClass{
			
		}
		void m1() {
			System.out.println("m1");
		}
		
	}
	//static 클래스
	static class StaticClass{
		int b;
		static void m2() {
			System.out.println("m2");
		}
	}
	void localClassMethod() {
		//지역클래스
		class LocalClass{
			int c;
			void m3() {
				System.out.println("m3");
			}
		}
		LocalClass local= new LocalClass();
		local.m3();
		local.c=10;
	}
	
	public static void main(String[] args) {
		
		InnerCalssBasic inner = new InnerCalssBasic();
		
		InnerCalssBasic.InstanceClass insClass= new InnerCalssBasic().new InstanceClass();
		insClass.a=10;
		insClass.m1();
		
		InnerCalssBasic localclass= new InnerCalssBasic();
		localclass.localClassMethod();
		
		InnerCalssBasic.StaticClass.b=10;
		InnerCalssBasic.StaticClass.m2();
		
		
		
		
	}
	
	
	
	
	
}
