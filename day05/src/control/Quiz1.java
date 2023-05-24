package control;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 나이를 정수로 입력 받아서
		// 성인 혹은 미성년자를 판별하여 출력하는 코드를 작성하세여
		// 삼한 연산자를 사용하지 않고, if를 이용하여 처리하세요
		// (20세 이상이면 성인, 아니면 미성년자)
		
		Scanner sc =  new Scanner(System.in);
		
		int age;
		String n1;
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		if(age >= 20) {
			n1 = "성인";
		}
		else {
			n1 = "미성년자";
		}
		System.out.println(n1 + "입니다");
		sc.close();
	}
}
