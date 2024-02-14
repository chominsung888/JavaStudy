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
			
			System.out.println("url:"+url); //전체 url
			System.out.println("protocol:"+url.getProtocol()); //프로토콜
			System.out.println("Host:"+url.getHost()); //호스트
			System.out.println("Port:"+url.getPort()); //포트
			System.out.println("path:"+url.getPath()); //서버의 기본 경로
			System.out.println("File:"+url.getFile()); //파일이름
			System.out.println("File:"+url.getQuery());
			
			
		} catch (MalformedURLException e) {
			System.out.println("잘못된 URL입니다.");
			e.printStackTrace();
		}
		
	}
}
