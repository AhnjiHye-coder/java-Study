package accessModifier;

// getter/setter
// getter : 필드의 값을 반환하여 외부에서 참조할 수 있도록 처리하는 메서드
// 즉, get이 속해있는 클래스의 필드 값을 다른 클래스에서 출력할 수 있는 메서드
// 따라서, get이 없다면 서로 다른 클래스에서 필드 값을 가져올 수 없다

// setter : 외부에서 매개변수에 값을 전달 받아서 내부 멤버 필드에 값을 대입하는 메서드
// 즉, 다른 클래스에서 set함수를 호출하여 값을 넣을 수 있고 따라서 변경할 수 있음
// 단, 값을 변경하고 싶은 클래스에 접근제한자는 걸려있지만  set이 없다면
// 다른 클래스에서 값 변경이 불가능 하다

// set으로 set이 해당하고 있는 클래스에 값을 바꾸고 get으로 그 값을 꺼내온다
// get+set 필드 이름과 조합하여 메소드 이름을 짓는다(변수이름앞에 get,set을 붙여주면 된다)

// ※필드 자료형이 boolean 이라면 get은 is를 사용해 주어야 한다
// 또는  is,can,has 등으로도 바뀔 수 있다

class Test4 {
	private int num;
	private String str;
	private boolean over;
	
	// private 필드 작성 후 이후 클래스 내부에서 오른쪽 클릭
	// source - generate getters and setters
	// 원하는 필드를 선택, 접근제한자는 pulic, 이후 generate
	
	public int getNum() { // 속해있는  클래스의 필드가 ()에 들어가고
		return num;		   // 그 값을 반환한다(다른 클래스로 갈 수 있도록 한다)
	}
	
	public void setNum(int num) { // 만약 다른 클래스에서 set이 해당하는 클래스의
		this.num = num;			  // num을 바꾸고 싶다면 옆에있는 메소드가 호출된다
	}
	
	public String getStr() {
		return str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	// boolean은 get이 아닌 is로 입력
	public boolean isOver() { 
		return over;
	}
	
	// set은 그냥 set이다
	public void setOver(boolean over) { 
		this.over = over;
	}	
}


public class Ex03 {
	public static void main(String[] args) {
		Test4 ob = new Test4();
		
		// 접근제한자가 없을때는 main이나 다른 클래스에서 객체를 만들었을때
		// 객체 (이름.필드 = 값)을 하면 된다
		// 하지만 제한자가 있는 클래스를 다른 클래스에서 사용할때는
		// 객체이름.(사용할 클래스의 set,get메소드(함수)를 불러와야한다
		// 그리고 형식대로 매개변수가 있는 메소드면 값을 넣어주고
		// 없다면 그냥 호출한다
		
		ob.setStr("Hello");
		ob.setNum(12345);
		ob.setOver(false);
		
		System.out.println("ob.str : " + ob.getStr());
		System.out.println("ob.num : " + ob.getNum());
		System.out.println("ob.over : " + ob.isOver());
		
		
	}
}
