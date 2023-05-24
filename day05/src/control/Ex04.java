package control;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수입력 : ");
		num = sc.nextInt();
		
		// 2와 3에 모두 해당하는 배수가 나올 수도 있기 때문에
		// if,else if를 사용하지 않고 if만 사용하여
		// 2가지의 경우까지 오류없이 처리해준다
		
		if(num % 2 == 0) {
			System.out.println(num + ": 2의 배수");
		}
		if(num %  3 == 0) {
			System.out.println(num + ": 3의 배수");
		}
		sc.close();
		
	}
}
