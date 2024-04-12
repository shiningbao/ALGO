package ex19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*	숨어있는 숫자의 덧셈(2)
	문자열 my_string이 매개변수로 주어집니다. 
	my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution("aAb1B2cC34oOp"); 
		System.out.println("37=="+result); 
		
		result = sol.solution("1a2b3c4d123Z"); 
		System.out.println("133=="+result); 
	}
}

class Solution {
    public int solution(String my_string) { // 0.09ms ~ 0.16ms
        int answer = 0;
        
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(my_string); // my_string 과 pattern 일치시키기
        
        while(matcher.find()) {
        	answer += Integer.parseInt(matcher.group());
        }
        
        return answer;
    }
}