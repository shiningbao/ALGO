package ex18;

/*	팩토리얼
	i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 
	예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(3628800); 
		System.out.println("10=="+result); 
		
		result = sol.solution(7); 
		System.out.println("3=="+result); 
	}
}

class Solution {
    public int solution(int n) { // 0.01ms ~ 0.03ms
        int answer = 1;
        int factorial = 1;
        
        while(factorial <= n) { // n = 7일 때 factorial = 1*2 / factorial = 1*2*3 / factorial = 1*2*3*4 -> n보다 커짐. 최댓값을 구해야 하므로 그 전 answer을 구하기 위해 answer-1 
        	answer++;
        	factorial *= answer;
        }
        return answer-1;
    }
}