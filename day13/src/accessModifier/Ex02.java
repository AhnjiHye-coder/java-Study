package accessModifier;

class Test2{	// 접근제한자를 적용하지 않은 클래스
	String name;
	int age;
}

class Test3{ // 접근제한자 적용 클래스
	private String name;
	private int age;
	
	// main이나 다른 클래스에서 현재 속해있는 메소드의 필드를
	// 사용하고 싶다면 set함수를 호출하여 사용가능 
	// 또, 외부 클레스에서 넘어온 값을 저장하는 매개변수로,
	// 매개변수의 값을 맴버필드에 저장할 수 있는 역할을 한다
	public void setName(String name) {
		this.name = name;
	}
	
	// 위와 마찬가지로 다른 클래스에서 내 클래스에 age을 호출하여
	// 사용할 수 있도록 만들어 놓음
	public void setAge(int age) {
		this.age = age;
	}
	
	// get메소드는 현재 클래스에 필드가 private거나 그 이상이여도
	// 자유롭게 접근이 가능하며, 필드에 담긴 값을 복사하여 반환한다
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

}

public class Ex02 {
	public static void main(String[] args) {
		
		// 접근제한자가 없을때는 main에서 클래스의 리모컨의 역할로
		// 사용하고 싶은 클래스 자료형의 변수를 만들어주고 .을 이용해서
		// 내부 속성,기능을 사용하면 된다
		Test2 ob1 = new Test2();
		ob1.name = "이지은";
		ob1.age = 31;
		System.out.println("이름 : " + ob1.name +"\n"+ "나이 : " + ob1.age + "살");
		System.out.println();
		
		// 이번에는 접근제한자가 있는 경우이다
		// 접근제한자가 있기 때문에 필드를 직접 불러오지 않고
		// 사용하고자 하는 클래스에서 사용할 수 있게 만들어놓은
		// set,get를 사용해서 값을 대입하고 출력할 수 있다
		// 함수가 없다면 사용 불가능 하다
		// 접근제한자가 있을 경우 사용할때 예의를 갖춰야 한다고 생각하자
		// 사용할 수 있는 메소드가 있는지 확인하며 접근해보자
		Test3 ob2 = new Test3();
		ob2.setName("짱구");
		ob2.setAge(5);
		ob2.getName();
		ob2.getAge();
		System.out.println("이름 : " + ob2.getName() +"\n"+ "나이 : " + ob2.getAge() + "살");
		
		// 클래스가 다를때 사용
		// getter은 변수를 반환하기 때문에
		// get이 해당되어있는 클래스에 필드를 main이나 다른
		// 클래스에서 출력할 수 있다
		// 하지만 반대로 get이 없다면 꺼내볼 수 없고, 꺼내올 수 없다
		
		// setter은 다른 클래스에서 set이 속해있는
		// 클래스의 필드를 다른 값으로 치환하고 싶을때 사용한다
		// set메소드가 클래스에 없다면 그 클래스의 필드값은
		// 다른 클래스에서 변경할 수 없는 것이다
		
		
		
		
		
	}
}
















