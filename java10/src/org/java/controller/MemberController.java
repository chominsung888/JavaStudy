package org.java.controller;

import java.util.Scanner;

import org.java.service.MemberDelete;
import org.java.service.MemberInsert;
import org.java.service.MemberSelcect;
import org.java.service.MemberService;
import org.java.service.MemberUpdate;
import org.java.service.Memberexit;

//�����(Ŭ���̾�Ʈ)��û �޾Ƽ� -> ���񽺿� ���� ��Ű�� 
// -> ���񽺿��� ��� ���� ��ȯ �޾Ƽ� -> �����( Ŭ���̾�v)�� �ǵ�����(View)

public class MemberController {
	
	public static void main(String[] args) {
		// ������
		// �θ�Ÿ�� ��ü ���� ������ �ڽİ�ü ����


		// query�� insert�� "ȸ������"
		// query�� select�� "ȸ����ȸ"
		// query�� update�� "ȸ������"
		// query�� delete�� "ȸ��Ż��"
		// query�� exit�� "����������"
		// query�� �� 4���� �̿ܿ��� "�������Է¿���"
		// �� �ֿܼ� ��� �ǵ��� if~else if~elseȰ���ؼ�
		// ���α׷��� �غ�����

		// Model2 -> ��ص� ������ �⺻ Web Programming
		// MVC Model2
		
		// while�� �̿��ؼ� -> exit-> while�� ����
		
		MemberService mService = null;
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		System.out.println("QUREY:");
		System.out.println("while�� �Է��ϼ���");
		System.out.println("While:");
		String query = input.next();
		if (query.equals("insert")) {
			// ȸ������ ���� ��Ų��.
			mService = new MemberInsert();
			mService.excuteQueryService();

		} else if (query.equals("selcect")) {
			// ȸ����ȸ ���� ��Ų��
			mService = new MemberSelcect();
			mService.excuteQueryService();

		} else if (query.equals("update")) {
			// ȸ������ ���� ��Ų��.
			mService = new MemberUpdate();
			mService.excuteQueryService();

		} else if (query.equals("delete")) {
			// ȸ��Ż�� ���� ��Ų��.
			mService = new MemberDelete();
			mService.excuteQueryService();

		} else if (query.equals("exit")) {
			// ������ ����.
			System.out.println("while�� ����");
		} else {
			System.out.println("while�� �Է� ����");
		} 
	}
}
