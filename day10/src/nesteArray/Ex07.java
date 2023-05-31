package nesteArray;

import java.util.Arrays;
import java.util.List;

public class Ex07 {
	static void show(int[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			// i가 배열 길이만큼 반복했을떄 마지막이 아니라면 ,를 마지막이라면 ]\n를 해라
			System.out.print(i == arr.length -1 ? "]\n" : ", ");
		}
	}
	
	public static void main(String[] args) {
		
		// selection sort (선택정렬)
		// 배열이나 리스트 등, 여러 요소가 선형으로 배치된 구조에서
		// 값의 크기를 비교하여 n번째 자리에 가장 적합한 값을 선택하여 배치하여 정렬
		int[] arr = {4, 8, 2, 7, 6};
		show(arr);
		
		// 비교 : 서로 다른 두 값의 크기 비교가 필요하다
		// 크기를 비교하여 내가 원하는 기준(오름차순)에서 벗어나면 자리를 교체한다
		// 두 변수의 값을 교환하기 위해서는 임시 변수가 하나 더 필요하다
		// 두 값을 각각 지정하기 위해서, i번쨰 값을 순환시켜야 한다
		// 값이 많으면 처리하는 시간이 꽤 오래 걸린다
		
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				// 두 값을 비교해서 차이를 정수로 반환(compareTo)
				if(arr[i] - arr[j] > 0) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		show(arr);
		
		String[] arr2 = { "신짱구", "한유리", "김철수", "이훈이", "맹구"};
		// 배열을 문자열 형태로 치환해주는 함수 Arrays.toString()
		// 치환하게 되면 ""가 없어지고 문자열로 치환된다
		// [신짱구, 한유리, 김철수, 이훈이, 맹구] <- 이렇게 말이다
		System.out.println(Arrays.toString(arr2));
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = i + 1; j < arr2.length; j++) {
				// compareTo는 arr[i] - arr[j] > 0과 똑같다
				// 문자열을 비교하는 것이고 compareTo를 사용하지 않은
				// 코드를 보면 -1이 나오면 앞에수가 더 작기때문에 바꾸지 않지만
				// 0보다 큰 수가 나오게 된다면 앞에 위치한 문자가 크다는 의미로
				// 자리를 바꾸는 것과 같이 compareTo도 마찬가지로 앞수와 뒤수를
				// 판별하여 0보다 큰 수면 치환하지 않고 작다면 치환하는 형태이다
				if(arr2[i].compareTo(arr2[j]) > 0){
					String tmp1 = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp1;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		// 이후 컬렉션에서 이루어지는 다른 정렬에서도
		// 실제 구현내용은 다르지만
		// 두 값의 크기를 비교한다는 원리는 변하지 않는다
		
		List<String> list = Arrays.asList(
				new String[] { "신짱구", "한유리", "김철수", "이훈이", "맹구"}
				
		);
		System.out.println(list);
		list.sort((a,b)-> a.compareTo(b));
		System.out.println(list);

	}
}














