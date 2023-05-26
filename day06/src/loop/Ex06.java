package loop;

public class Ex06 {
	static int checkNumber(int num) {
		// 전달받은 숫자에 3, 6, 9가 몇개인지 반환하는 함수
		String value = num + "";	// 문자열로 출력해야 하기 때문에 ""를 같이 변수에 담는다
		int answer = 0;
		
		for(int i = 0; i < value.length(); i++) {
			char ch = value.charAt(i);
			if(ch == '3' || ch == '6' || ch == '9') {
				answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// f5 : Step into , 해당 함수 내부로 진입하여 디버깅을 계속 진행한다
		// f6 : Step over, 해당 함수로 진입하지 않고 함수의 결과만 받아서 계속 진행
		// ctrl + alt + b : 실행이 씹힐 때 사용하면 된다
		
		int num = 1;	// 반복 시작 값
		
		while(num <= 50) {
			int cnt = checkNumber(num);
			// 함수역할은 3,6,9가 해당될때 숫자를 증가시킨 answer를
			// main에 전달하여 박수치는 그림 출력
			for(int i = 0; i < cnt; i++) { // 3,6,9일때 출력할 조건문
				System.out.print("🖐");
			}
			if(cnt == 0) {		// 3,6,9가 아닐때는 숫자 출력
				System.out.print(num);
			}
			System.out.println(); // 한칸씩 내리면서 출력
			num++;				  // num이 증가하면서 50까지 출력
		}
		System.out.println("끝");	// 50까지 출력 후 종료
		
		
		
	}
}
