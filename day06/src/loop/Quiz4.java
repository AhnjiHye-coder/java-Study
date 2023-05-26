package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 랜덤을 활용한 업다운게임을 작성하세요
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = ran.nextInt(50) + 1;
		int cnt = 0, answer;
		
		System.out.print("입력 : ");
		answer = sc.nextInt();
		
		while(num != answer) {
			if(answer > num) {
				System.out.print("DOWN 다시 입력 : ");
				answer = sc.nextInt();
				cnt++;	// 몇번만에 맞췄는가?
			}
			else {
				System.out.print("UP 다시 입력 : ");
				answer = sc.nextInt();
				cnt++;
			}
		}
		System.out.println("딩동댕" + cnt + "번 만에 맞췄습니다");
		sc.close();
	}
}
