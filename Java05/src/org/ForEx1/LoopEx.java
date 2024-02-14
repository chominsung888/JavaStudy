package org.ForEx1;

public class LoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("break,continue");
		
		for(int i=0; i<10;i++) {
			System.out.println("i->"+i);
			if(i==5) break;
			System.out.println(i+" ");
		}//break
		System.out.println();
		System.out.println("continue");
		
		for(int i=0; i<10; i++) {
			System.out.println("i->"+i);
//			if(i==5) continue; 	  // continue 이후X
			if(i>=5) continue;    // continue 이후X
			System.out.println(i+" ");
		}//continue
	}

}
