package org.java.oopExTest;

public class Register {
	
	
	private String id;
	private String Password;
	private int age;
	
	public static void main(String[] args) {
		
	}
	
public Register() {
	// TODO Auto-generated constructor stub
}

	public Register(String id, String password, int age) {
		super();
		this.id = id;
		Password = password;
		this.age = age;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		if(id==null) return "등록된 정보가 없습니다..";
		return "id=" + id + ", Password=" + Password + ", age=" + age ;
	}
	
	
	
	
	
}
