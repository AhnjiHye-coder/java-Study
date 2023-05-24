package operator;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n1 = ran.nextInt(9) + 1;
		int n2 = ran.nextInt(9) + 1;		
//		Integer answer = null; // 이렇게도 가능하다 하지만
		int answer; // 이번 코드는 Integer를 사용하지 않아도 된다
		
		System.out.println(n1 + "+" + n2 + " = ?");
		answer = Integer.parseInt(sc.nextLine());
		
		// 삼항 연산자 (둘 중 하나, 동전 앞/뒤, 전원 on/off, 로그인/로그아웃)
		// 두개 중에 하나를 정할 거라면 삼항 연산자를 사용하여 짧고 간결하게 구현하자
		System.out.println(answer == n1 + n2 ? "정답" : "오답");
		
		// 분기문(분기가 많거나, 수행하는 코드가 일정하지 않고, 내용이 길다면 분기문)
		// 세개중에 하나, 분기가 많거나 수행하는 코드가 일정하지 않을때, 즉 내용이 길다면
		// 삼항 연산자보다는 분기문을 사용하는 것이 맞다
		if(answer == n1 + n2) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
		sc.close();	// 프로그램이 끝날때 입력 통로를 닫아줘야 한다

	}
}
