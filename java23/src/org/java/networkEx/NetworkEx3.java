package org.java.networkEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx3 {

	public static void main(String[] args) {
		System.out.println("network");
		
		String urlData = "http://192.168.23.211:8099/";
		URL url=null; 
	
		try {
			url=new URL(urlData);
			URLConnection uC=url.openConnection();
			uC.setDoOutput(true);
			// 2.����URL �ֿܼ� ���
			// ������ ���� ��ü
			OutputStreamWriter out=new OutputStreamWriter(uC.getOutputStream());
			
			// �������� ��������
			out.write("userId=11&userPw=11");
			out.close();
			
			//�ٽ� ������ �о� �帰��.
			BufferedReader in=new BufferedReader(new InputStreamReader(uC.getInputStream()));
			String htmlStr="";
		while((htmlStr =in.readLine()) !=null) {
			System.out.println(htmlStr);
		}
		in.close();
			
		} catch (MalformedURLException e) {
			System.out.println("URL Fail !");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("������ �Է� Fail !!");
		
			e.printStackTrace();
		}
		
		
		
		
	}
}
