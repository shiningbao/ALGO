package ex12;
// 특정 문자 제거하기
public class Solution {

	 public String solution(String my_string, String letter) {
	        String answer = "";
	        answer = my_string.replaceAll(letter, "");
	        return answer;
	    }
}
