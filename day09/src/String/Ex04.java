package String;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		
		String search = "아이유 팔레트 가사";
		
		// replace(리플레이스)는 앞 문자를 뒤문자로 바꾸라는 의미
		search = search.replace(" ", "+");
		
		String url = "https://search.naver.com/search.naver?query=" + search;
//		System.out.println(url); // 링크 + 아이유+팔레트+가사
		
		URL requestURL = new URL(url);
		URLConnection conn = requestURL.openConnection();
		Scanner sc = new Scanner(conn.getInputStream());
		String data = "";
		
		while(sc.hasNextLine()) {
			data += sc.nextLine() + "\n";
		}
		
		// 문자열 함수를 이용하여 내가 원하는 부분만 남기기
		// "<div class=\"intro_box\">"까지 자르고(substring) 문자개수 반환(indexOf)
		data = data.substring(data.indexOf("<div class=\"intro_box\">"));
		
		// 처음부터 "</div>"까지 자르고 자른 문자개수 반환
		data = data.substring(0, data.indexOf("</div>"));
		
		// 먼저있는 문자를 다음에 있는 문자료 치환해라
		data = data.replace("<br/>", "\n");
		data = data.replace("<br/>", "\n");
		data = data.replace("\n ","\n");
		data = data.replace("</p>", "");
		data = data.substring(data.lastIndexOf(">") + 1);
		data = data.replaceFirst(" ", "");
		
		System.out.println(data); 
		System.out.println(data.length()); // 글자 개수출력
		
		sc.close();
		
		
		
		
	}
}
