package ex32;
// 문자열의 앞의 n글자
public class Solution {

	 public String solution(String my_string, int n) {
	        String answer = "";
	        
	        answer = my_string.substring(0, n);
	        return answer;
	    }
}
