package loop;

public class Ex01 {
	// 반복문 : 조건에 따라 종속문장을 반복하여 실행한다
	public static void main(String[] args) {
		
		int num = 10;
		
		// 조건이 참이면 종속문장을 한번만 실행한다
		if(num < 20) {
			num++;
			System.out.println("if) num : " + num);
		}
		
		// 조건이 찾이면, 종속문장을 실행하고
		while(num < 20) {
			num++;
			System.out.println("while) num : " + num);
		}
		
		// 조건을 잘못 지정하면 무한반복이 발생한다
		while(num != 0) {
			num++;
			System.out.println("infinite loop) num : " + num);
			
			//무한 루프에 걸리지 않으려면 반드시 제한을 걸어야 한다
			if(num == 1000) {
				break;
			}
		}
		System.out.println("프로그램 종료!");
	}
}
