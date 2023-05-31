package oop;

public class Ex01 {
	public static void main(String[] args) {
		// 배열의 단점
		// 1. 배열은 오로지 같은 자료형만 저장할 수 있다
		// 2. 길이가 변하지 않는다
		
		String[] nameArray = {"짱구","유리","훈이","맹구","철수"};
		double[] heightArray = {105.9,104.2,106.2,113.9,108.7};
		
		for(int i = 0; i < 5; i++) {
			String name = nameArray[i];
			double height = heightArray[i];
			System.out.printf("%s의 키는 %.1f입니다\n", name, height);
		}
		System.out.println();
		
		// 위 배열 데이터를 이용하여 이름 기준 오름차순으로 정렬하고 다시 출력
		for(int i = 0; i < 5; i++) {
			for(int j = i + 1; j < 5; j++) {
				//여기서 조건이 name의 크기에 따라 오름차순으로 정렬되는 것이기 때문에
				// if조건 안에서 키를 정렬한다면 이름에 따라서 움직이게 된다
				if(nameArray[i].compareTo(nameArray[j]) > 0) {
					String s1 = nameArray[i];
					nameArray[i] = nameArray[j];
					nameArray[j] = s1;
					
					double s2 = heightArray[i];
					heightArray[i] = heightArray[j];
					heightArray[j] = s2;
					
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			String name = nameArray[i];
			double height = heightArray[i];
			System.out.printf("%s의 키는 %.1f입니다\n", name, height);
		}
		System.out.println();
	}
}
