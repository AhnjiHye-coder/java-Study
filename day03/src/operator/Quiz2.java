package operator;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		long cardNumber;
		long left, right,n1, n2, n3, n4;
		Scanner sc = new Scanner(System.in);
		String answer = "";
		
		
		System.out.println("카드번호 16자리를 입력 : ");
		cardNumber = Long.parseLong(sc.nextLine());
		
		System.out.println("cardNumber : " + cardNumber);
		// 위 숫자를 4자리씩 분리하여 사이에 "-"를 더하여 다시 출력하세요
		
		left = cardNumber % 100000000;
		right = cardNumber / 100000000;
		n1 = left % 10000;
		n2 = left / 10000;
		n3 = right % 10000;
		n4 = right / 10000;
		answer = n1+"-"+n2+"-"+n3+"-"+n4;
		
		System.out.println("answer : " + answer);
		
		// 선생님풀이
		long b1, b2, b3, b4;
		b4 = cardNumber % 10000;     		// 4자리 담고
		cardNumber = cardNumber / 10000;	// b4에 담은 4자리는 빼고 남은 자리 담아주고
		b3 = cardNumber % 10000;			// 남은 12자리의 뒤에 4자리 b3에 담아주고
		cardNumber = cardNumber / 10000;	// b3에 담은 4자리 제거하고 남은 값 cardNumber담아주고
		b2 = cardNumber % 10000;			// 남은 4자리 b2에 담아주고
		b1 = cardNumber / 10000;			// 남은 4자리 b1에 담아주면 완료
		
		System.out.println("answer : " + answer);
		sc.close();
		
	}
}
