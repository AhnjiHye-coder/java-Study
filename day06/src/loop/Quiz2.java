package loop;

public class Quiz2 {
	public static void main(String[] args) {
		// 1부터 100사이의 정수를 반복
		// 홀수의 합과 짝수의 합을 각각 구하여 출력
		
		int tmp1 = 0, tmp2 = 0;
		
		for(int i = 1;  i <= 100; i++) {
			if(i % 2 == 0) {
				tmp1 += i;
			}
			else {
				tmp2 += i;
			}
		}
		System.out.printf("짝수의 합 : %d\n"
				+ "홀수의 합 : %d\n", tmp1, tmp2);
	}
}
