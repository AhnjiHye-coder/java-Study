package output;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 클래스 자료형이  import되지 않아서 빨간줄이 생겼다면
		// 클래스 가장 오른쪽에 커서를 두고 자동완성(ctrl + space)
		Scanner sc = new Scanner(System.in);
		
		// 이름(문자열), 나이(정수), 키(실수), 몸무게(실수)로 입력받는다
		// 입력 받은 값에서 체질량지수를 구한다(BMI)
		// BMI :  몸무게를 키의 ^2으로 나눈 값이다
		// 키 * 키 = 키^2이다
		// ~ 18.5         저체중
		// 18.5 ~ 23  정상
		// 23 ~ 25      과체중
		// 25 ~      비만
		
		// 이름과 나이, bmi지수를 화면에 출력합니다
		// 단, BMI지수는 소수점 이하 둘째자리까지 출력하면 됩니다
		
		String name;
		int age;
		double cm, kg;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("이름 : ");
		cm = sc.nextDouble();
		
		System.out.print("이름 : ");
		kg = sc.nextDouble();
		
		cm /= 100;
		double bmi = kg / (cm * cm);
		String total;
		
		if(bmi < 18.5) {
			total = "저체중";
		}
		else if(bmi > 18.5 && bmi <= 23) {
			total = "정상";
		}
		else if(bmi > 23 && bmi <= 25) {
			total = "과체중";
		}
		else {
			total = "비만";
		}
		System.out.printf("이름 : %s\n"
				+ "나이: %d\n"
				+ "키,몸무게 : %.1f, %.1f\n"
				+ "bmi: %.1f\n"
				+ "체질량지수 : %s\n"
				, name, age, cm, kg, bmi, total);
		
		// 1) 선생님 코드
		// 코드에서 사용할 수 있는 변수를 상단에 한번 선언한다
		// 초기값을 저장할 수 있다면 , 초기화 한다
		String name1;
		int age1;
		double weight, height, bmi1 = 0;
		
		// 2) 값이 할당되지 않은 변수 중에서 입력받아야 하는 값을 입력받는다
		System.out.print("이름 : ");
		name1 = sc.nextLine();
				
		System.out.print("나이 : ");
		age1 = sc.nextInt();
				
		System.out.print("키 : ");
		height = sc.nextDouble();
				
		System.out.print("몸무게 : ");
		weight = sc.nextDouble();
		
		// 3) 입력받은 값을 기반으로 연산을 수행하여 변수의 값을 채워넣는다
		// 연산시 단위 변환에 유의하면서 진행하기
		
		height /= 100;
		bmi = weight / (height * height);
		
		// 4) 모든 값이 준비되면 출력한다(필요하다면 서식을 활용)
		
		System.out.println();
		System.out.printf("이름 : %s\n", name1);
		System.out.printf("나이 : %d\n", age1);
		System.out.printf("BMI : %.2f\n", bmi1);
		
		// 5) 결과 처리 이후 마무리 코드를 수행하고 종료한다
		
		sc.close();
		
	}
}


























