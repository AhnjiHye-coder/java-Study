package String;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		
		// 자바의 문자열은 단순 값만 저장하지 않고,
		// 부가적인 기능(함수)이/가 포함되어있다
		// indexOf : 앞에 문자열에서 ()안에 있는 문자열이 몇번째에 위치했는가
		
		int n1 = "Hello".indexOf('e');
		int n2 = "Hello".indexOf('o');
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		// 일반 문자열에서 호출하여 실행할 수 있는 함수의 종류
		// 문자열 클래스(String)에서 호출하여 실행할 수 있는 함수의 종류
		
		String s1 = "Hello world";
		
		// charAt
		// 문자열을 배열로 가정했을 때, 지정한 index에 있는 글자 하나를 char형으로 반환
		// 문자열에서 n번째 문자열을 가져온다는 의미
		char ch1 = s1.charAt(0);
		char ch2 = s1.charAt(1);
		
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println();
		
		// compareTo
		// 글자끼리 대소관계를 정렬할 때 사용
		// 밑에 예시로 본다면 s1과 c1,c2의 글자를 비교하여 앞에가 동일하다면
		// 다음 문자로 넘어가서 확인하고 만약 틀린 부분이 나온다면, s1과 각 c1,c2의
		// 글자를 비교하여 문자열이 가진 값을 대상으로 빼고 뺀 값을 바로 출력한다
		
		// 각 글자가 가지고 있는 숫자를 배열에 담아 arr로 출력한 것이다
		// 이 밑에 숫자는 hello라는 글자를 다양한 방법으로 출력해본 예시다
		// 대문자,소문자를 이용하여 대문자로만 출력, 소문자로만 출력, 섞어서 출력을 함 
		char[] arr1 = {72, 101, 108, 111};
		char[] arr2 = {104, 101, 108, 111};
		char[] arr3 = {72, 69, 76, 76, 79};
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		
		
		int c1 = s1.compareTo("hello world");
		int c2 = s1.compareTo("Hello");
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println();
		
		String s2 = "banana";
		String s3 = "apple";
		
		// s2 - s3 > 0보다 크다면 if문 코드 실행
		if(s2.compareTo(s3) > 0) {
			String tmp = s2;
			s2 = s3;
			s3 = tmp;
		}
		// 위 코드 조건에 따라 s2,s3의 값이 서로 바뀜
		System.out.printf("s2 : %s, s3 : %s\n", s2,s3);
		
		
		// compareTo를 활용한 정렬 코드
		String[] arr4 = {"banana", "apple"};
		
		System.out.println(Arrays.toString(arr4));
		Arrays.sort(arr4,null);
		// sort를 하기 위해서는 두 수의 대소관계 비교가 필요하다
		// 대소관계 : 어떤 수가 더 크고 어떤 수가 더 작은지 관계를 파악하는 것
		// 문자열끼리 비교할때는  compareTo 함수를 이용한다
		
		System.out.println(Arrays.toString(arr4));
		
		// A.concat(B)
		// A뒤에 B내용을 더한 새로운 문자열을 반환한다
		// 즉, 기존 문자열에서 추가된 내용을 반환한다는 의미
		
		// s4,s5모두 같은 결과를 보여준다 
		// concat의 사용 유/무의 차이이다
		String s4 = "to".concat("get").concat("her");
		String s5 = "to"+"get"+"her";
		System.out.println("s4 = " + s4);
		System.out.println("s5 = " + s5);
		System.out.println();
		
		// A.startsWith(B)	: A문자열이 B내용으로 시작하게 하는 함수(true)
		// A.endsWith(B)	: A문자열이 B내용으로 끝나게 하는 함수(true)
		// A.contains(B)	: A문자열이 B내용을 포함하는지 판별하는 함수(true)
		// A.equals(B)		: A문자열이 B내용과 일치하는지 판별하는 함수(true)
		
		// EX) 전화번호는 010부터 시작해야 한다와 같이
		// 현재 문자열이 "'H'시작하는가?" 를 판별한다
		boolean b1 = "Hello".startsWith("H");
		
		// EX) 파일 이름이 .jpg인지 확인한다와 같이
		// 등록된 문자열이 마지막에 o로 끝나는가?를 판별한다
		boolean b2 = "Hello".endsWith("o");
		
		// EX) 이름에 '하'를 포함하고 있는가 와 같이
		// 기존 문자열에서 o를 포함하고 있는가?를 판별한다
		boolean b3 = "Hello".contains("o");
		
		// EX) 이름에 일치하는 상품검색
		// 기존 문자열과 방금 입력한 문자열이 동일한가?를 판별 
		boolean b4 = "Hello".equals("Hello");
		boolean b5 = "Hello".equalsIgnoreCase("Hello");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println();
		
		
	}
}










