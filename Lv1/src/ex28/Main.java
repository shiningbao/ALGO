package ex28;

import java.util.Arrays;

/* 최대공약수와 최소공배수
	두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
	배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
	예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
	
		result = sol.solution(3, 12); 
		System.out.println("[3, 12]=="+Arrays.toString(result));
		
		result = sol.solution(2, 5); 
		System.out.println("[1, 10]=="+Arrays.toString(result));
	}
	
}

class Solution {
    public int[] solution(int n, int m) { // 0.02ms ~ 0.09ms
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        while(min != 0) { // 최대공약수
        	int r = max % min;
        	max = min;
        	min = r;
        }        
        // 최소공배수 = 두 수의 곱 / 최대공약수
        int lcm = n * m / max; 
        
        int[] answer = {max, lcm};
        
        return answer;
    }
}