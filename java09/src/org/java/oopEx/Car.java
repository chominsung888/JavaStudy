package org.java.oopEx;

public class Car  {

	private String carName;
	private int weight;
	private int year;

	public Car() { 
	//	this("", 11, 22);
		System.out.println("�⺻������");
	}
	public Car(String carName,int weight,int year) {
		super();
		this.carName = carName;
		this.weight = weight;
		this.year = year;
		
	}
	
	
	
	
	
	// setters,getters
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		if(carName==null) return "��ȸ �� �ڵ����� �����ϴ�.";
		return "Car [carName=" + carName + ", weight=" + weight + ", year=" + year + "]";
	}

		
	
}
