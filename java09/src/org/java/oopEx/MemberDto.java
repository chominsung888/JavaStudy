package org.java.oopEx;

public class MemberDto {
	// DB�� ȸ���� ������ �����ϱ� ����
	// java�� �ʵ� �ϰ� DB�� ���̺� Į���� ����
	// DB -> <- java ���� �ϱ� ���� Ŭ����
	
	
	private int no;// ȸ����ȣ
	private String userId;
	private String userPw;
	private String name;
	private String addr;
	private int age;
	private String phone;
	private String email;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		//�ż��忡�� return���� ������ �ż��尡 ����
		
		return "MemberDto [no=" + no + ", userId=" + userId + ", userPw=" + userPw + ", name=" + name + ", addr=" + addr
				+ ", age=" + age + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	
}
