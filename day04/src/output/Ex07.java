package output;

public class Ex07 {
	public static void main(String[] args) {
		// 이스케이프 시퀀스
		// 출력 시 모양으로 나타나지는 않으나 특수한 기능을 수행하는 글자
		
		char cr = '\r';	
		// carrige return : 커서를 줄 가장 왼쪽으로 이동시키다
		
		char lf = '\n';		
		// line feed : 커서를 한줄 아래로 이동시킨다
		
		char tab = '\t';
		// tab : 프로그램에서 지정한 탭 크기(4 or 8)만큼 우측으로 이동시킨다
		
		char bs = '\b';
		// backspace : 커서를 왼쪽으로 한칸 이동시킨다
		
		
		System.out.printf("cr : %d\n", (int)cr);		// 13 (Enter)
		System.out.printf("lf : %d\n", (int)lf);		// 10 (Enter)
		System.out.printf("tab : %d\n", (int)tab);		// 9
		System.out.printf("bs : %d\n", (int)bs);		// 8
		System.out.println();
		
		System.out.println("A_" + cr + "B");
		System.out.println("C_" + lf + "D");
		System.out.println("E_" + tab + "F");
		System.out.println("G_" + bs + "H");
		
		// 이클립스에서는 \t이 8칸으로 띄워지기 때문에 8칸 안넘는 문자수,숫자는 \t로 정렬할 수 있다
		System.out.println("원빈\t : 45세");
		System.out.println("박현빈\t : 40세");
		System.out.println("지드레곤\t : 34세");
		System.out.println("저스틴비버\t : 29세");
		System.out.println("저스틴벌랜더\t : 40세"); // 8칸이 기준이라면 8칸 넘어갔을땐 8칸이 앞에 더 생긴다
		
		// backslash : 특수 글자의 앞에 붙어서 기능을 제거하는 역할을 한다
		// " , \n등 원래 기능이 있는 것을 출력하고 싶다면  \(빽슬러시)를 붙여주면 출력가능
		System.out.println("쌍따옴표 (\")");
		System.out.println("개행문자(\\n)");
		
		System.out.printf("%d %% \n", 120);
		// %를 출력하고 싶다면 %%를 해주면된다 printf에서만 가능
		// println은 원래 서식문자를 안쓰기 때문에 printf만 해당
	}
}
