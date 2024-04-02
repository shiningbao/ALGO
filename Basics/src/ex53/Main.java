package ex53;

/* qr code
	두 정수 q, r과 문자열 code가 주어질 때, code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution(3,1,"qjnwezgrpirldywt"); 
		System.out.println("jerry=="+result); 
		
		result = sol.solution(1,0,"programmers"); 
		System.out.println("programmers=="+result); 
	}
}

class Solution {
    public String solution(int q, int r, String code) { // 9.5ms ~ 15.39ms
        String answer = "";
        
        for (int i = 0; i < code.length(); i++) {
			if(i%q==r) {
				answer += code.charAt(i);
			}
		}
        
        return answer;
        
        /* 0.04ms ~ 0.14ms
	       	StringBuilder sb = new StringBuilder();
	       	
	        for(int i=0; i<code.length(); i++) {
	            if(i%q == r){
	                char c = code.charAt(i);
	                sb.append(c);
	            }
	        }
	        
	        return sb.toString();
         */
    }
}