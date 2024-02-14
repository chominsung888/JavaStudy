package org.java.networkEx;

import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx2 {

	public static void main(String[] args) {
		System.out.println("network");
		String urlData = "http://192.168.23.211:8099/board/boardList?userid=11&userPw=11";
		URL url=null;
		
		try {
			url=new URL(urlData);
			
			System.out.println("url:"+url); //��ü url
			System.out.println("protocol:"+url.getProtocol()); //��������
			System.out.println("Host:"+url.getHost()); //ȣ��Ʈ
			System.out.println("Port:"+url.getPort()); //��Ʈ
			System.out.println("path:"+url.getPath()); //������ �⺻ ���
			System.out.println("File:"+url.getFile()); //�����̸�
			System.out.println("File:"+url.getQuery());
			
			
		} catch (MalformedURLException e) {
			System.out.println("�߸��� URL�Դϴ�.");
			e.printStackTrace();
		}
		
	}
}
