package function;

public class Ex07 {
	// 가변인자 활용 예시
	static int getTotal(int...args) { // 값의 개수가 일정하지 않을때(가변인자)
		int total = 0;
		System.out.println("args.length : " + args.length);
		for(int num : args) { // args전체를  num에 그대로 담았다
			total += num;
		}
		return total;
	}
	// 매개변수의 개수가 일정하지 ㅇ낳다
	public static void main(String[] args) {
//		System.out.printf();는 가변인자를 사용한다
		// 가변인자로 메서드를 구현하면 매개변수의 변수개수와 상관없이 data를 넣어도 된다
		System.out.println(getTotal(1,2,3));
		System.out.println(getTotal(10, 20, 30, 40, 50));
		System.out.println(getTotal(3, 5));
		
		/*
		 args.length : 3 // 메소드에 들어온 data개수
		 6				 // 메소드 실핼 후 결과 값
		
		 args.length : 5 // 메소드에 들어온 data개수
		 150		     // 메소드 실핼 후 결과 값
		
		 args.length : 2 // 메소드에 들어온 data개수
		 8 				 // 메소드 실핼 후 결과 값
		 
		 */
	}
}
