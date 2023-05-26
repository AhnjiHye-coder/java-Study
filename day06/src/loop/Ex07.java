package loop;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		
		// 탐색
		// 순차 탐색 sequencial search	: 처음부터 순서대로 하나씩 값을 비교해나가는 방식
		// 이진 탐색 binary search 	    : 중간 값을 찾아나가면서, 값의 범위를 좁혀나가는 방식
		
		Random ran = new Random();
		int cnt = 0;
		int min = 1;
		int max = 1000;
		int answer = ran.nextInt(max) + 1; // max값만큼 랜덤값으로 저장
		int seq = min;
		
		// 순차 탐색
		while(true) {
			cnt++;
			if(seq == answer) {
				break;
			}
			seq++;
		}
		System.out.printf("seq : %d, cnt : %d\n", seq, cnt);
		
		
		// 이진 탐색
		int bin;
		cnt = 0;
		
		while(true) {
			// 찾는 값은(최소값 / 최대값) /  2
			bin = (min + max) / 2;
			cnt++;
			
			// 과정을 보기위한 출력
			System.out.printf("seq : %d, cnt : %d\n", seq, cnt);
			
			if(bin > answer) {
				System.out.println("DOWN");
				max = bin;
			}
			else if(bin < answer) {
				System.out.println("UP");
				min = bin;
			}
			else {
				break;
			}
		}
		System.out.printf("seq : %d, cnt : %d\n", seq, cnt);		
	}
}
