package org.java.oopEx;

public class ContstructEx2 {

	private String userId;
	private String userPw;

	// �⺻������
	public ContstructEx2() {
		this("m111", "1111"); // �ٸ������� ȣ��
		System.out.println("�⺻������");
	}

	public ContstructEx2(String userId) {
		this();
		// this.�ɹ�(�ʵ�,�ż���)
		this.userId = userId;
	}

	public ContstructEx2(String userId, String userPw) {
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
		return "ContstructEx2 [userId=" + userId + ", userPw=" + userPw + "]";
	}

}