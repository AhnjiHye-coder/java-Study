package nextedLoop;

public class Ex02 {
	static void gugudan(int dan) {
		System.out.println(dan + "단");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d x %2d = %2d\n", dan, i, dan * i);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		// 함수 만들기
		// 정수를 전달 받아서 해당 정수의 구구단을 출력하고 반환값이 없는 함수
		gugudan(2);
		gugudan(3);
		gugudan(4);
		gugudan(5);
		
		for(int dan = 1; dan < 10; dan++) {
			gugudan(dan);
		}
	}
}
