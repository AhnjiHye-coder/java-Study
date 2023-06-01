package reference;

class Ball{}		// 아무 내용도 없는 클래스

class kid{
	
	// 필드
	private Ball ball = null;
	private String name = null;
	
	// alt + shift + s : get,set
	// alt + shift + o : 생성자
	
	// 생성자 
	// 싱글톤 : 하나의 생성자만 만들 수 있는 것 
	public kid(String name) {
		this.name = name;
	}
	
	// 메서드
	public void setBall(Ball ball) {
		this.ball = ball;
	}
	
	public Ball getBall() {
		return ball;
	}
	
	public String getName() {
		return name;
	}
	
	public void throwBall(kid other) {
		// this인 내가 other에게 setball을 호출하면
		other.setBall(this.ball);
		// set을 호출했을때 other에게 넘어가면서 나한텐 Ball이 없게 된다는 의미
		ball = null;
		System.out.printf("%s가 %s에게 공을 던졌다\n", this.name, other.name);
	}
	
	public boolean hasBall() { // 볼을 가지고 있는지 판별
		return ball != null;
	}
	
}

public class Ex05 {
	public static void main(String[] args) {
		
		
		
		kid ob1 = new kid("도기");
		kid ob2 = new kid("지훈");
		Ball ball = new Ball();
		
		ob1.setBall(ball);
		System.out.println(ob1.getName() + "가 공을 가지고 있는가  :" + ob1.hasBall());
		System.out.println(ob1.getName() + "가 공을 가지고 있는가  :" + ob1.hasBall());
		System.out.println();
		
		ob1.throwBall(ob2);
		System.out.println(ob1.getName() + "가 공을 가지고 있는가  :" + ob1.hasBall());
		System.out.println(ob1.getName() + "가 공을 가지고 있는가  :" + ob1.hasBall());
		System.out.println();
		
		ob2.throwBall(ob1);
		System.out.println(ob1.getName() + "가 공을 가지고 있는가  :" + ob1.hasBall());
		System.out.println(ob1.getName() + "가 공을 가지고 있는가  :" + ob1.hasBall());
		System.out.println();
	}
}
