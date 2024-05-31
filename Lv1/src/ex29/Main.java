package ex29;

/* 3진법 뒤집기
	자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
*/
public class Main { 

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
	
		result = sol.solution(45); 
		System.out.println("7=="+result);
		
		result = sol.solution(125); 
		System.out.println("229=="+result);
	}
	
}

class Solution {
    public int solution(int n) { // 0.03ms ~ 0.13ms
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
        	sb.append(n%3);
        	n /= 3;
		}        
        
        for (int i = 0; i < sb.length(); i++) {
        	answer = answer * 3 + (sb.charAt(i)-'0');
		}

        return answer;
    }
}