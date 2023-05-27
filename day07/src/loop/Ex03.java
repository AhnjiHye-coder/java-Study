package loop;

public class Ex03 {
	public static void main(String[] args) {
		// 1) 1부터 100사이의홀수의 합과 짝수의 합을 for문으로 계산하여 출력
		
		int total1 = 0, total2 = 0;
		
		for(int  i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				total1 += i;
			}
			else {
				total2 += i;
			}
		}
		System.out.println("짝 : " + total1 + "\n" + "홀 : " + total2);
		
		// A부터 z까지 띄어쓰기로 구분하여 한 줄에 출력하세요
		for(int  i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		
		// 3) 빈 문자열에 * 기호를 5번 추가하여 출력하세요
		String s1 = "";
		for(int i = 1; i <= 5; i++) {
			s1 += "*";
		}
		System.out.print(s1);
	}
}
