package loop;

public class Ex09 {
	public static void main(String[] args) {
		
		// 배열은 Reference Type이고
		// 그냥 출력하면 내부 데이터가 출력되지 않음
		
		int[] t1 = {};
		System.out.println(t1);
		
		// 배열은 값을 지정하여 생성하거나, 길이를 지정하여 생성할 수 있다
		int[] n1 = {10, 20, 30, 40, 50};
		int[] n2 = new int[5];	// 길이 5짜리 빈 배열
		int[] n3 = new int[]{2, 7, 8, 4, 6};
		
		// 문자열은 참고만 하기
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		// 값을 지정하거나 길이를 지정하거나, 둘 중 하나만 해야한다
//		int[] arr = new int[5] = {1, 5, 2, 4, 3};
		
		
		// 길이를 지정하여 생성하면, 값을 자료형에 따라 0에 맞는 값으로 초기화한다
		for(int i = 0; i < n1.length; i++) {
			System.out.print(n1[i] + " ");
		}
		System.out.println();
		
		// 이차원배열
		for(int num : n3) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		// 자바의 참조변수 특성때문에 다른 배열을 가리킬 수 있다
		// 배열의 길이는 변할 수 없으나, 변수가 다른 배열을 가리키면서 길이가
		// 바뀐 것 처럼 보일 수 있다
		int[] n4 = {1, 2, 3};
//		n4[3] = 4;	// n4배열 인덱스 3번에 4를 추가하겠다는 의미인데
		// 실행하면 예외,오류가 발생한다/ 배열은 길이를 증가시킬 수 없다
		
		System.out.println(n4 + ": ");
		for(int num : n4) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		n4 = new int[] {1, 2, 3, 4};
		System.out.print(n4 + " : ");
		for(int num : n4)System.out.print(num + " ");
		System.out.println();
		
		// boolean : false
		// int  : 0
		// double : 0.0
		// String : NULL
		
		
		
		
	}
}














