package org.java.basicApi;

class A{
	int a;
	int b;
	
	int m1(int num1) {
		return num1;
	}
}
class B{
	String a;
	String b;
	String m1(String num1) {
		return num1;
	}
}
//���׸� Ÿ�� -> ��ü ������ Ÿ���� ���� 
class GenericEx<T>{
	T a;
	T b;
	T m1(T num1) {
		return num1;
	}
}


public class WrapperEx {
	public static void main(String[] args) {
		System.out.println("Wrapper");
		
		//���׸� Ÿ�� -> �⺻�ڷ��� -> ��ü��
		new GenericEx<Integer>();
		new GenericEx<String>();
		new GenericEx<Float>();
		
		
		// �ڽ� -> �⺻�ڷ��� -> ��ü��
		new Integer(10);
		
		//�ڵ��ڽ�
		Integer i =10;
		Character ch ='a';
		Boolean bool=false; // new Boolean(false)
		
		//��ڽ� -> ��ü�� -> �����ڷ���
		Integer i4=new Integer(10);
		i4=10;
		int i3=i4.intValue();
		//�ڵ� ��ڽ�
		int i5=new Integer(10);
		int i6= i4;
		
		//2������ ��ȯ���� �� 1�� ����
		System.out.println(Integer.bitCount(10)); //1010
		//���ڿ��� ����(int)�� �ٲ���
		System.out.println(Integer.parseInt("1111")); //1010
		// ���ڿ� ���ڸ� -> ������ �ٲ���, 2(2����),10(10����)
		System.out.println(Integer.parseInt("10",2)); //1010
		System.out.println();
		// ������ -> ���ڿ� �������� ��ȯ 
		System.out.println(Integer.toBinaryString(10));
		//16���� -> 123456789abcdef -> CSS
		System.out.println(Integer.toHexString(10));
		// 8����
		System.out.println(Integer.toOctalString(10));
		
		
		
		
		
		
		
		
		
		
		
	}
}
