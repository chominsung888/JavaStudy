package org.java.dto;

import java.sql.Date;

public class MemberDto {
	
	private int no;
	private String userId;
	private String userPw;
	private String userName;
	private String userEmail;
	private String phone; // 010 
	private Date date;

	public void setNo(int no) {
		this.no =no;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getNo() {
		return no;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getPhone() {
		return phone;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	
		
		
		public String toString() { 
		
			String info= "";
		info+="회원번호:"+this.getNo();
		info+="회원ID:"+this.getUserId();
		info+="회원PW:"+this.getUserPw();
		info+="회원이름:"+this.getUserName();
		info+="회원이메일:"+this.getUserEmail();
		info+="회원전화:"+this.getPhone();
		info+="회원생일:"+this.getDate();
		{
			
		return info;
		}
	}
	}

