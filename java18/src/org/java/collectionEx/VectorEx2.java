package org.java.collectionEx;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		System.out.println("Vector");
		
	Vector<MemberDto> members=	new Vector<MemberDto>();
	members.add(new MemberDto(10,"m1"));
	members.add(new MemberDto(20,"m2"));
	members.add(new MemberDto(30,"m3"));
	members.add(new MemberDto(40,"m4"));
	members.add(new MemberDto(50,"m5"));
	System.out.println(members);
	// ��ȸ ���
	// for -> ��ü, �⺻�ڷ��� 
	for(int i=0; i<members.size();i++) {
		MemberDto m1=members.get(i);
		System.out.println(members.get(i));
	}
	
	System.out.println();
	// foreach -> ��ü 
	for(MemberDto member:members) {
		System.out.println(member);
	}
	
	// Iterator -> ����Ʈ�� ��ü�� ��ȸ
	// Iterator<���Ÿ��>    = �÷���.iterator();
	Iterator<MemberDto> iter=members.iterator();
	// Iterator ��ȸ ��  ��Ұ� ������ while�� ����
	while(iter.hasNext()) {
		//��� Ÿ��
	MemberDto dto=iter.next(); // �ϳ��� ��Ҹ� ��ȸ
	System.out.println(dto);
	}
	
	
	}
}
