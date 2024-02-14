package org.java.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStteamEx {

	public static void main(String[] args) {
		System.out.println("IO");
		// ���� (�ؽ�Ʈ����)�� �о�帰��.

		FileInputStream fStream = null;
		String fileName = "C:\\windows\\system.ini";

		try {
			fStream = new FileInputStream(fileName);

			int inData = 0;

			// ������ �����͸� �ϳ��� -> ������ ������ -1
			while ((inData = fStream.read()) != -1) {
				// �ϳ��� ��� -> ����, ����
				System.out.print((char) inData);
			}

		} catch (FileNotFoundException e) {
			System.out.println("���� NO");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ����� Fail!!");
			e.printStackTrace();
		}

	}
}
