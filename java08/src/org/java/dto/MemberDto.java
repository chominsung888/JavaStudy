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
		info+="ȸ����ȣ:"+this.getNo();
		info+="ȸ��ID:"+this.getUserId();
		info+="ȸ��PW:"+this.getUserPw();
		info+="ȸ���̸�:"+this.getUserName();
		info+="ȸ���̸���:"+this.getUserEmail();
		info+="ȸ����ȭ:"+this.getPhone();
		info+="ȸ������:"+this.getDate();
		{
			
		return info;
		}
	}
	}

