package org.java.varEX;

public class VarEx5 {
	public static void main(String[] args) {
		System.out.println("������ ����ȯ");
		
		// bit -> ����(data) �⺻���� 0, 1
		// byte -> �޸�(��ǻ�� ������)�� �⺻���� 1byte == 8bit
		
		byte b=10;
		int i=10;
		//���� ����ȯ ū �ڷ���-> ������
		b=(byte)i; // ū �ڷ������� ���� �ڷ��� ����ȯ ��Ű�� ����, �ڷᰡ �ս�
		//�ڵ�����ȯ ���� �ڷ��� -> ū �ڷ���
		i=b+10; // byte+int-> int+int
		
		
		
	}
}
