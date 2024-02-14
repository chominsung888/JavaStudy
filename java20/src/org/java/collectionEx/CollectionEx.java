package org.java.collectionEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Member {
	private String userId;
	private String userPw;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userId
	 * @param userPw
	 */
	public Member(String userId, String userPw) {
		super();
		this.userId = userId;
		this.userPw = userPw;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPw=" + userPw + "]";
	}

}

public class CollectionEx {

	public static void main(String[] args) {
		System.out.println("컬렉션 프레임워크");
		
		List<Member> members=new ArrayList<Member>();
		members.add(new Member("m1","11"));
		members.add(new Member("m2","21"));
		members.add(new Member("m3","31"));
		members.add(new Member("m4","41"));
		members.add(new Member("m5","51"));
	
		//foreach문
		System.out.println("foreach문");
		for(Member member:members) {
			System.out.println(member.getUserId()+","+member.getUserPw());
		}
		System.out.println("foreach()매서드");
		members.forEach(member->System.out.println(member.getUserId()+","+member.getUserPw()));
		members.forEach(member->{
			System.out.println(member.getUserId()+","+member.getUserPw());
		});
		System.out.println("특정 값을 조회");
		members.forEach(member->{
			if(member.getUserId().equals("m1"))
				System.out.println(member.getUserId()+","+member.getUserPw());
		});
		//Map<K,Y>
		Map<String,List<Member>> map1=new HashMap<String, List<Member>>();
		map1.put("memberList", members); //List -> Map
		
		System.out.println(map1);
										//Map->List
		List<Member> memberList2=map1.get("memberList");
		memberList2.forEach(member->System.out.println(member.getUserId()+","+member.getUserPw()));
		
		System.out.println("Stream-> 원본이 손상 없이 별도의 Stream객체 생성");
		
		Stream<Member> streamList1=memberList2.stream();
		
		List<Member> strList=
		streamList1
		.filter(el->el.getUserId().contains("2"))
		.collect(Collectors.toList());
		
	strList.forEach(el-> System.out.println(el.getUserId()+","+el.getUserPw()));
		
	}
}
