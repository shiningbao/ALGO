package ex10;

// 콜라문제

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
	
		result = sol.solution(2,	1,	20); 
		System.out.println("19=="+result);
		
		result = sol.solution(3, 1, 20); 
		System.out.println("9=="+result);

	}
	
}

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            answer += (n / a) * b; 
            n = (n % a) + (n / a) * b;
        }
        
        return answer;
    }
}