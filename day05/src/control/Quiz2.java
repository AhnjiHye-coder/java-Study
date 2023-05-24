package control;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 지하철 1구간 당 평균 이동시간이 4분이라고 가정한다
		 이동구간 수를 입력받아서, 걸린 시간을 출력하시오
		 단, 시간이 60분 이상이면 시간과 분을 구분하여 출력하고
		 시간이 60분 미만이면 분을 출력하세요 
		 */
		// 문제에서 요인을 찾아야 한다 
		// 요인 : 이 값을 찾으면 해결되겠다
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int s1 = 4;
		int time, ho, mi;
		
		
		
		System.out.print("이동구간 : ");
		num = sc.nextInt();
		
		time = num * s1;
		
		if(time >= 60) {
			ho = time / 60;	// 60을 나누면 1
			mi = time % 60; // 60을 나누고 떨어지는 수
			System.out.printf("이동시간 : %d시간 %d분", ho,mi);
		}
		else {
			System.out.printf("이동시간 : %d분", time);
		}
		sc.close();
		
		
		
		
	}
}
