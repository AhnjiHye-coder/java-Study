package oop;

class Human{
	// 멤버필드 : 객체가 가지는 내부 변수
	// 사람이름(문자열)과 나이(정수), 키,체중(실수)를 변수로 선언하세요
	String name;
	int age;
	double height;
	double weight;
	
	// 멤버 메서드 : 객체가 호출할 수 있는 내부 함수
	// 1) 문자열, 정수, 실수, 실수를 전달 받아서 멤버필드에 저장하는 함수
	void setData(String n, int m, double k, double l) {
		this.name = n;
		this.age = m;
		this.height = k;
		this.weight = l;
	}
	
	// 2) 멤버필드에 저장된 값을 한줄씩 출력하고 마지막에 한줄 띄우는 함수
	void show() {
		System.out.printf("이름 : %s\n"
				+ "나이 : %d\n"
				+ "키 : %.1f\n"
				+ "체중 : %.1f\n"
				, name,age,height, weight);
	}
	
	// 3) 객체를 생성하면서 값을 할당하는 생성자를 작성한다
	// 생성자는 클래스의 이름과 같으며 반환형을 지정하지 않는 특수한 함수
	// 생성자는 작성하지 않으면 컴파일시에 기본 생성자를 자동으로 만들어준다
	// 생성자를 작성했다면 자동으로 생성자를 만들어주지 않는다
	// 생성자는 클래스와 이름을 맞춰야 한다
	Human(String name, int age, double heigth, double weight){
		// 지역변수와 멤버필드의 이름이 같으면 this를 이용하여 구분할 수 있다
		// this는 클래스에 의해 성성된 객체 자신을 가리키는 변수이다
		this.name = name;
		this.age = age;
		this.height = heigth;
		this.weight = weight;
	}
	
	// 4) 직접 생성자를 작성했다면 기본 생성자가 자동으로 작동되지 않기 때문에
	Human(){
	}
	
}
public class Ex05 {
	public static void main(String[] args) {
		// 서로 다른 Human 객체 3개 생성하고, 각각 다른 값을 넣어주세요
		// 배열로 묶어서 구성하세요
		// 반복문을 이용하여 여러명의 데이터를 출력하세요
		
		// 자바는 객체지향프로그래밍 언어로써 객체를 만들기 위해 생성자가 필요하다
		// 그렇기 떄문에 생성자를 만들지 않아도 기본적으로 생성자를 만들어준다
		// 하지만 내가 클래스에서 생성자를 만다면 자바는 기본적으로 만들어주는 생성자를
		// 만들지 않는다
		
		
		// 기본적으로 생성자에 값을 넣는데 만약 생성자에서 값을 직접적으로 바꾸면
		// main에서 가리키고 있는 객케를 그래도 가리키면서 내부 값만 바뀌는 것이고
		// 함수를 불러서 값을 치환한다면 main에서 원래 가리키던 객체 공간이 아닌
		// 바뀐 공간을 가리키게 된다
		
		// 먼저 생성하고
		Human h1 = new Human();
		
		// 생성된 객체에 값을 넣는다
		h1.setData("짱구", 4, 105.9, 20);
		h1.show();

		// 예시
		Human h2 = new Human();
		h2.name = "짱구";		// 먼저 생성하고
		h2.age = 5;			// 생성된 객체에 값을 넣는다
		h2.height = 105.9;	// 맞는 값을 순서대로 대입한다
		h2.weight = 20;

		Human h3 = new Human();			// 객체 생성하고
		h3.setData("철수", 5, 105.2, 35);	// 한번에 4개의 값을 세팅한다
		
		
		// 객체 생성과 동시에 값을 저장한다
		Human h4 = new Human("나단비", 5, 105.2, 35);
		
		// 배열로 묶어서 구성하세요
		Human[] arr = {h2,h3,h4};
		
		// 반복문을 이용하여 여러명의 데이터를 출력하세요
		for(int i = 0; i < arr.length; i++) {
		// 여러 Human 객체가 줄지어 있는 배열에 대하여
		// i번째 Human 객체의 show()함수를 호출하면 내부 값이 출력된다
		arr[i].show();
			
					
		}
		
	}
}
