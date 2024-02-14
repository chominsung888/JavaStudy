package org.java.oopEx;

public class MemerDtoMain {
	
	public static void main(String[] args) {
		
		MemberDto member1 =new MemberDto();
		
		member1.setNo(1);
		member1.setUserId("m111");
		member1.setUserPw("1111");
		member1.setAge(20);
		member1.setAddr("서울시 노원구");
		member1.setEmail("we@gmail.com");
		member1.setName("m1");
		member1.setPhone("010-4324-4431");
				
		System.out.println(member1.toString());		
		
	}

}
