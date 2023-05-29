package function;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 3대의 엘리베이터가 있다
		// 사용자에게 현재 층수를 입력 받아서 가장 가까운 엘리베이터가 움직이도록 출력하세요
		// 처음부터 순서대로, 엘리베이터의 이름을 A,B,C라고 하면
		// %s엘리베이터가 이동합니다 라고 출력해야 합니다
		// Ex04에서 작성했던 함수를 참조하여, 활용하면 좋습니다
		// 가장 가까운 엘리베이터가 움직여야 하고, 절대값처리해야 한다
		// 두 수의 차이를 구해서 절대값 해결
		
		// 엘베에 랜덤값 넣어주기(for문)
		// 
		
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int[] arr = new int[3];		// 길이가 3인 배열 arr이름으로 생성
		
		// 길이가 3인 배열에 반복문으로 랜덤수를 넣는다
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(15) + 1; 
		}
		System.out.println(Arrays.toString(arr));
		
		int curr;	// 내 층수
		
		System.out.print("층 입력 : ");
		curr = sc.nextInt();
		// 절대값 함수로 구현 getAbsolyte
		int min = 14; 	// 나랑 가장 가까운 min의 반복번째가 index에 담긴다
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			// 내 층수랑 랜덤으로 들어가는 엘베랑 거리값을 diff에 담는다
			// 그럼 그 거리를 비교하여 나랑 가까운 엘리베이터를 호출하면 된다
			int diff = getAbsolyte(arr[i] - curr);
			// 나랑 거리가 가장 가까운 엘베를 찾기 위해
			// 엘베와 나 사이의 거리를 index에 넣어준다
			
			// 만약, for문의 i인 0번째 A(첫 실행이니까 i는 0)가 min에 들어갔는데
			// 다음으로 b, c인 (for문의 i = 1(2반째 반복)i = 3(for문의 3번째 반복)에서
			// A보다 거리가 멀다면 min이 실행되지 않는다
			// 그리고 결과는 A가 가장 가깝고 나오게 되며 A엘베가 이동하게 되는 것이다
			// 나와 엘베의 거리차이가 가장 안나는 for문의 i번째를 index에 담는다
			// (i번쨰는 for문이 반복할때 반복으로 인해 증가하는 i횟수)
			if(min > diff) { 	// for안에 있으니까 반복하면서 3개 중에 나랑 가장 차이가 안나는 수가
				min = diff; 	// min에 남게 된다
				index = i;		// 그리고 min을 거친 엘베가 들어가게 되는데
								// 이때 반복하면서 증가하는 i가 index에 들어가게된다
								// 즉, min인 if문이 실행 안되면 index에도 반영되지 않는다
								// 그리고 차이가 가장 적은 엘베(순서 i)가 index에 들어가게 되는 것이다 
			}
			System.out.println(diff + " ");
		
		}
		// 그리고 index로 가장 차이가 안나는 엘베를 나한테 오기 한다
		System.out.println();
		// index를 A로 설정해 놓고 거리가 A인 첫번째가 가깝다면 A가 나오지만 다음 배열수(엘베)가 더 작다면
		// A다음인 B가 자동으로 나오게 된다
		System.out.println((char)(index + 'A') + " 엘리베이터가 이동합니다");
		
		char test = getNearElebatorNum(arr,curr);
		System.out.println("test : " + test);
		
		sc.close();	
	}
	
	
	static char getNearElebatorNum(int[] arr, int curr) {
		char ele = 'A';
		int index = 0;
		int min = 14;
		
		// 1) 현재 층과 각 엘리베이터의 차이 구하기
		for(int i = 0; i < arr.length; i++) { // 랜덤으로 저장된 엘베를 중
			int diff = arr[i] - curr;		  // 각 엘배와 나의 거리의 값을 diff에 담고
			
			// 2) 거리차이의 절대값 처리
			if(diff < 0) {						// 거리 중 음수라면
				diff = -diff;					// 양수로 바꿔서 절대값 처리
			}
			
			// 3) 가리 중 최소값을 찾아서 index 구하기
			if(min > diff) {					// 그 거리가  14 이상이면
				min = diff;						// 가장 많이 차이나는 엘베로 min에 담기
				index = i;						// 그리고 나랑 엘베의 거리를 index에 담고
			}
		}
		
		// 4) index를 ele에 더하고 반환하기
		ele += index;							// A값이 담긴 ele에 나와 거리를 담고 있는 index를 더하여
		return ele;								// A를 시작으로 A보다 다른 2개가 더 작다면 B,C가 나오게 한다
	}											// char에 index로 숫자를 대입하면 char기준으로 아스키코드가
												// 적용되어 다음 알파벳이 나오게 되는 것이다
	
	static int getAbsolyte(int n1) {
		
		int tmp = 0;
		if( n1 < 0) {
			tmp = -n1;
		}
		else {
			tmp = n1;
			
		}
		
		return tmp;
	}
}



























