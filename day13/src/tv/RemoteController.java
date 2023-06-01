package tv;

public class RemoteController {
	TV tv;	// TV객체를 참조할 수 있는 참조변수
	
	// 먼저 tv클래스 리모컨 클래스에 불러와서 연결하기
	public void setTV(TV tv) {
		this.tv = tv;
	}
	
	// 메소드 이름은 아무렇게나 해도 되고 리모컨에서 따로 만들 필요 없이
	// 사용하고 싶은 클래스 또는 연결하고 싶은 클래스에 .만 붙이면 그 클래서 안에있는
	// 클래스를 사용할 수 있다(이것을 참조라고 한다)
	// 즉, 참조한다는 것은 그 클래스에 있는 것을 사용하고 싶다,연결하고 싶다 등 의미이다
	
	void turn() {tv.turn();}
	void Volume() {tv.Volume();}
	void silence() {tv.silence();}
	void channelup() {tv.channelup();}
	void channeldown() {tv.channeldown();}
	void talkplane() {tv.talkplane();}
	
	void setChannel(int channel) {
		tv.channel = channel;
	}
}
