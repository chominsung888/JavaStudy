package org.java.exception;

import java.io.IOException;
import java.sql.SQLException;

interface In1 {
	abstract void indb() throws SQLException, IOException;
}

class In1Sub1 implements In1 {

	@Override
	public void indb() throws SQLException, IOException {

	}

}

class A {
	void m1() {
	}
}

class B {

	void m2() throws SQLException, IOException {
		System.out.println("���ܰ� �ִ� �ż���");
	}
}


public class ExceptionEx_Sub {

	public static void main(String[] args) throws SQLException, IOException {

		In1 i1 = new In1Sub1();
		i1.indb();

		i1 = new In1Sub1();
		i1.indb();

		i1 = new In1Sub1();
		i1.indb();

		i1 = new In1Sub1();
		i1.indb();

		System.out.println("���� ó�� ���");

		// 1. try~catch
		try {
			int num = 10 / 0;
			System.out.println("���� ���� ���� ����");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("catch�� �̿��� ��� ���� ó��");
			e.printStackTrace();
		} finally {
			System.out.println("���ܿ� ������� ������ ����");
		}

		System.out.println("���� ����");
	}
}
