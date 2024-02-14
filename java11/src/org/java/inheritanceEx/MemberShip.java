package org.java.inheritanceEx;

import org.java.role.Role;

public class MemberShip {

	public static void main(String[] args) {
		
		int i;
		
		Parent p1=new Parent();
		p1.age=10;
		p1.name="A";
		p1.phone="0000000";
		p1.memberShip();
		
		
		Sub1 s1=new Sub1();
		s1.age=10;
		s1.name="A1";
		s1.phone="1111111";
		s1.num1=10;
		s1.num2=20;
		
		sub2 s2=new sub2();
		s2.age=20;
		s2.name="B1";
		s2.phone="1111111";
		s2.memberShip();
		s2.app="APP1";
		
		Sub3 s3=new Sub3();
		s3.age=30;
		s3.name="C1";
		s3.phone="1111111";
		s3.memberShip();
		s3.role=Role.ROLE_ADMIN;
		
		System.out.println(s3.role);
		
		Parent p2 =new Sub1();
		 p2 =new sub2();
		 p2 =new Sub3();
		
		Parent p3=new  Sub3();
		Parent s31=new Sub3();
		
	}
}
