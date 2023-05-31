package nesteArray;

public class Ex06 {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {6, 7, 8, 9, 10};
		int[] arr3 = {11, 12, 13, 14, 15};
		int[] arr4 = {16, 17, 18, 19, 20};
		int[] arr5 = {21, 22, 23, 24, 25};
		
		// 배열 : 깉은 자료형의 여러 데이터를 연속으로 배치한 구조
		// 이차원 배열 : 배열에 배열을저장하여 출력하자
		
		int[][] arr = {arr1, arr2, arr3, arr4, arr5};
		int[][] array = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}
		};
		
		
		// 밑 코드대로 출력한다면 코드 '[I@6d06d69c'이와 같은 종류로 5개가 나온다
		for(int i = 0; i < array.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(arr[i]);
			// 한번 index로 접근한 형태이기 때문에
			// 각 배열에 대해서 한번 더 반복문을 수행한다
			// 이차원배열의 숫자를 출력하려면 array[i]한 후에 출력해줘야 한다
			// 한번 더 진입해 줘야한다는 말이다
			for(int j = 0; j < array[i].length; j++) { 
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
	}
}








