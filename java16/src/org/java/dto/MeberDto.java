package org.java.dto;

import java.lang.reflect.Member;
import java.nio.channels.MembershipKey;

public class MeberDto {

	
	private int no;
	private String userId;
	private String userPw;
	private String username;
	private String userage;
	
	 public MeberDto(){
		// TODO Auto-generated constructor stub
	}

	public MeberDto(int no, String userId, String userPw, String username, String userage) {
		super();
		this.no = no;
		this.userId = userId;
		this.userPw = userPw;
		this.username = username;
		this.userage = userage;
		
		
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserage() {
		return userage;
	}

	public void setUserage(String userage) {
		this.userage = userage;
	}
	
		
	
	
}
	
}
