package org.java.Wrapper;

public class WrapperEx5 {

	public static void main(String[] args) {
		System.out.println("Wrapper");
		
		//���ڿ� ���� -> "111" -> int(�⺻�ڷ���)
		// ���� ���� �Է� �� -> ���ڿ��� �ν�, ������ �߻� �� �� ������ ����
		String num="1234";
		System.out.println(num+100);
		//1. Wrapper
		int i =new Integer(num);
		System.out.println(i+100);
		//2. Integer.parse
		int i2=Integer.parseInt(num);
		System.out.println(i2+100);
		
		System.out.println(Byte.parseByte(num));
		System.out.println(Short.parseShort(num));
		
	}
}
