package org.java.collection;

import java.util.Vector;

class Member{
	private int age;
	String name;
	public Member() {}
	public Member(int age, String name) {}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class VectorEx2 {
	public static void main(String[] args) {
		System.out.println("Vector");
		
		Member m1 =new Member(10,"m1");
	Vector<Member> member=	new Vector<Member>();

	member.add(new Member(11,"m1"));
	member.add(new Member(12,"m2"));
	member.add(new Member(13,"m3"));
	member.add(new Member(14,"m4"));
	member.add(new Member(15,"m5"));
	
	
	// member foreach�� �̿��ؼ� �ۿ�Ҹ� �ֿܼ� ���
	// ���̴� ~,�̸��� ~
	
//	Member m1 =new Member(11,"m1");
	
	for(Member m: member) {
		System.out.print("����:"+m.getAge());
		System.out.println("�̸�:"+m.getAge());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	@Override
	public String toString() {
		return "VectorEx2 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
