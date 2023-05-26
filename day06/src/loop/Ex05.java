package loop;

public class Ex05 {
	public static void main(String[] args) {
		
		int cnt = 0;
		
		// cnt가 10보다 작으면 실행
		while(cnt < 10) { // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
			if(cnt % 3 == 0) { //[0] [3] [6] [9]
				System.out.println(cnt + " ");
			}
			cnt++;
		}
		System.out.println();
	}
}
