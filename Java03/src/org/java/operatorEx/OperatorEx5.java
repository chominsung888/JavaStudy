package org.java.operatorEx;

public class OperatorEx5 {

	public static void main(String[] args) {
		System.out.println("����������");
		System.out.println("&&");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		System.out.println("||"); //������ �ϳ��̻� true �̻� true
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println("^"); // ���� �ٸ��� true
		System.out.println(true^true); // ���� �ٸ��� true
		System.out.println(true^false); // ���� �ٸ��� true
		System.out.println(false^false); // ���� �ٸ��� true
		System.out.println(false^true); // ���� �ٸ��� true
		System.out.println(false^false); // ���� �ٸ��� true
		
		System.out.println("!"); // �ݴ� toggle ->����ġ
		System.out.println(!true);
		System.out.println(!false);
		
		// ���̵�� ��й�ȣ�� ��ġ�ϸ� �α��� ���� ��ġ ���� ������ �α��� ����
		
		String userId="m1111";
		String userPw="1111";
		
		System.out.println(userId.equals("m1111"));
		System.out.println(userPw.equals("1111"));
		
		System.out.println(userId.equals("m1111") && userPw.equals("1111"));
		
		if(userId.equals("m1111") && userPw.equals("1111")) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
		
		
		
	}
}