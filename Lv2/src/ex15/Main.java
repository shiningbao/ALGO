package ex15;

import java.util.Arrays;
import java.util.Stack;

// 주식가격

public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
	
		result = sol.solution(new int[] {1, 2, 3, 2, 3}); 
		System.out.println("[4, 3, 1, 1, 0]=="+Arrays.toString(result));
		
		result = sol.solution(new int[] {1, 2, 3, 1, 1}); 
		System.out.println("[4, 2, 1, 1, 0]=="+Arrays.toString(result));
	}
	
}

class Solution {
    public int[] solution(int[] prices) {   	
    	int[] answer = new int[prices.length];
    	Stack<Integer> stack = new Stack<>();
    	
    	for (int i = 0; i < prices.length; i++) {
    		// 현재 가격이 이전 가격보다 낮으면 스택에 저장된 인덱스 처리
			while (!stack.isEmpty() && prices[i] < prices[stack.peek()]){
				int idx = stack.pop();
				answer[idx] = i - idx; // 유지된 기간 계산
			}		
			stack.push(i); // 현재 인덱스를 스택에 추가
		}
    	
    	// 끝까지 가격이 떨어지지 않은 경우 처리
    	while (!stack.isEmpty()) {
			int idx = stack.pop();
			answer[idx] = prices.length - idx -1;
		}
    	
        return answer;
    }
}