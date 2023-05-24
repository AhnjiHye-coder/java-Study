package output;

public class Ex05 {
	public static void main(String[] args) {
		
		// 메모리의 데이터를 화면에 출력하는 함수
		System.out.print("A");		// 출력 후 줄을 바꾸지 않는다
		System.out.println("B");	// 출력 후 한 줄을 내린다	
		System.out.printf("C");		// 줄을 바꾸지 않고, 서식에 따른 출력을 할 수 있다
		System.out.println();
		
		// print,println는 하나의 값만 출력할 수  있다
		System.out.println("2 + 3 = " + (2+3));
		
		// printf()는 첫번쨰 항목에 문자열 서식을 지정한 후, 이후 여러 값을
		// 순서대로 저장한다
		// 여기서 printf의 'f'는 포멧, 서식, 형식이라는 의미이다
		// 포멧이랑 관련 된 것은 Disk Format, printf, print(".format(a));, <form>, </form>
		System.out.printf("%s의 나이는 %d살 입니다\n", "이지은", 31);
		
		// 포멧의 의미
		// 포멧은 익히 값을 초기화 한다는 의미로 알고 있다
		// 하지만 값을 초기화 한다는 의미보다는 그 공간을 갈아엎는다는 의미와 가깝다
		// 예를 들어 감자 밭으로 사용하다가 사과농장으로 사용하려면 기존에 있던
		// 감자들은 수확하지 않으면 사용하지 못하고 잃게 되는 것이다
		// 포멧의 구조가 이와 같다
		// 포멧은 디스크의 파일을 재설정하는 것이다
		// 이때 재설정 하기 떄문에 이전에 파일과 정보들이 지워지는 것이고
		// 결과적으로는 이전에 파일을 사용하지 못하게 되는 것이다
		// 이런 포멧의  기능이 printf에 의미를 둔 것은 printf같은 경우
		// ""안에 형식을 미리 정해두고 이후 값들을 재설정하기 때문이다
		// + 포멧은 어떤 용도인지에 따라 방식이 다르다
		
		// String.format()는 서식에 맞춰서 문자열을 생성하고
		// printf는 서식에 맞춰서 데이터를 출력한다
		
		String data = String.format("%s의 나이는 %d살 입니다\n", "이지은", 31);
		System.out.println("data : " + data);	
		
	}
}







