package operator;

import java.util.Scanner;

public class Quiz1 {
 public static void main(String[] args) {
	// Ex 04의 Scanner 형식을 참조하여 다음 조건을 만족하는 코드를 작성
	// 정수 하나를 입력 받아서, 홀수와 짝수를 문자열로 출력하는 코드를 작성
	// 단, 0은 짝수로 취급합니다
	 
	 int num = 1;
	 String tmp;
	 Scanner sc = new Scanner(System.in);
	
	 System.out.print("정수 입력 >> ");
	 num = sc.nextInt();
	
	 if(num % 2 == 0) {
		 tmp = "짝수";
	 }
	 else {
		 tmp = "홀수";
	 }
	 System.out.printf("%d는/은 %s입니다", num,tmp);
	 System.out.println();
	 
	 sc.close();
 	}
 
}

