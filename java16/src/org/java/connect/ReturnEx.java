package org.java.connect;

class Sub1 {
	void s1() {
		System.out.println("Sub1 매서드");
	}
}

class B {
	Sub1 sub1;
	
	void m1() {
		return;
	}

	int m2() {
		return 1;
	}

	String m3() {
		return "문자열";
	}

	static Sub1 m4() {
		Sub1 sub1 = null;
		return sub1;
	}

}

public class ReturnEx {
	public static void main(String[] args) {
		B b1 = new B();
		b1.m1();
		int i1 = b1.m2();
		b1.m2(); // int
		b1.m3(); // String
		b1.m4(); //
	}
}
