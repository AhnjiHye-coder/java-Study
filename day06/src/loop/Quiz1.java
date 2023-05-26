package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 정수 하나를 입력 받아서 1부터 입력받은 정수까지 한 줄에 출력하는 코드
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			System.out.println("결과 : " + i);
		}
		
		// while구현
		int cnt = 0;
		int total2 = 0;
		while(cnt <= num) { // cnt가num보다 작거나 같을때 실행
			System.out.println("while결과 : " + cnt);
			cnt++;
		}
		System.out.println();
		sc.close();
	}
	
}
