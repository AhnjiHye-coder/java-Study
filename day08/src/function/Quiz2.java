package function;

public class Quiz2 {
	
	
	// 서식에 따른 문자열을 만들어내려면 String.format("%2d : %2d",hour, minute)
	
	// 1) 정거장 구간 수에 따른 걸린 시간을 문자열로 반환하기
	// (구간 당 4분으로 계산하며, 60분을 초과하면 시간과 분으로 구분하여 반환하기)
	
	static String quiz1(int i) {
		int n = 4;
		int time = i * n;
		int ho, mi;
		String n1 = null;
		
		if(time >= 60) {
			ho = time / 60;
			mi = time % 60;
			n1 = ho + "시간" + mi + "분";
		}
		else {
			n1 = time + "분";
		}
		return n1;
	}
	
	// 2) 놀이기구 이용시간에 따른 요금을 문자열로 반환하기
	// 기본 30분까지는 3천원, 이후 10분당 500원의 추가요금이 발생함
	// 천단위 구분기호를 찍어서 처리해야 함
	static String quiz2(int tmp) {
		String answer = null;
		
		int fee = 3000;
		
		if(tmp > 30) {
			fee += 500 * ((tmp - 21) / 10);
		}
		// String.format은 printf와 같은 기능이지만 printf에서 출력만 빠진것이다
		answer = String.format("이용시간 %,d원",fee); 
		return answer;
	}
	
	// 3) 두 정수를 전달 받아서, 두 정수 사이의 모든 수의 합을 구하여 반환
	// 두 정수의 대소관계는 정해져있지 않음
	
	static int quiz3(int n1, int n2) {
		int answer = 0;
		if(n1 > n2) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
		answer = (n1 + n2) * (n2 - n1 + 1) / 2;
		return answer;
	}
	
	
	public static void main(String[] args) {
		
	String n1 = quiz1(50);
	System.out.println(n1);
		
	String n2 = quiz2(50);
	System.out.println(n2);
	
	int n3 = quiz3(50, 1);
	int n4 = quiz3(5, 40);
	System.out.println(n3);
	System.out.println(n4);
	
	
	}
	
}
