package ex03.copy;

import java.util.Arrays;

public class Solution {
	 public int[] solution(int[] numbers, int num1, int num2) {
	        int[] answer = {};
	        answer = Arrays.copyOfRange(numbers, num1, num2+1); // 0.02ms ~ 0.06ms
	    
//			int[] answer = new int[num2-num1+1];	        
//	        for(int i = num1; i<= num2; i++) { // 0.01ms ~ 0.03ms
//	        	int idx = 0;
//	        	System.out.println(numbers[i]);
//	        	answer[idx] = numbers[i];
//	        	idx++;
//	        }
	        
	        return answer;
	    }
}
