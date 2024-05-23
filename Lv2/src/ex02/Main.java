package ex02;

import java.util.Stack;

/* 	올바른 괄호
	괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어

	"()()" 또는 "(())()" 는 올바른 괄호입니다.
	")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
	'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		boolean result = true;
		Solution sol = new Solution();
	
		result = sol.solution("()()"); 
		System.out.println("true=="+result);
		
		result = sol.solution("(())()"); 
		System.out.println("true=="+result);
		
		result = sol.solution(")()("); 
		System.out.println("false=="+result);
		
		result = sol.solution("(()("); 
		System.out.println("false=="+result);
	}
	
}

class Solution {
    boolean solution(String s) { // 효율성 20.41ms ~ 36.02ms
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				stack.push('(');
			} else if(s.charAt(i) == ')') {
				if(stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
        
        return stack.isEmpty(); // stack이 empty 이면 괄호의 짝이 다 맞았다는 것
        
        /* 효율성 8.49ms ~ 9.38ms
        	boolean answer = false;
	        int count = 0;
	        
	        for(int i = 0; i < s.length(); i++){
	            if(s.charAt(i) == '('){
	                count++;
	            }
	            if(s.charAt(i) == ')'){
	                count--;
	            }
	            if(count < 0){
	                break;
	            }
	        }
	        if(count == 0){
	            answer = true;
	        }
	
	        return answer;
        */
    }
}