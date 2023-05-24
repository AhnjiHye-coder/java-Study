package output;

public class Ex06 {
	public static void main(String[] args) {
		// 서식 제어 문자
		
		// printf 혹은 String.fomat함수를 사용할때
		// 다른 값을 채워넣을 수 있는 빈칸을 만들어주는 문자
		// 서식 제어 문자에 맞는 자료형의 값을 전달해야 한다
		
		// System.out.printf("pi : %f\n","3.14);
		// IllegalFormatConversionException : 잘못된 서식 변환 예외
		
		// %s : string, 문자열을 출력한다
		// %d : decimal, 정수를 10진수 형식으로 출력한다
		// %o : octal, 정수를 8진수 형식으로 출력한다
		// %x : HexaDecimal,  정수를 16진수 형식으로 출력힌다
		// %f : floating number, 실수를 출력한다
		// %c : character, 정수에 맞는 글자를 출력한다
		
		System.out.printf("num 'c' : %c\n", 79);
		System.out.printf("num 'd': %d\n", 79);
		System.out.printf("num 's': %s\n", 79);
//		System.out.printf("num 'f': %f\n", 80); // 출력 안됨, 실수 형식에 어긋난다
		System.out.printf("num 'o': %o\n", 79);
		System.out.printf("num 'x': %x\n", 79); // 16진수는 알파벳도 취급한다 1,2,3,4,5,6,7,8,9,A,B,C,D,E,F,G
		System.out.printf("test : %d\n", 9876543210L);
		
		// 서식을 활용한 날짜 및 시간 출력 예시
		int yyyy = 2023;
		int mm = 5;
		int dd = 18;
		String ampm = "오후";
		int hh = 6;
		int m = 12;
		
		String format = "%d-%02d-%02d %s  %02d:%02d\n";
		System.out.printf(format, yyyy, mm, dd, ampm, hh, m);
		
		// 윈도우에서 메모장에 f5누르면 현재시간, 날짜 나온다
		
		// 실수는 그냥 출력하면 기본 소수점 이하 6자리까지 출력되게 되어있다
		// f는 기본 6자리로 출력한다
		System.out.printf("pi : %f\n", 3.14);
		
		// 원하는 자리수까지 출력하는 방법
		
		// 1) 0을 해주면 소수를 정수처럼 보이도록 출력할 수 있다
		System.out.printf("pi : %.0f\n", 3.14);
		// 2) 1은 소수점 1자리까지 출력
		System.out.printf("pi : %.1f\n", 3.14);
		// 2) 2는 소수점 2자리까지 출력
		System.out.printf("pi : %.2f\n", 3.14);
		// 2) 3은 소수점 3자리까지 출력
		System.out.printf("pi : %.3f\n", 3.14);
		
		// 문자열은 칸을 확보한 후 왼쪽 혹은 오른쪽으로 배치 가능
		// 나중에 웹 쪽으로 가면  goi라고 해서 알아서 정렬하는 요소가 나온다
		// 오른쪽
		System.out.printf("name : [%15s]\n", "Star Load");
		// 왼쪽
		System.out.printf("name : [%-15s]\n", "Star Load");
		
		// 자바의 모든 데이터는 문자열로 표현가능하기 때문에, 어떤 형식이든 %s로 출력할 수 있다
		System.out.printf("System.out : %s\n", System.out);
		System.out.printf("정수 : %s\n", 55);
		System.out.printf("실수 : %s\n", 3.14);
		
		
	}
}








