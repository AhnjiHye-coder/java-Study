package tv;

public class Main {
	public static void main(String[] args) {
		// 객체 생성
		TV tv = new TV();
		
		// 생성된 TV 객체의 기능 테스트
		tv.volume = 50;
		tv.Volume();
		System.out.println();
		
		tv.channel = 25;		
		tv.power = false;
		tv.channeldown();
		tv.channeldown();
		tv.channeldown();
		System.out.println();
		
		tv.turn();
		System.out.println();
		
		tv.turn();
		System.out.println();
		
		tv.channeldown();
		System.out.println();
		tv.silence();
		tv.silence = true;
		tv.silence();
		System.out.println();
		
		tv.channel = 9;		
		tv.channelup();
		tv.channelup();
	}
}
