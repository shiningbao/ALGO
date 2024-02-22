package ex11;

public class Solution {
	 public int[] solution(int[] numbers, int num1, int num2) {
	        int[] answer = new int[num2-num1+1];
	        for (int i = num1; i <= num2; i++) {
				answer[i-1] = numbers[i];
			}
	        
	        return answer;
	    }
    }

