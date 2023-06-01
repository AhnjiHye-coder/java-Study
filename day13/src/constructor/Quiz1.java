package constructor;


class Circle{ // 원의 넓이 : 반지름 * 반지름 * 3.14;
	
	private double c1;
	private double pi = 3.14;
	private double size;
	
	
	Circle(){
		this(1.0); // double 생성자로 유도
	}
	
	Circle(int c1){ // 정수가 들어오면 double로 바꿔서 double생성자로 유도
		this((double)c1);
	}
	
	Circle(double c1){
		this.c1 = c1;  // 들어온 매개변수를 클래스 필드에 초기화해주고
		// 초기화된 값을 연산하여 size에 넣는다
		size = c1 * c1 * pi;
	}
	
	public double getsize() {
		return size;
	}
	public double getc1() {
		return c1;
	}
}
public class Quiz1 {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(3);
		Circle c3 = new Circle(2.4);
		
		System.out.printf("c1 : %.2f\n", c1.getsize());
		System.out.printf("c2 : %.2f\n", c2.getsize());
		System.out.printf("c3 : %.2f\n", c3.getsize());
		System.out.println();
		
		
		
	}
}
