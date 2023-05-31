package nesteArray;

public class Quiz1_2 {
	static void show(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void showPosition() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("[%d, %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		showPosition();
		
		// 다음 형태로 출력하세요
		//  1  2  3  4  5
		// 16 17 18 19  6
		// 15 24 25 20  7
		// 14 23 22 21  8
		// 13 12 11 10  9
		
		int size = 9;
		int num = 1;
		int x = -1, y = 0;
		int sign = 1;
		int[][] arr = new int[size][size];
		
		// x가 0이면 index는 0.1부터 채워지기 때문에
		// 마지막 5번은 없는 자리에 수를 넣는다는 의미가 된다
		// 그러므로 x초기값은 -1로 설정하여 0.0에서부터
		// 숫자가 나오도록 해준다
		
		while(true) {
			for(int i = 0; i < size; i++) {
				x += sign;
				arr[y][x] = num++;
			}
			size--;
			
			// 마지막은 길이감소 하기 전에 끝나기 때문에
			// 여기서 size가 0이면 멈춘다는 조건을 걸어둔다
			if(size == 0) {
				break;
			}
			
			for(int i = 0; i < size; i++) {
				y += sign;
				arr[y][x] = num++;
			}
			sign = -sign;
		}
		show(arr);
		
		
		
		
		
		
		
		
	}
}





















