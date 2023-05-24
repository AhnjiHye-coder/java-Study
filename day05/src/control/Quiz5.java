package control;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		/*
		 사탕 1개에 500원 입니다
		 50개 이상을 구매하면 전체 8%를 할인하고
		 100개 이상을 구매하면 전체의 12%를 할인합니다
		 (단, 각각의 할인율은 중복해서 적용할 수 없습니다)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int candy = 500; // 캔디 500원
		int tmp,total; // 구매개수, 할인된 금액
		double  dc;
		
		
		System.out.print("사탕개수 입력 >> ");
		tmp = sc.nextInt();
		
		total = tmp * candy;
		
		if(tmp >= 100) {
			dc = 0.12;
		}
		if(tmp >= 50) {
			dc = 0.8;
		}
		else {
			dc = 0;
		}
		
		total -= total * dc; // 계산해야할 금액에 할인된 금액을 담아준다
		System.out.printf("결제금액: %,d\n", total);
		
	
	}
}

