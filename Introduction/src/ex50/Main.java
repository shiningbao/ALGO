package ex50;

import java.util.Arrays;

/* 	OX퀴즈
	덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다. 
	수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		String[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new String[] {"3 - 4 = -3", "5 + 6 = 11"}); 
		System.out.println("[X, O]=="+Arrays.toString(result)); 
		
		result = sol.solution(new String[] {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"}); 
		System.out.println("[O, O, X, O]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public String[] solution(String[] quiz) { // 0.09ms ~ 0.22ms
        String[] answer = new String[quiz.length];
        String[] qArr = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            qArr = quiz[i].split(" ");
            
            if(qArr[1].equals("-")) {
            	if(Integer.parseInt(qArr[0]) - Integer.parseInt(qArr[2]) == Integer.parseInt(qArr[4])) {
            		answer[i] = "O";
            	}else{
            		answer[i] = "X";
            	}
            	
            }else if(qArr[1].equals("+")) {
            	if(Integer.parseInt(qArr[0]) + Integer.parseInt(qArr[2]) == Integer.parseInt(qArr[4])) {
            		answer[i] = "O";
            	}else{
            		answer[i] = "X";
            	}
            }          
        }
        /* 0.07ms ~ 0.22ms
        	for(int i=0; i<quiz.length; i++){
	            String[] text = quiz[i].split(" ");
	            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
	            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
        	}
        	return quiz;
         */
        return answer;
    }
}