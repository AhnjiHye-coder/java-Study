package loop;

public class Ex04 {
	public static void main(String[] args) {
		
		System.out.printf("%d x %d = %2d\n", 3, 1, 3 * 1);
		System.out.printf("%d x %d = %2d\n", 3, 2, 3 * 2);
		System.out.printf("%d x %d = %2d\n", 3, 3, 3 * 3);
		System.out.printf("%d x %d = %2d\n", 3, 4, 3 * 4);
		System.out.printf("%d x %d = %2d\n", 3, 5, 3 * 5);
		System.out.printf("%d x %d = %2d\n", 3, 6, 3 * 6);
		System.out.printf("%d x %d = %2d\n", 3, 7, 3 * 7);
		System.out.printf("%d x %d = %2d\n", 3, 8, 3 * 8);
		System.out.printf("%d x %d = %2d\n", 3, 9, 3 * 9);
		System.out.println();
		
		int total = 0;
		for(int i = 1; i <= 9; i++) {
			total = 3 * i;
			System.out.printf("3 * %d = %d\n",i,total);
		}
		
		// 반복문은 연속성을 가지고 있어야 전체로 반복할 수 있다
		// 연속성이 없다면  if로 범위로 지정하며 반복을 돌릴 수 있긴 하지만
		// 반복문으로 사용하기에 조금 애매한 것 보다는 연속성, 규칙성이 있을때
		// 사용하기를 권장 할 수 있음
		
	}
}
