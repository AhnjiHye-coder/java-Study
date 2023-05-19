package operator;

public class Ex08 {
	public static void main(String[] args) {
		
		// 비교 연산 : >, <, >=, <=, ==, !=
		// 초과,미만,이상,이하,일치,불일치
		// 두 값을 비교하여 결과를 boolean 형식(true/false)로 만들어낸다
		
		int n1 = 10;
		int n2 = 3;
		
		System.out.println("n1 > n2  : " + (n1 > n2));
		System.out.println("n1 < n2  : " + (n1 < n2));
		System.out.println("n1 >= n2 : " + (n1 >= n2));
		System.out.println("n1 <= n2 : " + (n1 <= n2));
		System.out.println("n1 == n2 : " + (n1 == n2));	// 일치(등호)
		System.out.println("n1 != n2 : " + (n1 != n2));
		System.out.println();
		
		// 변수활용 이유 : 나중에 재활용 하려고 사용함 
		// 변수에 저장해두었다가 나중에활용 할 수 있다
		// 별도의 자료형이 존재한다
		// 비교 연산자는 숫자를 비교할때만 사용한다
		boolean b1 = n1 > n2;	
		boolean b2 = n1 < n2;	
		boolean b3 = n1 >= n2;	
		boolean b4 = n1 <= n2;	
		boolean b5 = n1 == n2;
		boolean b6 = n1 != n2;
		
		// 비교연산에서 주의할 점!!
		// 문자열은 ==로 일치여부를 판별하지 않는다
		// 이유 : new를 사용할시에는 다른 문자로 인식하기 때문이다
		String s1 = "apple";
		String s2 = "apple";
		String s3 = new String("apple");
		
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println();
		
		// 리터럴(s1, s2)은 같은 값이 들어오면 동일한 것을 가리키게 된다
		// 하지만 new를 사용하게 되면(s3) 기존에 있는 것(s1, s2가 가리키고 있는 곳)을 가리키지 않고
		// 새로운 것을 만들어서 가리키라는 의미이다
		
		// 비교할때는 equals를 사용한다
		// 대상이 서로 달라도 문자열의 내용은 일치한다
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s2.equals(s3) : " + s2.equals(s3));
		System.out.println("s1.equals(s3) : " + s1.equals(s3));
		System.out.println();
		
		// 자료형의 첫 글자가 대문자라면, 일치여부를  == 연산자로 비교하지 않고, eqauls()를 이용한다
		// 패스워드 비교할때, 명령어일치할때 등 사용하게 된다
		
	}
}









