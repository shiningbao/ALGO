package ex25;

import java.util.Stack;

public class Main { /* 괄호 회전하기
다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.

(), [], {} 는 모두 올바른 괄호 문자열입니다.
만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다. 예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다. 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다. 
이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요. */
	
	public static void main(String[] args) {
		int result = -1;
		Solution sol = new Solution();
	
		result = sol.solution("[](){}"); 
		System.out.println("3=="+result);
		
		result = sol.solution("}]()[{"); 
		System.out.println("2=="+result);
		
		result = sol.solution("[)(]"); 
		System.out.println("0=="+result);
		
		result = sol.solution("}}}"); 
		System.out.println("0=="+result);

	}	
}

class Solution {
    public int solution(String s) { // 0.10ms ~ 45.37ms
        int answer = 0;
  
        for (int i = 0; i < s.length(); i++) {
			Stack<Character> stack = new Stack<>();
			boolean isCorrect = true;
			
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt((i+j)%s.length());
				
				if(c == '(' || c == '{' || c == '[') {
					stack.push(c);
				} else {
					if(stack.isEmpty()) {
						isCorrect = false;
						break;
					}
					char open = stack.pop();
					if((open == '(' && c != ')') || (open == '{' && c != '}') || (open == '[' && c!= ']')) { // 괄호 쌍이 안맞으면
						isCorrect = false;
						break;
					}
				}
			}
			if(isCorrect && stack.isEmpty()) {
				answer ++;
			}
		}
        
        return answer;
    }
}