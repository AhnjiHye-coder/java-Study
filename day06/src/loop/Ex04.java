package loop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		// 어떤 파일을 저장하냐에 따라서 문서 내용의 줄 수(반복 횟수)가 서로 달라진다
		
		String fileName = "src/loop/Ex01.java";
		File f = new File(fileName);
//		System.out.println(f.getAbsolutePath());
		Scanner sc = new Scanner(f);
		int cnt = 0;
		
		while(sc.hasNextLine()) {	// 다음줄을 확인하여 다음 줄이 있으면 true
			cnt++;
			String line = sc.nextLine();
			System.out.printf("%5d : %s\n", cnt, line);
			
		}
		
		//다음 줄이 없으면 반복 자체를 실행하지 않고 바로 sc.close를 실행하여 종료
		sc.close();
		
	}
}
