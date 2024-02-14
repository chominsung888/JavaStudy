package org.java.collectionEx;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		System.out.println("Vector");
		//������ �����͸� ������ �� �ִ� Vector����
	Vector<Integer> v1=	new Vector<Integer>();
		
	Integer i1= new Integer(10); //�ڽ�
	Integer i3=40;
	
	v1.add(i1); // ���� ��ü�� �����ϴ� �ν��Ͻ��� �߰� 
	v1.add(new Integer(20)); //������ ��ü�� �ٷ� �߰� 
	v1.add(new Integer(30));
	v1.add(40); //�ڵ� �ڽ�
	v1.add(50); //�ڵ� �ڽ�
	// Vector ����� Ÿ�� -> Integer
	// v1 -> ���Ͱ�ü
	for(Integer i: v1) {
		//��� ���Ϳ�Ҹ� ��ȸ
		System.out.println(i);
	}
	
	System.out.println();
	
	//�÷��ǿ� ��ü�� �߰� �ϴ� ���
	// 1.�⺻�ڷ���(8����) -> Wrapper, �ν��Ͻ�, new, �ڵ��ڽ�
	Vector<Double> v2= new Vector<Double>();
	//�ν��Ͻ�
	Double d= new Double(1.1); //�ڽ�
	Double d2=3.3;//�ڵ��ڽ�
	v2.add(3.3);//�ڵ��ڽ�
	v2.add(4.3);
	v2.add(5.3);
	v2.add(new Double(2.2));
	//v2�� ��� ��Ҹ� �ֿܼ� ��� foreach��
	for(Double i: v2) {
		System.out.println(v2);
	}
	
	
	
	
	Vector<Float> v3= new Vector<Float>();
	v3.add(1.1f);
	v3.add(1.2f);
	v3.add(1.3f);
	v3.add(1.4f);
	for(Float i: v3) {
		System.out.println(v3);
	}
	
	// 2. String -> new, ""
	
	Vector<String> v4 =new Vector<String>();
	String str1=new String("���ڿ�1");
	String str2 ="���ڿ�2";
	
	v4.add(str1);
	v4.add(str2);
	v4.add(new String("���ڿ�3"));
	v4.add("���ڿ�4");
	v4.add("���ڿ�5");
	
	for(String i: v4) {
		
		System.out.print(i);
	   System.out.print("����:"+i.length());
	   System.out.println(i.equals("���ڿ�1"));
	   
	}
	System.out.println();
	
	// 3. �Ϲ� Ŭ���� -> new, Ÿ�� ����
	
	
			MemberDto member1= new MemberDto(10,"m1");
			MemberDto member2= new MemberDto(20,"m2");
			MemberDto member3= new MemberDto(30,"m3");
			MemberDto member4= new MemberDto(40,"m4");
			MemberDto member5= new MemberDto(50,"m5");
	
			
			
			
	
			Vector<MemberDto> members= new Vector<MemberDto>();
			members.add(member1);	
			members.add(member2);	
			members.add(member3);	
			members.add(member4);	
			members.add(member5);	
			
			System.out.println();
	
	System.out.println(members.size());
	System.out.println(members.get(0));
	
	//meber 0������� 
	System.out.println(members.get(0).getAge());
	System.out.println(members.get(0).getName());
	
	// foreach�̿� ��� members�� ��Ҹ� ��� �غ�����
	
	for(MemberDto member :members) {
		System.out.println(member);
		System.out.println("����:"+member.getAge()+",�̸�:"+member.getName());
	}

	System.out.println("===================");
	
	Vector<MemberDto> members2= new Vector<MemberDto>();
	
	 members2.add(new MemberDto(11,"m11"));
	 members2.add(new MemberDto(21,"m21"));
	 members2.add(new MemberDto(31,"m31"));
	 members2.add(new MemberDto(41,"m41"));
	 members2.add(new MemberDto(51,"m51"));
	System.out.println(member2);
	 
	 for(int i=0; i<member2.size();i++) {
		 System.out.println(members2.get(i));
	 }
	 System.out.println();
		 // foreach -> ��� �÷��� ��ü�� 
		 for(MemberDto member:members2) {
			 System.out.println(member.getAge()+","+member.getName());
		 }
	
	}
}

