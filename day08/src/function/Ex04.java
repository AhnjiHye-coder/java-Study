package function;

public class Ex04 {
	public static void main(String[] args) {
		// 1) 정수를 하나 전달 받아서 절대값을 반환하는 함수
		int t1 = getAbsoLyte(5);
		int t2 = getAbsoLyte(-7);
		
		// 2) 세 정수를 전달 받아서 최소값을 반환하는 함수
		int t3 = getMinValue(7, 2, 5);
		
		// 3) 길이가 3인 배열을 전달 받아서 최소값을 반환하는 함수
		int[] arr = {7, 2, 5};
		int t4 = getMinValue(arr);
		
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);
		System.out.println("t4 : " + t4);
		
	}
	// 절대값 반환 함수
	static int getAbsoLyte(int num) {
		int tmp = 0;
		
		if(num < 0) {
			tmp = -num;
		}
		else {
			tmp = num;
		}
		
		return tmp;
	}
	
	// 3정수의 최소값 반환 함수
	static int getMinValue(int n1, int n2, int n3) {
		int min = n1;
		
		if(min > n2) {
			min = n2;
		}
		if(min > n3) {
			min = n3;
		}
		
		return min;
	}
	
	// 3인 배열의 최소값 반환
	static int getMinValue(int[] arr) {
		int min = 0;
		min = Integer.MAX_VALUE; // 정수 범위에서 최대값
		// 이렇게 하면 비교할 매개변수끼리 비교할 수 없을때 유용하다
		// 제일 작은 값을 찾아야 하기 떄문에 제일 큰 값과 비교를 해야한다
		// 왜냐하면 이번 메소드에서 전달 받은 매개변수는 arr 하나이기 때문에
		// 그러므로 하나뿐인 변수와 비교하기 위해서는 가장 큰 값을 만들어 비교해준다
		// 가장 큰 값을 만드는 방법중에 하나는 Integer.MAX_VALUE를 호출하여
		// 비교하는 방법도 있다
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
}






















