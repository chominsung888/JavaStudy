package org.java.ioEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoEx3 {

	public static void main(String[] args) {
		System.out.println("IO");

		InputStreamReader reader = null;
		int rs=0;
		try {
			reader = new InputStreamReader(System.in);

			BufferedReader bReader = new BufferedReader(reader);

			System.out.println("숫자입력: ");

			rs += bReader.read(); // 숫자-> 1종류
			
			while (true) {
				if (rs ==- 1)
					break; // -1 -> ctr+z

			}
			System.out.println("누적합계:" + rs);

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
