package loop;

public class Ex02 {
	public static void main(String[] args) {
		// for문에서 ;으로 구분된 각 절은 상황에 따라 생략할 수 있다
		// 절은 한 문장,문단을 의미한다
		
		int i;
		
		for(i = 0; i < 5; i++) {
			System.out.println("test1");
		}
		System.out.println();
		
		for(; i < 10; i++) {
			System.out.println("test2");
		}
		System.out.println();
		
		for(; i < 5;) {
			System.out.println("test3");
			i++;
		}
		System.out.println();
		
		// 조건절을 생략하면 while(true)와 마찬가지로 무한반복이 된다
		for(;;) {
			System.out.println("test4 : " + i);
			i++;
			if(i >= 1000 + 1) {
				break;
			}
		}
		System.out.println();
		
		
	}
}
