package org.java.basicApl;

import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args) {
		
		
		System.out.println("Random");
		Random rd=new Random();
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextInt());
		System.out.println(rd.nextInt(100)); //0~99 Á¤¼ö 
		System.out.println(rd.nextInt(45)); //0~44
		
	}
}
