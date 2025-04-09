package ex24;

public class Main { // 예상 대진표
	public static void main(String[] args) {
		int result = 1;
		Solution sol = new Solution();
	
		result = sol.solution(8, 4, 7); 
		System.out.println("3=="+result);
		
		result = sol.solution(8, 4, 5); 
		System.out.println("3=="+result);

	}	
}

class Solution {
    public int solution(int n, int a, int b) { // 0.03ms ~ 0.05ms
        int answer = 1;
        
        while(Math.abs(a-b) != 1) {
        	answer ++;
        	a = (a+1)/2;
        	b = (b+1)/2;
        }
    	
        while((a<b && a%2 == 0) || (a>b && b%2 == 0)) {
        	answer++;
        	a = (a+1)/2;
        	b = (b+1)/2;
        }
        
        return answer;
    }
}