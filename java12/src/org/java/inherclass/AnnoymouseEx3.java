package org.java.inherclass;

interface MemberImpl{
	void select();
	void update();
	void delete();
	void insert();
	void login();
	int idChecked();
	
}
//���� �ż��尡 �������� ��� ���� ��ü �̿� ���� 
class MemberImplClass implements MemberImpl{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int idChecked() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
interface I1{
	void m1();
}

public class AnnoymouseEx3 {

	public static void main(String[] args) {
		MemberImpl m1=new MemberImplClass();
		m1.insert();
		
	I1 i=new I1() {
			@Override
			public void m1() {
				System.out.println("�͸�(����)Ŭ���� ����");
			}
		};
			
	i.m1();
	
		}
	}