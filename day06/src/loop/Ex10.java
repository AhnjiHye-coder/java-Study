package loop;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		int n1 = 0, n2 = 0;
		
		// 제어문 앞에 라벨을 걸어줄 수 있다
		LOOP : while(true) {
			System.out.println("보기\n1.n2입력");
			System.out.println("1. n1입력");
			System.out.println("2. n2입력");
			System.out.println("3.  합계 출력");
			System.out.println("0. 종료");
			System.out.print("선택 >> ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("입력 : ");
				n1 = sc.nextInt();
				break;
				
			case 2:
				System.out.print("입력 : ");
				n2 = sc.nextInt();
				break;
			
			case 3:
				int total = n1 + n2;
				System.out.println("n1 + n2 : " + total);
				break;
				
			case 0:
				sc.close();
				break LOOP; // 지정한 라벨 제어문(블럭while)을 탈출
				// break 가장 가까운 제어문 블럭(switch)를 탈출
			}// end of switch
		}// end of while
		System.out.println("프로그램 종료");
	}// end of main 
	
}// end of class
