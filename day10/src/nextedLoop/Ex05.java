package nextedLoop;

public class Ex05 {
	public static void main(String[] args) {
		
		// i와 j를 순서대로 출력하기
		// i는 처음에 증가하고 j가 5번 반복하여 j의 조건문이 끝나면 다시 i가 증가한다
		for(int i = 0; i < 5; i++) { 
			for(int j = 0; j < 5; j++) { 
				int num = i * 5 + j + 1; // j조건에 따라 5번 반복할때 i는 한번 증가한다
				// 그래서 j가 증가하면서 출력되고 5번끝나면 한줄 내려서 i가 증가하고 j가 5번 반복하면서
				// 증가 후 출력하고를 반복하는 것이다
				System.out.printf("%2d ", num);
				num += 1;
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 출력은 무조건 왼쪽에서 오른쪽으로 위에서 아래로 된다
		// 순서대로 출력하지 말고 넣는 규칙을 잘 생각하고 계산하여 구현하다
		// 칸을 만들어 놓고 만들어진 칸에 값을 넣는 것은 '이차원배열'을 사용해야 함
		// i와 j를 이용하여 가로세로 반전 출력하기
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				int num1 = j * 5 + i + 1;
				System.out.printf("%2d ", num1);
			}
			System.out.println();
		}
		System.out.println();
		
		// 변수에 저장된 값을 일정 크기만큼 증감하여 가로세로 반전출력하기
		
		int num = 1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%2d ", num);
				num += 5;
			}
			System.out.println();
			num -= 24;
		}
		System.out.println();
	}
}
