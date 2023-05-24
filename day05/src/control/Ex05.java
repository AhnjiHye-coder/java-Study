package control;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.print("점수 입력 (0 ~ 100): ");
		score = sc.nextInt();
		
		if(score < 0 || 100 < score) {
			System.out.println("범위를 벗어났습니다");
			sc.close();
			return; // return : end of function
			// 현재 실행 중인 함수를 즉시 종료한다
		}
		System.out.println("점수 : " + score);
		sc.close();
	}
}
