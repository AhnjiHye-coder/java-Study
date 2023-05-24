package control;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int cons = 0;
		String id = "it";
		String pw = "bank";
		String usid, uspw;
		
		System.out.print("id :  ");
		usid = sc.nextLine();
		
		System.out.print("pw : ");
		uspw = sc.nextLine();
//		while(true) {
//			if(cons == 3) {
//				System.out.println("3회 실패로 로그인 실패");
//				break;
//			}
			if(id.equals(usid)) {
				if(pw.equals(uspw)) {
					System.out.println("로그인 성공");
				}
				else {
					System.out.println("잘못된 정보");
					
				}
			}
			else {
				System.out.println("다시 입력하세요");
//				cons++;
				
			}
				
			sc.close();
//		}
				
	}
}
