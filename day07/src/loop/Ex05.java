package loop;

public class Ex05 {
	public static void main(String[] args) {
		// 다음 모양을 출력하세요
		
		// ====*====*====*====*====
		
		String s1 = "";
		String s2 = "";
		
		// 25줄 생성 4번째일때 *추가 아닐때는 =
		for(int i = 1; i < 25; i++) { 
			if(i % 5 == 0) {
				s1 += "*";
			}
			else {
				s1 += "=";
			}
		}
		System.out.println(s1);
		
		// 2번째 방법
		for(int i = 0; i < 5; i++) {
			s2 += "====";
			if(i != 4) {
				s2 += "*";
			}
		}
		System.out.println(s2);
	}
}
