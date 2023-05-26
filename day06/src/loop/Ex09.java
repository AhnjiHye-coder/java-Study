package loop;

import java.util.Random;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		// 사용자에게 0을 입력받을까지 정수를 반복하여 입력받고 그 합계를 출력하기
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int input;
		
		do {	// 일단 한번 실행하고
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			total += input;
			
		}while(input != 0);	// 이후 조건을 체크하여 반복 여부를 결정
		
		System.out.println("합계 : " + total);
		sc.close();
		
		
	}
}
