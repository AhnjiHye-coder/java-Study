package type;

public class Ex01 {
	public static void main(String[] args) {
		//ctrl + m : 화면 최대,최소화
		System.out.println("Hello");
		
		// type : 데이터의 유형, 자료형(data, type)
		
		int t1 = 44032;
		char t2 = '가';
		
		System.out.println(Integer.toBinaryString(t1));
		System.out.println(Integer.toBinaryString((int)t2));
		System.out.println();
		System.out.println(t1);
		System.out.println(t2);
		
		// java Data Type
		
		// 1) primitive type : 변수 안에 값이 직접 들어가는 방식
		// 객체가 아닌 값을 나타내기 위한 자료형. 기본적인 유형의 값을 나타낸다
		// 자료형의 글자가 모두 소문자로 되어있다
//		boolean		(1, true, false)
//		byte		(1, -128 ~ 127) // 1바이트의 총 합을 반으로 나눠 음수,양수 구분
//		char		(2, 0 ~ 65535)
//		short		(2, -32768 ~ +32767)
//		int			(4, -21억 ~ +21억)
//		long		(8, -922경 ~ +922경)
//		float		(4, 실수)
//		double		(8, 실수)
//		// 기본 (원시) 자료형은 값을 변수에 직접 저장한다
		// 1-2-4-8-16-32-64-128-256-652-1024-2048-4096-8192-16384-32768-65536
		// 컴퓨터 날짜 : 1970-01-01 00:00:00 시작
		// 리터널에 나오는 자료형이 대표자료형이다 / 정수는 int, 실수는 double이다
		
		// 2) Reference type : 여러가지 값이 담겨있는 곳의 시작주소를 가리킨다
		// 2-1) Array Type : 배열, 모든 배열유형은 참조방식이다
		// 2-2) Class Type ; 클래스에 의해서 만들어진 객체, 객체는 참조방식이다
		// 래퍼런스 타입은 대상을 가리키는 형식이다
		
		
	}
}
