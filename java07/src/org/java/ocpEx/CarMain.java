package org.java.ocpEx;

public class CarMain {

	public static void main(String[] args) {
		new CarCommon();
		
		System.out.println("���ۻ�:"+CarComon.PRNAME);
		System.out.println("���ۻ�:"+CarComon.CARYEAR);
		System.out.println("���ۻ�:"+CarComon.CARNAME);
		System.out.println("���ۻ�:"+CarComon.CARWEIGHT);
	}
	//�ڵ���1
	//����
	CarEn cn1=new CarEn();
	cn1.enName="en1";
	cn1.enWeight=100;
	cn1.enCoin=20000;
	CarB cb1 = new CarB();
	cb1.bName="cb1";
	cb1.bweight=200;
	cb1.bCoin=100000;
	//��
	CarD cd1= new CarD();
	cd1.dName="cd1";
	cd1.dWeight=50;
	cd1.dCoin=100;
	CarH new CarH();
	ch1.hName="ch1"
	ch1.hwidth="ch1"		
	ch1.hCoin="ch1"		
	
	System.out.println("���� ���: �̸�:"+cn1.enName+",�߷�:"+cn1.enWeight+"");
	System.out.println("���� ���: �̸�:"+cn1.enName+",�߷�:"+cn1.bWeight+"");
	System.out.println("���� ���: �̸�:"+cn1.enName+",�߷�:"+cn1.cWeight+"");
	System.out.println("���� ���: �̸�:"+cn1.enName+",�߷�:"+cn1.dWeight+"");
  
	}
}
