package org.java.collectionEx;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx3 {

	public static void main(String[] args) {
		System.out.println("Vector");
		
		//���⼺ -> �θ�Ÿ���� ��ü ���� ����-> �ڽİ�ü
		// �����ε�(������), �������̵�(���)
	List<MemberDto> members= new Vector<MemberDto>();

	members.add(new MemberDto(11,"m1"));
	members.add(new MemberDto(21,"m2"));
	members.add(new MemberDto(31,"m3"));
	members.add(new MemberDto(41,"m4"));
	members.add(new MemberDto(51,"m5"));
	//for X
	//foreach
	for(MemberDto member: members) {
		System.out.println(member);
		System.out.println("ȸ�� ����:"+member.getAge());
		System.out.println("ȸ�� �̸�:"+member.getName());
	}
	
	System.out.println();

	// name -> m1 -> ����Ʈ �߿��� ���ǿ� �´� ��Ҹ� ��ȸ 
	for(MemberDto member:members) {
		//name�� m1�� ȸ���� ���
		if(member.getName().equals("m1")) {
			System.out.println("�̸�:"+member.getName());
			System.out.println("����:"+member.getAge());
			
		}
	}
	System.out.println();
	//ȸ�����̰� 30�̻��� ȸ������ ��ȸ
	System.out.println("30���̻��� ȸ�� ���");
	for(MemberDto member:members) {
		if(member.getAge()>=30) {
			System.out.println("�̸�:"+member.getName());
			System.out.println("����:"+member.getAge());
			
		}
	}
	
	
	// Iterator -> ����ȭ -> Session,Cookie
	//�÷��� ��� Ÿ��
	Iterator<MemberDto> iter=members.iterator();
	while(iter.hasNext()) {
		MemberDto m1=iter.next();
		System.out.println("ȸ�� ����:"+m1.getAge());
		System.out.println("ȸ�� �̸�:"+m1.getName());
	}
	
	}
}
