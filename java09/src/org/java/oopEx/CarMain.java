package org.java.oopEx;

import java.util.Scanner;

public class CarMain {
	
	public static void main(String[] args) {
		Car car1=new Car();
		car1.setCarName("HCar");
		car1.setWeight(2000);
		car1.setYear(2024);
		
		// setters,getters 
		Car car2 = new Car("CCar",3000,2404);
		car2.setCarName("ACar");
		
		//
		Scanner scn=new Scanner(System.in);
		//������� ���α׷�
		System.out.println("�ڵ����̸�:");
		String carName=scn.next();
		
		System.out.println("�ڵ����߷�:");
		int carWeight=scn.nextInt();

		System.out.println("�ڵ������:");
		int carYear=scn.nextInt();
		
		Car car3 new Car(carName,carWeight,carYear);
		
		String info=car3.toString();
		
		System.out.println(info);
		
	}
}
