package tv;

// 필드와 메서드
// 필요하다면 생성자를 활용하여
// TV객체의 구성을 클래스로 나타냅니다

// 속성(명사형)은 필드
// 기능(동사형)은 메서드로 나타냅니다

public class TV {
	// 필드
	// 전원
	boolean power; // 초기값 false
	// 볼륨
	int volume;
	// 채널
	int channel;
	// 음소거
	boolean silence;	// 초기값 false
	
	String talk = "";
	
	
//	void powerData(boolean power) {
//		this.power = power;
//		
//	}
//	
//	void volumeData(int volume) {
//		this.volume = volume;
//		
//	}
//	
//	void channelData(int channel) {
//		this.channel = channel;
//	
//	}
//	
//	void setData(boolean silence ) {
//		this.silence = silence;
//	}
//	
	// 생성자
	TV (boolean power,int volume ,int channel ,boolean silence,String talk ) {
		this.power = power;
		this.volume = volume;
		this.channel = channel;
		this.silence = silence;
		this.talk = talk;
	}
	
	TV(){
		
	}
	
	// 메서드
	// 전원
	void turn() {
		power = !power; // IF에 같이 조건을 넣어주면 최기화랑 대입을 동시에 하게 된다 
		if(power) {
			System.out.println("TV ON");
		}
		else {
			System.out.println("TV OFF");
		}
	}
	
	// 볼륨
	void Volume() {		
		if(volume > 100) {
			System.out.println("※경고※ 최대볼륨 입니다");
		}
		else if(volume < 0) {
			silence = !silence;
			System.out.println("※경고※ 최소 볼륨으로 \"음소거 됩니다\"");
			System.out.println("현재 볼륨상태 : " + silence);
		}
		else {
			System.out.println("현재 볼륨 : " + volume);
		}
	}
	
	// 음소거
	void silence() {
		if(silence = !silence) {
			System.out.println("음소거 ON\n상태 : " + silence);
		}
		else {
			System.out.println("음소거 OFF\n볼륨 : " + volume);
		}
	}
	
	//채널
	// 99번에서 더 돌리면 1로 돌아가게 해야 한다
	void channelup() {
		channel++;
		if(power = true) { // 티비가 켜졌다면 실행
			if(channel >= 100) {
				channel = 1;
				channel++;
				System.out.println("현재 채널 - " + channel + "번");
			}
			else {
				System.out.println("현재 채널 - " + channel + "번");
			}
		}
		else {
			System.out.println("TV가 꺼져있는 상태입니다");
		}
	}
	
	void channeldown() {
		channel--;
		if(power = true) {
			if(channel <= 0) {
				channel = 99;
				channel--;
				System.out.println("현재 채널 - " + channel + "번");
			}
			else {
				System.out.println("현재 채널 - " + channel + "번");
			}
			
		}
		else {
			System.out.println("TV가 꺼져있는 상태입니다");
		}
	}
	
	// 말하기 기능
	void talkplane() {
		if(talk == null) {
			System.out.println("입력해주세요");
		}
		else {
			System.out.println(talk +"라고 입력되었습니다");
		}
	}

	// 리모컨에서 숫자로 입력한 채널을 처리하는 함수
	public void setChannel(int channel) {
		if(channel < 0 || 200 < channel) {
			return; // 즉시 함수를 종료한다
		}
		this.channel = channel;
		
	}
	
}
