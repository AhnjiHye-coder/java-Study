package loop;

public class Ex02 {
	public static void main(String[] args) {
		// 일정한 횟수만큼 반복하기
		
		int cnt = 0;
		
		while(cnt < 5) {
			System.out.println("Hello world!");
			cnt++;
		}
		System.out.println("반복종료");
		System.out.println();
		
		// 변수 선언 및 초기화; 반복조건; 증감식;
		for(int i = 0; i< 5; i++) {
			System.out.println("Hello java");
		}
		System.out.println("for 반복종료");
		System.out.println();
		
	}
}
