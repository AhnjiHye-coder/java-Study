package tv;

public class Main {
	public static void main(String[] args) {
		TV tv = new TV();
		RemoteController remocon = new RemoteController();
		
		// 리모컨의 메서드를 호출하면,TV의 기능을 작동하도록 코드를 작성하여
		// 아래에서 테스트하세요
		
		remocon.setTV(tv);
		remocon.turn();
		
		remocon.channeldown();
		remocon.channelup();
		remocon.Volume();
		remocon.channeldown();
		remocon.channelup();
		
		
		// 문자 메세지를 만들어라
		// 글자만 전송되는 메세지이고
		// 보낸사람, 받은 사람 표시해야 하고
		// 답장을 보낼 수도 있어야 한다
		// A폰에서 보내는 버튼, 받는 버튼
		// B폰에서 보내는 버튼, 받는 버튼
		// a가 b한테 전달했다, b가 a한테 전달했다
		
		// void send보낸다(phone other, String msg){
		//other.receleve받는다(this, String msg)
		
		// this. : 자신에 가지고 있는 맴베 필드나 메서드에 접근하고 싶을때 (필드, 메서드)
		// this() : 생성자를 가리키는데 내 생성자 안에서 또 다른 생성자를 꺼내고 싶을때 사용(생성자 호출)
		// this : 자기자신을 의미 (객체 자신)
		// 내가 보낸다는 걸 어떻게 표현하지? 한다면 this만 사용하면 된다
		
	}
}
