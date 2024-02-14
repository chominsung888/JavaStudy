package org.java.oopEx2;

public class Calculator1 {
	
	public int num1;
	public int num2;
	public String op;
	
	//
	public void sum() {
		System.out.println(this.num1+"+"+num2+"="+(num1+num2));
	}
	//-
	public void sub() {
		System.out.println(this.num1+"-"+num2+"="+(num1-num2));
	}
	public void mult() {
		System.out.println(this.num1+"*"+num2+"="+(num1*num2));
	}
	public void div() {
		System.out.println(this.num1+"/"+num2+"="+(num1/num2));
	}
		// +-*/ 연산 처리 매서드
	public void opMethod() {
		
		System.out.println(op+"연산 실행");
		
		if(op.equals("+")) {
			this.sum();
		}else if(op.equals("-")) {
			this.sub();
		}else if(op.equals("*")) {
			this.mult();
		}else if(op.equals("/")) {
			this.div();
		}else {
			System.out.println("연산자 입력오류");
		}
		
	}
	
	
	
	
	}

