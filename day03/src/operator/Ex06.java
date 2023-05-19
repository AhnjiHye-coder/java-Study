package operator;

public class Ex06 {
	public static void main(String[] args) {
		// 대입연산
		// 우변의 값을 좌변의 공간에 복사하여 저장한다. 기존 값을 덮어쓴다
		int n1 = 10;
		int n2 = 20;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println();
		
		n1 = n2;
		// n2의 값을 n1변수에 복사하여 대입한다. 기존의 10은 사라지고 20으로 바뀐다
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println();
		
		// 대입연산에서 좌변과 우변에 동일한 변수가 등장하고, 산술연산의 결과를 대입할 때
		n1 = n1 + 3; //좌(공간) = 우(값) + 3(값) / 오른쪽 먼저 처리한다 (오른쪽인 n1을 먼저 처리한다)
		System.out.println("n1 : " + n1);
		
		n1 += 3;	// 기존 값에서 3만큼 증가시킨다 (복합 대입, 배정 대입)
		System.out.println("n1 : " + n1);
	
		// 일반 대입은 값이 있는 변수라면 기존의 값이 사라지는데
		// 복합 대입은 기본 값에 더하거나 뺀다
		// 즉, 복합대입연산자는 기존값을 참조하여 더하거나 빼거나 산술연산을 수행한다
		
		// 게시글 조회수. 게시글을 열람할 때 마다 기존 조회수 + 1을 연산하여 다시 대입한다
		// update board set viewCount = viewCount + 1 where idx = 5283;
		int viewCount = 0;
		viewCount += 1;
		viewCount += 1;
		viewCount += 1;
		System.out.println("viewCount : " + viewCount);
		
		// -=, *=, /=, %=
		int binary = 2;
		for(int i = 0; i<10; i++) {
			binary *= 2;
		}
		System.out.println("binary : " + binary); // 2^10
		
		
		
		
		
		
		
		
		
		
	}
}


























