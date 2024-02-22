package ex29;
// 문자열의 뒤의 n글자
import java.util.Arrays;

public class Solution {

	 public String solution(String my_string, int n) {
	        String answer = "";
	        /*
	        String[] strarr = my_string.split("");
	        String[] copy= Arrays.copyOfRange(strarr, strarr.length-n, strarr.length);
	        
	        for (String str : copy) {
				answer += str;
			}
			*/
	        answer = my_string.substring(my_string.length()-n);
	        return answer;
	    }
}
