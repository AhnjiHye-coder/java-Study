package wrapperClass;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		
		
		//primitive type
		// boolean, byte, char, short, int, long, float, double
		
		// Wrapper Class : 원시 자료형의 값을 객체 형태로 저장하기 위해 사용하는 클래스
		// Boolean, Byte, Character, Short, Integer, Long, Float, Double
		
		byte by1 = 10;	// 비 객체형 (옛날객체스타일 - c언어)
		Byte by2 = 20;
		
		System.out.println("by1 : " + by1);
		System.out.println("By2 : " + by2);
		// 기본 자료형 /Wrapper Class 모두 값을 저장하는데 이용할 수 있다
		// Wrapper Class는 값에 대한[기능], 지료형의 대한 [기능]이 내장되어 있다
		// 이클립스를 사용하는 이유는 여러 함수나, 자료형을 자동완성 해주기 때문에 메모장이 아닌 이클립스를 사용한다
//		by2.
		
		// 자바의 객체 지향 언어 특성을 제대로 활용하기 위해서 사용해야 할 경우가 있다
		
		
		// 1) 기초를 다질때 > 여러 정수가 포함된 배열에서 짝수만 골라내서 새로 담아서 출력하기
		int[] arr = {7, 5, 4, 2, 8, 1, 9, 5};
		int[] arr2 = new int[3];
		
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				arr2[index++] = arr[i];
			}
		}
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println();
		
		
		// 2) 익숙해졌을때 > 객체 지향 특성을 활용하여 간단하게 처리하기
		// Syntax error, insert "Dimensions" to complete ReferenceType
		
		Integer[] arr3 = {7, 5, 4, 2, 8, 1, 9, 5};
		
		// 어떤 형식의 객체를 만들 것인지(Integer 자료형의 배열 변수 list에 Integer 형식의 배열 공간을 대상으로 하나의 객체를 만든다
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr3)); 
		
		System.out.println("list : " + list);  // 여기서 출력은 안해도 무방하다
		
		list.removeIf(num -> num % 2 != 0); // 만약 홀수이면 리스트에서 제거한다
		
		System.out.println("list : " + list);
		
		// 변수나 값이 아닌 Wrapper Class 자체에 내장된 기능을 활용하는 경우
		String s1 = "1234";
		
//		int num = (int)s1;		// 강제 형변환도 자료형간의 호환성이 바탕이 되어야 한다 (문자열이 숫자가 될 수는 없다 -> 마법이 아니기 때문에)
		// 위 방법인 문자열을 정수로 바꾸는 방법
		
		// 인티져라는 클래스에 정수형태로 변환해주는 과정/기능 (parseInt)안에 들어있다
		int num = Integer.parseInt(s1);	// 문자열의 내용을 정수로 변환하는 과정
		System.out.println(s1 + 1);		// 문자야 + 숫자, 모양을 합친다
		System.out.println(num + 1);	// 숫자 +  숫자, 값을 합친다
		
		// primitive type의 타입을 반복문이 아니더라도 반복을 할 수 있게 함수를 사용해서 더 많은 기능을 사용할 수 있는 방법이 Wrapper을 사용하는 것이다
		// ex) int라는 자료형에 더 많은 기능을 넣고 사용하고 싶다면 Integer로 Wrapper을 사용해 주는 것이다
		// primitive type을  Wrapper이 감싸안고 더 많은 기능을 수행하도록 도와주기 위해 만들어졌다
		
		
		
		
		
		
	}
}
