package output;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 생년월일을 8자리 정수로 입력 받아서
		// 올해년도를 이용하여 나이를 계산하여 출력하기
		
		int curren = 2023;
		int birth, month, data, age;
		
		// 올해에서 나의 년도 빼기하고 +1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생년월일 입력(8자리):");
		birth = sc.nextInt();
		
		data = birth % 100;
		birth = birth / 100;
		month = birth % 100;
		birth = birth / 100;
		
		age = curren - birth + 1;
		
		System.out.println("생년월일 :"
				+ birth + "년" + month
				+ "월" + data + "일"
						+ "\n"
						+ "나이 : " + age);
		
		sc.close();
	}
}
