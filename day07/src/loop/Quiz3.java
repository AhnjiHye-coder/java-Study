package loop;

import java.util.Arrays;
import java.util.Random;

public class Quiz3 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int size = 10;
		int range = 100;
		int[] arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(range);
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		// 1) arr의 값에서 홀수와 짝수가 각각 몇개인지 파악하여 출력
		int even = 0, odd = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even++;				
			}
			else {
				odd++;
			}
		}
		System.out.printf("홀 : %d개\n짝 : %d개", odd, even);
		System.out.println();
		
		// 2) oddArray와 evenArray를 생성하여 각각 홀,짝수를 담아서 출력
		int[] oddArray = new int[odd];
		int[] evenArray = new int[even];
		
		int evenIndex = 0, oddIndex = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenArray[evenIndex++] = arr[i];
			}
			else {
				oddArray[oddIndex++] = arr[i];
			}
		}
//		System.out.printf("짝 : %d\n홀 : %d\n", evenArray,oddArray);
		System.out.println(Arrays.toString(evenArray));
		System.out.println(Arrays.toString(oddArray));
		
		// 3) arr의 총 합을 구하여 출력하세요
		int sum1 = 0;
		
		// 1번째 방법
		for(int i = 0; i < arr.length; i++) {
			sum1 += arr[i];
		}
		System.out.println("총 합 : " + sum1);
		
		// 2번째 방법
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		System.out.println("총 합 : " + sum);
		
	}
}
