package function;

public class Ex05 {
	public static void main(String[] args) {
		// 메인함수에서 실행되는 코드를 함수로 만들어보기
		// 정수를 거꾸로 배치하여 반환하는 코드
		
		int num = 1234;
		
		int tmp = 0;
		
		while(num != 0) {
			tmp *= 10;     // tmp에 10을 곱하면서 처음엔 40 ->430->4320->4321이 된다
			// num의 마지막 수를 tmp에 더하기 때문에 더해도 숫자가 변동없이 거꾸로 치환된 것 처럼 보여지기 위해
			// 10을 곱하여 다음에 들어올 값의 자리를 마련한다
			tmp += num % 10;	
			num /= 10;
		}
		System.out.println("tmp : " + tmp);
		
		System.out.println("getNumber : " + getNumber(369258147));
		
	
	}
	
	static int getNumber(int num) {
		// 요인이 되는 값은 인자라고 하며, 메소드(함수)에서는 매개변수로 선언해준다
		// 코드 작성 내용은 위 내용을 복붙한 것처럼 동일하다, 그만큼 메인 함수와 동일
		int tmp = 0;
		
		while(num != 0) {
			tmp *= 10;
			tmp = num % 10;
			num /= 10;
		}
		return tmp;		// return값이 있는 메소드가 끝날때는  반드시 반환해준다
	}
}














