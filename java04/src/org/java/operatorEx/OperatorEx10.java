package org.java.operatorEx;

public class OperatorEx10 {
	public static void main(String[] args) {
		System.out.println("shift������");
		
		/*�ڡڡ�shift������ >>,<<

�� 2���� �����ؼ�      >>,<<

������ shift �� �̵��� �ڸ����� ���� ,���ڸ��� 0 ���۾�����.

12

>> 2

00000000 00000000 00000000 00001100

  00000000 00000000 00000000 00001100

1100

    1100

0011

���� shift �� �̵��� �ڸ����� ���� ,���ڸ��� 0 �� Ŀ����

<<2

   00000000 00000000 00000000 00001100

00000000 00000000 00000000 0000110000

   1100

110000
		 * 
		 * 
		 * 
		 */
		int i=12;
		System.out.println("������ shift");
		System.out.println(i>>2)+"->"+Integer.toBinaryString(i>>2));
		
	}

}
