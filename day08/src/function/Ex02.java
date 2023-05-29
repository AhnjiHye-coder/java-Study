package function;

import java.util.Arrays;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int length = ran.nextInt(5) + 1; // 랜덤수를 받는 rna객체 생셩
		int[] arr = new int[length];// 배열에 ran객체의 형식으로 배열을 생성한다
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt() % 100;
		}
		System.out.println(Arrays.toString(arr));
		
		// 절대값이 최대인 값을 찾아내기
		// 1) 절대값으로 구성된 새로운 배열 만들기
		int[] tmp = new int[length];
		for(int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if(num < 0 ) {
				num = -num;	// 음수라면 반전 후 다시 num에 담고
			}
			tmp[i] = num;	// 음수가 아닌 값과 음수였지만 양수로 치환되어 num에 담긴 값을
			// tmp배열에 담아라
		}
		System.out.println("1) tmp : " + Arrays.toString(tmp)); // 그리고 출력
		
		
		// 2) 최대값을 찾아서 그 index를 저장하기
		int index = 0;
		int max = 0;
		
		for(int i = 0; i< tmp.length; i++) { // tmp배열에 담긴 값 중에
			if(max < tmp[i]) {		// 가장 큰 값을 정렬알고리즘을 거쳐
				max = tmp[i];		// 비교하여 결과를 내고
				index = i;			// 가장 큰 값을 index변수에 담아라
			}
		}
		
		// 3) 원래 배열에 index를 이용하여 값 출력
		// 그리고 tmp전에 배열에 가장 큰 값으로 나온 data를 담아서 출력
		System.out.println("3) 절대값이 가장 큰 수 : " + arr[index]);
		
		// 4) 함수를 이용하여 계산한 값
		int result = getMaxAbsIndex(arr);
		System.out.println("4) 절대값이 가장 큰 수 : " + arr[result]);
		
		
	} // end of main
	
	// 함수 정의는 함수 바깥에서 이루어져야 한다(클래스 내부에서 함수를 정의함)
	static int getMaxAbsIndex(int[] arr) {
		// index를 찾아서 반환
		int index = 0;
		
		int[] tmp = new int[arr.length]; // tmp배열 생성줌(절대값이 해결된 data만 담는 공간)
		for(int i = 0; i < arr.length; i++) { // 그렇다면 절대값을 해결해주기 위해 배열 길이만큼 반복하면서
			int num = arr[i];	// num변수에 arr의 값을 담아주고
			if(num < 0) {		// num에서 음수들은 절대값 해결
				num = -num;
			}
			tmp[i] = num;		// num인 arr배열의 data 중 양수는 바로 tmp에 담는다
		}
		
		int max = 0;
		for(int i = 0; i < tmp.length; i++) {	// 그리고 tmp배열 중
			if(max < tmp[i]) {					// max보다 큰 값을 반복하여 찾고
				max = tmp[i];					// 가장 큰 값을 max변수에 담는다
				index = i;						// 그리고 그 가장 큰 값을 index에 넣어준다
			}
		}
		return index;							// 가장 큰 그 값을 반환
	}
	
	
	
}















