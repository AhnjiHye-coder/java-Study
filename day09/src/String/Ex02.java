package String;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		// substing : 문자열 빼기
		// 문자열 자리기라도고 할 수 있으며, 문자열은 빼기가 불가능하기 때문에
		// 문자열을 빼고,자르고 싶을때 사용하는 함수이다
		
		String fieName = "Home.java";
		
		// 1개면 그때 부터 출력이고, 2개면 그 범위안에것을 출력한다는 의미
		// 괄호에 숫자 하나만 들어가면 5번째 부터~ 출력한다는 의미
		String s1 = fieName.substring(5);
		// 괄호안에 숫자 2개는 마지막에 입력된 수까지 자른다 라는 의미로
		// 시작 수 부터 마지막수 앞에 문자열까지 출력한다
		String s2 = fieName.substring(2, 4);
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		// split (스플릿)
		// 특정 글자를 기준으로 분리하여 배열로 만들어서 반환
		String url = "www.naver.com";
		// .은 특수기호이기 때문에 지금처럼 제거하고 싶거나 사용을 하고 싶다면 \\를 붙여야 한다
		// \\를 붙어야 특수기호 기능이 사라지고 출력할 수 있게 된다
		String[] arr = url.split("\\.");
		System.out.println(Arrays.toString(arr));
		
		// replace (리플레이스)
		// 특정 글자 혹은 패턴을 다른 내용으로 변경한 새로운 문자열을 반환
		String s3 = "life is too short";
		
		// 앞 문자를 뒤문자로 변경
		String s4 = s3.replace("o", "O"); 
		
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		
		// indexOf
		// 특정 글자나 패턴의 시작 위치를 정수로 반환
		//substring과 연계하여 사용하는 경우도 있음
		
		// substring으로 자르고 indexOf로 남은 글자수를
		// 출력하면 연계하여 사용한 예시가 될 수 있다
		
		int index = s3.indexOf("short");
		System.out.println("index : " + index);
		
		// index가 괄호에 하나만 들어갔으니
		// index변수에 들어간 문자열만(또는 부터) 출력
		String s5 = s3.substring(index);
		
		// 괄호에 두개가 들어갔으니 시작수인 0부터 index변수에 담긴 글자 전까지의
		// 모든 글자를 출력한다
		String s6 = s3.substring(0, index);
		System.out.println("s5 : " + s5);
		System.out.println("s6 : " + s6);
		System.out.println();
		
		// lowerCase(대->소), upperCase(소->대)
		// 모든 글자의 대문자는 소문자로 변경
		// 소문자는 대문자로 변경한다
		System.out.println(s3.length());
		
		// Arrays.toString
		// 배열을 문자열 형태로 변환하여 저장
		String s9 = Arrays.toString(arr);
		System.out.println("s9 : " + s9);
		
		// arr배열이 문자열로 치환하여 저장된 s9가 있다
		// s9의 data를 출력하고자 할때 0부터 s9길이의 -1까지만 출력
		// 즉, 마지막에 한글자만 빼고 모두 출력
		String s10 = s9.substring(0, s9.length() -1);
		System.out.println("s10 : " + s10);
		
		// 맨 첫글자만 빼고 출력
		s10 = s9.substring(1); 
		System.out.println("s10 : " + s10);
		
		
		
	}
}




