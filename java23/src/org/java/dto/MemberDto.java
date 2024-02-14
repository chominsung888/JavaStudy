package org.java.dto;

public class MemberDto {

	private String userId;
	private String userPw;
	private int age;
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userId
	 * @param userPw
	 * @param age
	 */
	public MemberDto(String userId, String userPw, int age) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberDto [userId=" + userId + ", userPw=" + userPw + ", age=" + age + "]";
	}
	
}
