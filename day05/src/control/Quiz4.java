package control;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 서로 다른 세 정수를 입력 받아서 가장 큰 수를 출력하세요
		// 만약 같으면 아무 수나 출력해도 됩니다
		
		Scanner sc =  new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("세 정수를 입력하세요 >> ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		System.out.printf("%d, %d, %d\n", n1, n2, n3);
		
		int max = n1;
		
		if(max < n2) {
			max = n2;
		}
		if(max < n3) {
			max = n3;
		}
		System.out.println("max : " + max);
		sc.close();
		
	}
}
