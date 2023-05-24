package output;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		// Scanner은 java 1.5부터 나왔다
		// 글자로 되어있는 것은 다 가능하다
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력 받기
		int num;
		System.out.print("정수입력 : ");
		num  = sc.nextInt();
		// \r,\n을 정리해주는 방법
		sc.nextLine();
		
		// 실수 입력받기
		double db;
		System.out.print("실수 입력 : ");
		db = sc.nextDouble(); // 숫자, \r, \n
		// \r, \n
		sc.nextLine();
		
		// 위에서 \r, \n을 정리해주지 않으면 이후 Line로
		// 문자열을 받을때 입력 못하고 코드가 끝나거나 넘어가게 된다
		// 이유는 이전에 nextInt,nextDouble는 숫자만 입력받고
		// 보이지는 않지만 내장되어있어 \r,\n를 제거하지 않아 남아있게 되는데
		// Line는 엔터키(\r, \n)전까지의 내용을 가져오는 특성을 가지고 있어
		// 이전에 nextInt,nextDouble에서 남은 \r, \n을 처리해주게 되면서
		// 입력 받지 못하고 정리만 하고 끝나게 되는 것이다
		// 왜냐하면 \r, \n 정리로 인해 입력 창이 끝나버리게 되기 때문이다
		// 뭐든 \r, \n을 만나면 그 물음의 창은 종료된다
		// 그러므로 반드시 나중에 Line를 사용하게 된다면 이전에 정리해주어야 한다
		
		// 문자열 입력 받기
		String str;
		System.out.print("문자열 입력 : ");
		// str = sc.next();	// 입력 데이터의 기본 처리 자료형은 문자열이다
		// 문자열로 받고나서 필요하면 정수, 실수로 바꿔준다
		
		str = sc.nextLine();
		// nextLine은 줄단위, 엔터키를 입력할때까지의 내용을 가져온다
		// 버퍼가 정리되지 않았다면 정상적으로 처리할 수 없다
		// 숫자를 들고오고 \r,\n는 버리고 다음 nextLine()를 사용하면 된다
		// 이 과정이 귀찮다면 parse를 사용해주자
		// ex) integer.parseInt();
		
		System.out.println("num : " + num);
		System.out.println("db : " + db);
		System.out.println("str : " + str);
		
		sc.close();
	
	}
	
}









