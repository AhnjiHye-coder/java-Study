package nesteArray;

public class Quiz1_1 {
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
		
		// 다음 형태로 출력하세요
		//  1  2  3  4  5
		// 16 17 18 19  6
		// 15 24 25 20  7
		// 14 23 22 21  8
		// 13 12 11 10  9
		
		showPosition();
		
		int size = 5;
		int num = 1;
		int x = -1, y = 0;
		int sign = 1;
		int[][] arr = new int[size][size];
		
		// 먼저 index로 증가/감소의 길을 잡아준 후
		// 배열에 숫자를 증가시킨다(배열에 숫자는 출력될 수)
		// 그리고 길이가 짧아지는지,+,-처럼 부호가 반전되어서 증가해야 하는지
		// 길이 감소가 아닐때는 부호반전
		
		for(int i = 0; i < size; i++) {
			// 바로 1이 증가하면서 들어가게 떄문에 초기값은 -1로 한다
			x += sign; // sign으로 해주어야 index 부호반전이 적용되어
			// x,y의 방향이 올바르게 출력된다
			arr[y][x] = num++;
		}
		size--; // 그리고 길이감소 4
		
		for(int i = 0; i < size; i++) {
			y += sign;	// 이번에는 y의 index가 증가
			arr[y][x] = num++;
		}
		sign = -sign; // 부호반전하면 -되면서 반복되던 index가 감소되면서 출력
		
		for(int i = 0; i < size; i++) {
			x += sign;
			arr[y][x] = num++;
		}
		size--; 
		
		for(int i = 0; i < size; i++) {
			y += sign;
			arr[y][x] = num++;					
		}
		sign = -sign; // +
		
		for(int i = 0; i < size; i++) {
			x += sign;
			arr[y][x] = num++;					
		}
		size--;;
		
		for(int i = 0; i < size; i++) {
			y += sign;
			arr[y][x] = num++;					
		}
		sign = -sign; // -
		
		for(int i = 0; i < size; i++) {
			// 길이가 반전 된 상태에서 +가 되어 
			// 출력될 데이터의 방향과 자리를 잡아준다
			// -라면  -된 상태에서 +가 되어 내림차순으로 num data출력
			// +라면 +된 상태로 오름차순 num data출력
			x += sign;
			arr[y][x] = num++;
		}
		size--;
		
		for(int i = 0; i < size; i++) {
			y += sign;
			arr[y][x] = num++;
		}
		sign = -sign;
		
		for(int i = 0; i < size; i++) {
			x += sign;
			arr[y][x] = num++;
		}
		
		// x와 y를 번갈아가면서 sign해주는 이유는 index에 따라서
		// 증가,감소,유지될때가 다르기 때문에 그 부분을 이용하여
		// 방향을 정하려면 번갈아가면서 대입해줘야 한다
		
		
		
		show(arr);
		
	}
}
