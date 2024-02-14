package org.java.inherclass;
//�ܺ�Ŭ���� -> Outer
public class InnerClassBasic2 {
	int num1; // �ν��Ͻ� ���
	//�ʵ� 
	//�ν��Ͻ� Ŭ����
	class instanceClass{
		void m1() {
			System.out.println("�ν��Ͻ� Ŭ����");
		}
	}
	static class staticClass{
		static int NUM=100;
		static void m2() {
			System.out.println("staticŬ����");
		}
	}
	
	void localMethod(int age) {
		class LocalClass{
			void m3(int age) {
				System.out.println("����Ŭ����");
				System.out.println("����:"+age);
			
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
