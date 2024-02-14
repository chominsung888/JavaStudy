package org.java.collcetionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	private static final String member = null;

	public static void main(String[] args) {
		System.out.println("ArrayList");
		//ArrayList -> List
		
//	ArrayList<String> list=	 new ArrayList<String>();
	List<String> list=new ArrayList<String>();
		
	 
	
	list.add(new String("m1"));
	list.add("m2");
	list.add("m3");
	list.add("m4");
	list.add("m5");
	
	
	//for -> ������ ���� �� �ִ�.-> �迭(�����������ִ�.)
	for(int i=0; i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
	//foreach -> Ȯ���� for�� -> �ڵ� ����(ũ��)
	for(String str:list) {
		System.out.println(str);
	}
	
	//Iterator
	 Iterator<String> iter=list.iterator();
	while(iter.hasNext()) {
		String str= iter.next();
		System.out.println(str);
		
		//new ArrayList<MemberDto>();
		List<MemberDto> members=new ArrayList<MemberDto>();
		
		members.add(new MemberDto("m1","11"));
		members.add(new MemberDto("m2","21"));
		members.add(new MemberDto("m3","31"));
		members.add(new MemberDto("m4","41"));
		members.add(new MemberDto("m5","51"));
		
		System.out.println(members);
			//foreach
		for(MemberDto member:members) {
			System.out.println(member.getUserId()+","+member.getUserPW());
		}
		System.out.println();
		Iterator<MemberDto> iter2=members.iterator();
		
		while(iter2.hasNext()) {
								//Iterator -> ��� MemberDto
			MemberDto member= iter2.next();
			
			System.out.println(member.getUserId()+","+member.getUserPW());
		}
		
		System.out.println();
		
		//forEach-> ��� ��Ҹ� ��ȸ -> ���ٽ� (Stream, forEach)
		members.forEach(el->{
			System.out.println(el.getUserId()+","+el.getUserPW());
		});
		
		
		
	}
	
	
	}
}
