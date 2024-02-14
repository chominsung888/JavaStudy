package org.java.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoEx5 {

	public static void main(String[] args) {

		System.out.println("IO");

		String fileName = "C:\\windows\\system.ini";

		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream(fileName);

			int inData = 0;
			try {
				while ((inData = fileInputStream.read()) != -1) { // ���Ͽ� ����������

					System.out.print((char)inData);
				}
			} catch (IOException e) {
				e.printStackTrace();

			}

		} catch (FileNotFoundException e) {
			System.out.println("���� NO");
			e.printStackTrace();
			
		}catch (IOException e) {
			System.out.println("���� �����Fail!!");
			e.printStackTrace();
		}

	}
}
