package ex54;

import java.util.Arrays;

/* 	연속된 수의 합
	연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다. 
	연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(3, 12); 
		System.out.println("[3, 4, 5]=="+Arrays.toString(result)); 
		
		result = sol.solution(5, 15); 
		System.out.println("[1, 2, 3, 4, 5]=="+Arrays.toString(result)); 
		
		result = sol.solution(4, 14); 
		System.out.println("[2, 3, 4, 5]=="+Arrays.toString(result)); 
		
		result = sol.solution(5, 5); 
		System.out.println("[-1, 0, 1, 2, 3]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(int num, int total) { // 0.01ms ~ 0.03ms
        int[] answer = new int[num];
        int start = total / num - (num - 1) / 2;
        
        for (int i = 0; i < num; i++) {
			answer[i] = start + i;
		}
  
        return answer;
    }
}