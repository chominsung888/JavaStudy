package org.java.oopEx2;

public class Car {

	public String carName;
	public int carYear;
	public int weight;
	
	public void carMethod(String carName,int CarYear,int weight) {
		
		System.out.println("���̸�:"+carName);
		System.out.println("�����:"+carYear);
		System.out.println("����ⷮ:"+weight);
		//return
	}
	
	public void carMethod2(String carName,int CarYear,int weight) {
		String result = "���̸�:"+carName +","�����:""
				+carYear+"����ⷮ:"+weight;
		
		
		
		return result;
	}
}
