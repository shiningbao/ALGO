package ex20;

/* 	수박수박수박수박수박수?
	길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
	예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution(3); 
		System.out.println("수박수=="+result); 
		
		result = sol.solution(4); 
		System.out.println("수박수박=="+result); 
	}
}

class Solution {
    public String solution(int n) { // 2.05ms ~ 56.64ms
        String answer = "";
        
        for (int i = 1; i <= n; i++) {
			if(i%2 ==0) {
				answer += "박";
			}else {
				answer += "수";
			}
		}
        
        return answer;
        
        /* 0.06ms ~ 0.76ms
	       	StringBuilder answer = new StringBuilder();
	        for (int i = 1; i <= n; i++) {
	            answer.append(i%2==0?"박":"수");
	        }
	        return answer.toString();
        */
    }
}