package ex33;

import java.util.Arrays;

/*	문자열 계산하기
	my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution("3 + 4"); 
		System.out.println("7=="+result); 
		
		result = sol.solution("300 + 24 - 10"); 
		System.out.println("314=="+result); 

	}
}

class Solution {
    public int solution(String my_string) { // 0.08ms ~ 0.14ms
        int answer = 0;
        
        String[] arr = my_string.split(" ");
        answer += Integer.parseInt(arr[0]);
        
        for (int i = 0; i < arr.length; i++) {				
    		if(arr[i].equals("+")) {
    			answer += Integer.parseInt(arr[i+1]);
    		}else if(arr[i].equals("-")) {
    			answer -= Integer.parseInt(arr[i+1]);
    		}
		}
        
        return answer;
    }
}