package wrapperClass;

public class Ex02 {
	public static void main(String[] args) {
		// Wrapper Class와 primitive type사이의 값 대입
		
		//Float과 long은 대표자료형이 아니므로, F혹은 L을 값 뒤에 붙여준다
		float fl = 1.2F; 
		double db = 0;
		
		db = fl;	// primitive type 끼리는 호환되므로, 대입이 가능하다
					// 왼쪽 변수의 자료형이 더 크기 때문에 값의 손실이 없어서 암묵적 형변환이 발생한다
		
		System.out.println("fl : " + fl + ", db : " + db); // double이 더 큰 자료형이기 때문에 출력했을때 fl 값 외에 다른 값이 붙는다
		System.out.println();
		
		Float fl2 = 1.2F;
		Double db2 = 0.0; // int 0을 바로 담을 수 없어서, 실수 형태로 나타내야 한다
		
//		db2 = fl2;	// Wrapper Class 끼리는 같은 실수라도, 서로 호환되지 않는다
					// Wrapper Class는 자신과 같은 타입의 primitive만 호환된다
		
//		db2 = (Double)fl2; 	// 강제 형변환을 시도해도, 호환되지 않으므로 처리할 수 없다
		
		// 이런 경우 어떻게 해결하는가?
		// 1) 서로 호환되는 primitive 타입을 이용하여 강제 형변환으로 대입하기
		// 중간과정을 순서대로 타고 가면 바꿀 수 있다
		// 즉, Float -> float -> double -> Double (double은 pimitive에서 Wrapper로 넘어갈 수 있다)
		// Float에서 Double로 바로 갈 순 없지만 위 경로처럼 primitive를 타고 갈 수는 있다
		db2 = (double)(float)fl2;
		
		// 2) Wrapper Class에서 제공하는 기능인 valueOf(함수)을 활용한다
		db2 = Double.valueOf(fl2);
		
		System.out.println("fl2 : " + fl2 + ", db2 : " + db2);
		System.out.println();

		
	}
}
