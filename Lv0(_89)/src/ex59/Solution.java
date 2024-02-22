package ex59;

public class Solution {

	 public String[] solution(String my_string) {
	        String[] answer = {};
	        // trim() : 앞뒤 공백 제거
	        // \s 는 공백을 나타내는 특수문자이고 +는 하나 이상의 연속된 공백을 나타낸다.
	        answer = my_string.trim().split("\\s+"); 
	        return answer;
	    }
}
