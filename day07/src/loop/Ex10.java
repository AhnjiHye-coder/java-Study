package loop;

public class Ex10 {
	public static void main(String[] args) {
		
		// 배열의 길이 5
		String[] arr = new String[5];
		
		// arr배열을 s변수에 바로 담기
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println();
		
		// 각 index에 값을 넣어준다
		arr[0] = "이지은";
		arr[1] = "나단비";
		arr[2] = "홍진호";
		
		// 그 배열을 다시 s에 넣어준다
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println();
		
		// 배열에 값이 없다면 출력안함
		for(String s : arr) {
			if(s != null) {
				System.out.println("글자 길이 : " + s.length());
			}
		}
		System.out.println();
		
		
		
	}
}
