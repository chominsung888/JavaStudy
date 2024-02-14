package org.java.oopExTest;

public class ConstructEx3 {

	private int no;
	private int age;

	//Construct(생성자)
	//1. 매서드,
	public ConstructEx3() {
		
	}
	
	
	public ConstructEx3(int no, int age) {
		super();
		this.no = no;
		this.age = age;
	}


	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "ConstructEx3 [no=" + no + ", age=" + age + "]";
	}
	

}
