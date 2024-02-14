package org.java.oopEx2;

public class CarMain {
	
	public static void main(String[] args) {
		Car hCar=new Car();
		hCar.carName="HCar";
		hCar.carYear=2024;
		hCar.weight=3000;
		System.out.println("차이름:"+hCar.carName);
		System.out.println("차년식:"+hCar.carYear);
		System.out.println("차배기량:"+hCar.weight);
		
		System.out.println();
		Car mCar=new Car();
		mCar.carName="Mcar";
		mCar.carYear=2024;
		mCar.weight=5000;
		System.out.println("차이름:"+hCar.carName);
		System.out.println("차년식:"+hCar.carYear);
		System.out.println("차배기량:"+hCar.weight);
		
		System.out.println();
		
		Car car=new Car();
		
		car.carMethod("Acar",2024,2500);
		car.carMethod("Bcar",2025,5000);
		
		Car Car = new Car();
		
		car.carMethod("ACar",2024,2500);
		car.carMethod("BCar",2025,5000);
		System.out.println(resut);
		
		
		
	}

}
