package String;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		// 문자열 함수를 활용하는 예시
		
		String url = "https://search.naver.com/search.naver?query=iu&where=news";
		
		// 명령어를 운영체제에게 전달하여 프로그램을 실행하기 위한 객체 Runtime
		// ?를 기준으로 글자열 분리
		// [0]번째 : https://search.naver.com/search.naver
		// [1]번째 : query=iu&where=news
		String[] arr = url.split("\\?");
		System.out.println(url);
		System.out.println();

		// ?대신 /로 치환하여 구분하겠다
		String[] arr1 = arr[0].split("/");
		System.out.println("arr1 : " + Arrays.toString(arr1));
		
		// (:)를 ()빈문자열로 바꾸겠다
		System.out.println("프로토콜 : " + arr[0].replace(":",""));
		System.out.println("서버페이지 : " + arr1[2]);
		System.out.println("페이지 이름 : " + arr1[3]);
		
		// &글자를 기준으로 분리해서 arr2에 문자열형태로 담겠다
		// 긴 배열에서 어디를 기준으로 끊어야 할때 사용
		// 문자열을 분리해야할때 기준이 되는 문자열을 입력하면 분리됨
		String[] arr2 = arr[1].split("&");
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		for(int i = 0; i < arr2.length; i++) {
			String s = arr2[i];
			String name = s.split("=")[0]; // =를 기준으로 [0]앞 문자열
			String value = s.split("=")[1];// =를 기준으로 [1]뒤 문자열
			System.out.printf("%s : %s\n", name, value);
		}
		
		
		
	}
}
