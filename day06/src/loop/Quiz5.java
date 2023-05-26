package loop;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		// 내가 입력한 숫자 1단위씩 ,가 찍여야 된다
		// 1단위에 숫자는 3개
		
		// 3으로 나눠질때라고 조건을 두면 숫자가 없는 맨 앞도 ,가 찍힌다
		// 그렇기 때문에 0이 아닐때로 가정을 하나 더 두어 맨 앞에 ,가 찍히지 않게 설계한다
		
		// 길이로 구현해보기
		// -1이 마지막수이기 때문에 -1로 범위를 잡아준다
		// 문자 하나하를 n1(새로운 변수)에 넣어준다
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0; 	// 숫자 입력받을 변수
		int cnt = 0;	// ,기준
		String num1 = "";	// 거꾸로
		String num2 = "";	// 원상복구
		
		System.out.print("입력 : ");
		n1 = sc.nextInt();
		
		while(n1 != 0) {
			if(cnt != 0 && cnt % 3 == 0) {
				num1 += ",";
			}
			cnt++;
			
			num1 += n1 % 10;
			n1 /= 10;
		}
		System.out.println("거꾸로 뒤집기 : " + num1);
		
		
		int i = num1.length() -1;
		while ( i != -1) {
			num2 += num1.charAt(i);
			i--;
		}
		System.out.println("원상복구 : " + num2);
	}
	
}
