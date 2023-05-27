package loop;

public class Ex07 {
	public static void main(String[] args) {
		// 배열
		// 1) 같은 자료형의 여러 변수를 연속된 메모리 공간에 배치한 형식
		// 같은 자료형의 여러값을 index로 구분하여 저장한 자료구조
		// 2) 배열의 길이는 선언 이후 변경할 수 없다
		
		int n1 = 12, n2 = 23, n3 = 42;
		int[] arr = {n1, n2, n3};
		
		for(int i = 0; i< 3; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		
		// 자바의 배열은 길이를 내장하고 있다
		for(int i = 0; i < arr.length; i++) {
			int num = arr[i];
			System.out.println(num + " ");
		}
		System.out.println();
		
		// index를 활용하지 않는 형태의 for문도 사용가능
		// iterable한 자료형의 데이터에 대해서만 사용가능
		// setter 또한 향상된 for문으로 취급하고 사용가능
		// 순서대로 반복가능하다(순회하다)
		
		// 배열안에 있는 각가의 데이터를 출력해라
		for(int num : arr) {
			System.out.println(num + " ");
		}
		System.out.println();
		
		// 데이터의 자료형이 달라지면서 배열도 다르게 구성하면 된다
		// 같은 자료형의 값이 여러개이면 배열로 구성하면 된다
		
		String[] arr2 = {"Hello", "apple", "python", "c"};
		
		for(int i = 0; i < arr2.length; i++) {
			String s = arr2[i];
			System.out.println(s);
		}
		System.out.println();
		
		// 반복문을 사용하지 않더라도, 원하는 데이터의 위치(index)를 알고 있다면
		// 곧바로 접근하여 출력 및 연산 할 수 있다
		
		System.out.println(arr2[1]);
		
		// 인덱스 : 찾고 싶은 데이터를 빠르게 찾기 위해서 사용
		
		
		
		
	}
}
