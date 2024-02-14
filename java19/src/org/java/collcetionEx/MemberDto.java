package org.java.collcetionEx;

import java.util.Objects;

public class MemberDto {

	private String userId;
	private String userPW;

	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	
	public MemberDto(String userId, String userPW) {
		super();
		this.userId = userId;
		this.userPW = userPW;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) {
		this.userPW = userPW;

	}

	@Override
	public String toString() {
		return "MemberDto [userId=" + userId + ", userPW=" + userPW + "]";
	}

}
