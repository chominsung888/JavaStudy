package org.java.networkEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx1 {

	public static void main(String[] args) {
		System.out.println("network");
		// URL�� �����͸� �о �ֿܼ� ���
		BufferedReader in = null;

		try {
			// URL-> ���ϴ� �� URL�� ������ ���� ���� �ִ�.
			// URL �ڿ� ���
			   String urlData = "http://192.168.23.211:8099/board/boardList";
			// String urlData="http://www.naver.com/";

			// URL
			URL url = new URL(urlData);
			in = new BufferedReader(new InputStreamReader(url.openStream()));

			String htmlStr = "";

			while ((htmlStr = in.readLine()) != null) {
				System.out.println(htmlStr);
			}

		} catch (IOException e) {
			System.out.println("URL���� ������ �д� �߿��� ������ �߻� �߽��ϴ�.");
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
