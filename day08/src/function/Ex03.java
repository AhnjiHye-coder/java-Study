package function;

import java.util.Scanner;

public class Ex03 {
	
	// 절대값 반환 메소드
	static int absolute(int num) {
		int answer = 0;
		
		if(num < 0)		answer = -num;
		else			answer = num;
		return answer;
	}
	
	// 원의 넓이 반환 메서드
	static double getCircieSize(double num) {
		double answer ;
		
		answer = num * num * 3.14;
		return answer;
		
	}
	
	// 큰 값을 비교하는 함수
	static int getBigNumber(int n1, int n2) {
		int tmp = n1 > n2 ? n1 : n2;
		return tmp;
	}
	
	public static void main(String[] args) {
		// 정수 하나를 전달 받아서 정수의 절대값을 반환하는 함수
		// int를 하나 전달 받아서, int를 반환한다(반환값은 하나만 가능)
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		int answer = absolute(num);
		System.out.println(num + "의 절대값 : " + answer);
		
		System.out.println(absolute(-3));
		System.out.println(absolute(3));
		
		// 정수로 반지름을 전달받아서, 원의 널이를 계산하여 반환하는 함수 작성
		// 원의 넓이 : 반지름 * 반지름 * 3.14
		
		double s1 = getCircieSize(5);
		double s2 = getCircieSize(30);
		System.out.printf("s1 : %.2f\n", s1);
		System.out.printf("s2 : %.2f\n", s2);
		
		
		// 두 정수를 전달하여, 큰 값을 반환하는 함수를 작성하세요
		int n1 = getBigNumber(5,3);
		int n2 = getBigNumber(-5,3);
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println();
		
		
		
	}
}
