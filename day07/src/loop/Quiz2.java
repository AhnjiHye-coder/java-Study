package loop;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		int num = 0;
		int tmp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		num = sc.nextInt();
		tmp = num / 2;  // 숫자를 입력했을때 #이 숫자만큼 표시할 수 있도록 구현
		// /2를 한 이유는 숫자를 입력했을때 입력한 숫자의 절반을 기준으로 %단위로 #이 움직이기 때문
		
		System.out.println("[");
		
		// 반으로 나눠 %트로 표시하기 때문에 50길이는 즉 100이고, 25는 50인 셈이다
		for(int i = 0; i < 50; i++){
			if( i == 25) { // 50길이의 절반인 25에 숫자를 위치해라
				System.out.printf(" %d %% ", num);
			}
			if( i < tmp) {
				System.out.print("#");
			}
			else {
				System.out.print(" ");
			}
		
		}
		System.out.println("]\n");
		System.out.println();
		
		sc.close();
	}
}

