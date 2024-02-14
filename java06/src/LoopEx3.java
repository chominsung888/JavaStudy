import java.util.*;

public class LoopEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("swith");
		Scanner scn=new Scanner(System.in);
		
		boolean boot=true;
		while(bool) {
			
		}
		
		while(true) {
			System.out.println("권한을 입력하세요 (ADMIN,MEMBER,SELLER)");
			String uesr_ROLE=scn.next();
			
			switch(user_ROLE) {
			case"ADMIN" :
				System.out.println("당신의 권한은 ADMIN입니다.");
				break;
			case"MEBER" :	
				System.out.println("당신의 권한은 MEMBER입니다.");
				break;
			case"SELLER":	
				System.out.println("당신의 권한은 SELLER입니다.");
				break;
			case "exit":
				System.out.println("종료합니다.");
				bool=false;
				break;
			default:
				System.out.println("다시 입력해주세요");
			
		}//break
		}
		
	}


