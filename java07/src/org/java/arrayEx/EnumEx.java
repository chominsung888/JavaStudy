package org.java.arrayEx;

import javax.management.relation.Role;

public class EnumEx {
	
	// static -> Ŭ����(static) ��� -> Ŭ������.�̸�
	
	public static final String ADMIN= "ROLE_ADMIN";
	public static final String MEMBER= "ROLE_MEMBER";
	public static final String SELLER= "ROLE_SELLER";
	
	enum USER_ROLE{
		ROLE_ADMIN,ROLE_MEMBER,ROLE_SELLER
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enum");
		
		System.out.println("������ ����:"+EnumEx.ADMIN); //Ŭ������.Ŭ�������
		System.out.println("�Ǹ��� ����:"+EnumEx.SELLER); //Ŭ������.Ŭ�������
		System.out.println("�Ϲ�ȸ�� ����:"+EnumEx.MEMBER); //Ŭ������.Ŭ�������
		System.out.println("esum->��ȸ"); //Ŭ������.Ŭ�������
		System.out.println("������ ����:"+USER_ROLE.ROLE_ADMIN); //Ŭ������.Ŭ�������
		System.out.println("�Ǹ��� ����:"+USER_ROLE.ROLE_SELLER); //Ŭ������.Ŭ�������
		System.out.println("�Ϲ�ȸ�� ����:"+USER_ROLE.ROLE_MEMBER); //Ŭ������.Ŭ�������
		
		System.out.println("enum->����");
		System.out.println("������ ����:"+ ROLE.ROLE_ADMIN); //Ŭ������.Ŭ�������
		System.out.println("�Ǹ��� ����:"+ ROLE.ROLE_SELLER); //Ŭ������.Ŭ�������
		System.out.println("�Ϲ�ȸ�� ����:"+ ROLE.ROLE_MEMBER); //Ŭ������.Ŭ�������
	
		
	}

}
