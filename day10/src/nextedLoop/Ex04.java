package nextedLoop;

public class Ex04 {
	public static void main(String[] args) {
		for(int  i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				boolean flag = i + j >= 4;
				System.out.print(flag ? "*" : "  ");
			}
			System.out.println();
		}
		System.out.println();
		
		int space = 4;
		int star = 1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			space -= 1;
			star += 1;
		}
		System.out.println();
		
		int sp = 2;
		int st = 1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < sp; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < st; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
			if(i < 2) {
				sp -= 1;
				st += 2;
			}
			else {
				sp += 1;
				st -= 2;
			}
		
		}	
		System.out.println();
		
		
		// i,j가 2거나 1,3과 같은 홀수가 포함되어있을 경우
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				boolean flag1 = (i == 2 || j == 0);
				boolean flag2 = (i % 2 != 0 && j % 2 != 0);
				System.out.println(flag1 || flag2 ? "* " : " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
	}
}
