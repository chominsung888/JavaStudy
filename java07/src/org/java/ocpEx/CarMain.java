package org.java.ocpEx;

public class CarMain {

	public static void main(String[] args) {
		new CarCommon();
		
		System.out.println("제작사:"+CarComon.PRNAME);
		System.out.println("제작사:"+CarComon.CARYEAR);
		System.out.println("제작사:"+CarComon.CARNAME);
		System.out.println("제작사:"+CarComon.CARWEIGHT);
	}
	//자동차1
	//엔진
	CarEn cn1=new CarEn();
	cn1.enName="en1";
	cn1.enWeight=100;
	cn1.enCoin=20000;
	CarB cb1 = new CarB();
	cb1.bName="cb1";
	cb1.bweight=200;
	cb1.bCoin=100000;
	//문
	CarD cd1= new CarD();
	cd1.dName="cd1";
	cd1.dWeight=50;
	cd1.dCoin=100;
	CarH new CarH();
	ch1.hName="ch1"
	ch1.hwidth="ch1"		
	ch1.hCoin="ch1"		
	
	System.out.println("엔진 사양: 이름:"+cn1.enName+",중량:"+cn1.enWeight+"");
	System.out.println("본넷 사양: 이름:"+cn1.enName+",중량:"+cn1.bWeight+"");
	System.out.println("차문 사양: 이름:"+cn1.enName+",중량:"+cn1.cWeight+"");
	System.out.println("바퀴 사양: 이름:"+cn1.enName+",중량:"+cn1.dWeight+"");
  
	}
}
