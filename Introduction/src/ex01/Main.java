package ex01;

/*	가위 바위 보
	가위는 2 바위는 0 보는 5로 표현합니다. 
	가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때, rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("2"); 
		System.out.println("0=="+result); 
		
		result = sol.solution("205"); 
		System.out.println("052=="+result); 		
	}
}

class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for (char c : rsp.toCharArray()) { // 1.75ms ~ 2.58ms
			if(c == '2') {
				answer += "0";
			}else if(c == '0') {
				answer += "5";
			}else {
				answer += "2";
			}
		}
   
        /*// 0.03ms ~ 0.04ms
        	StringBuilder answer = new StringBuilder();
        
	        for (char c : rsp.toCharArray()) { 
				if(c == '2') {
					answer.append("0");
				}else if(c == '0') {
					answer.append("5");
				}else {
					answer.append("2");
				}
			}
        
        	return answer.toString();
        */
        return answer;
    }
}