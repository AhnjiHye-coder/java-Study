package String;

public class Solution {
	public String solution(String new_id) {
		String answer = "";
		
		// 1단계 new_id의 모든 대문자를 대응되는 소문자
		new_id = new_id.toLowerCase();
		
		
		// 2단계 new_ids에서 알파벳
		// 소문자, 숫자, 빼기(-),밑줄(_), 마침표(.)를 제외한 모든 문자
		String myFilter = "abcdefghijklmnopqrstuvwxyz0123456789-_.";
		for(int i = 0; i < new_id.length(); i++) {
			char ch = new_id.charAt(i);
			if(myFilter.contains(ch + "")) {
				answer += ch;
			}
		}
		
		// 3단계에서 new_id에서 마침표(.)가 2번이상 연속된
		// 부분을 하나의 마침표(.)로 치환합니다
		while(answer.contains("..")) {
			answer = answer.replace("..", ".");
		}
		
		//4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		if(answer.startsWith(".")) { // .이 시작하는 곳부터(.부터 시작하게 하는 함수)
			answer = answer.substring(1); // 맨 처음에 .이 있다면 제거
		}
		if(answer.endsWith(".")) { // 마지막에 .이 있다면
			// 0부터 길이의 -1전까지 없애라
			answer = answer.substring(0, answer.length() -1);
		}
		
		
		// 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
		// contentEquals : 괄호에 있는 문자가 포함되어있다면 true
		if(answer.contentEquals("")) { 
			answer = "a";
		}
		
		
		// 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
	    // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		if(answer.length() >= 16) { // 16이상이면
			answer = answer.substring(0, 15); // 0 부터 15까지만 남겨둔다
		}
		
		if(answer.startsWith(".")) {
			answer = answer.substring(0, answer.length() -1);
		}
		
		// 7단계 길이가 2자 이하라면 3이 될때까지 반복해라
		// new_id의 마지막 문자를 new_id의 길이가
		// 3이 될때까지 반복해서 붙여라
		
		while(answer.length() > 3) {
			answer += answer.charAt(answer.length() -1);
		}
		
		return answer;
		
		
	}
}
