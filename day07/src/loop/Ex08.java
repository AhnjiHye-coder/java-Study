package loop;

public class Ex08 {
	public static void main(String[] args) {
		
		int n1 = -5, n2 = 12, n3 = 4;
		int max;
		
		max = n1;
		if(max < n2) {
			max = n2;
		}
		if(max < n3) {
			max = n3;
		}
		System.out.println("max : " + max);
		System.out.println();
		
		int[] arr = {17, 26, 33, 52, 46, 87, 69, 92, 73};
		max = 0;
		for(int  i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println();
		
		// 1) arr의 값 중에서, 홀수이면서 가장 큰 값을 찾아서 출력
		int total = 0;
		for(int  i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0 && total < arr[i]) {
				total = arr[i];
			}
		}
		System.out.println("1.홀수 이면서 가장 큰 값 : " + total);
		
		// 2) arr값 중에서, 짝수인 값의 합계를 구하여 출력
		int total1 = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				total1 += arr[i];
			}
		}
		System.out.println("2.짝수의 합계 : " + total1);
		System.out.println();
		
		// 또는
		int evenSum = 0;
		for(int num : arr) { // num변수에 arr배열의 값을 모두 넣고
			if(num % 2 == 0) {	// arr의 값을 가진 num의 값 중 짝수를
				evenSum += num;	// evenSum에 넣어라(합을 구해라)
			}
		}
		System.out.println("2) " + evenSum);
		
		// 3) arr의 모든 값의 평균을 구하여 소수점 둘째자리까지 출력
		
		int tmp = 0;
		double avg;
		
		for(int nn : arr) {
			tmp += nn;
		}
		avg = tmp / 9;
		System.out.printf("평균 : %.2f\n",avg);
		System.out.println();
		
		// 위 같은 코드 다른 방법 구현
		int tot = 0;
		double ffn = 0;
		
		for(int i = 0; i < arr.length; i++) {
			tot += arr[i];
			ffn = tot / 9;
		}
		System.out.printf("%.2f\n",ffn);
		
	}
}













