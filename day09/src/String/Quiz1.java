package String;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 Luhn 알고리즘
		 
		 카드 번호 16자리의 글자를 이용하여 카드번호의 유효성을 검증하는 알고리즘
		 우측부터 세어서 홀수번째는 그대로 두고 짝수번째는 두배로 만든다
		 만약 두배로 만들어진 값이 두자리수가 되면 각 자릿수를 합친다
		 10으로 나누어 떨어지면 유효한카드번호, 그렇지 않으면 유효하지 않은 카드번호이다
		 
		 문자열로 카드번호 xxxx-xxxx-xxxx-xxxx형식으로 전달 받아서
		 유효성을 true/false로 반환하는 함수를 작성하고 테스트하세요
		 
		 String num1 = Luhn(1720-1234-5678-1357);
		 String num2 = Luhn(2740-2264-1658-2317); // (60, true)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		// 카드번호를 문자열로 받고 boolean로 결과를 내라
		
		String t1 = "2720-1234-5678-1357";
		String t2 = "1720-1234-5678-1357";
		
		boolean b1 = checkCardNumber(t1);
		boolean b2 = checkCardNumber(t2);
		
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
	
		
	}
	
	static boolean checkCardNumber(String n1) {
		boolean answer = false;
		
		// -를 빼고 판별해야 하기 때문에 -를 빈칸으로 변경한다
		n1 = n1.replace("-", ""); 
		
		if(n1.length() != 16) {
			return false;
		}
		
		int sum = 0;
		for(int i = 0; i < n1.length(); i++) {
			// 카드번호를 하나하나하나ch에 담아준다
			char ch = n1.charAt(i); // 1. 하나하나 비교해서
			// 글자에서 숫자를 빼려면 48이 된다(48 : 아스키코드 0을 의미)
			// 만약 7이라고 가정한다면 48 - 7 = 41(이면 홀수인 것이다)
			int num = ch - 48;		// 짝수거나, 홀수인지 판별
			
			if(i % 2 == 0) { // 짝수이면
				num *= 2;	 // 2배
				if(num >= 10) { // 짝수인데 2자리수라면
					// 그 앞 뒤 자리수를 더해라
					num = num / 10 + num % 10;
				}
			}
			// 이렇게 만들어진 합계를 누적시킨다
			sum += sum;	
		}
		// 그 합계가 10으로 떨어지면 true
		answer = sum % 10 == 0;
		return answer;
	}
}



















