package ex28;

import java.util.Arrays;

public class Main { // n^2 배열 자르기

	
	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
	
		result = sol.solution(3, 2, 5); 
		System.out.println("[3, 2, 2, 3]=="+Arrays.toString(result));
		
		result = sol.solution(4, 7, 14); 
		System.out.println("[4, 3, 3, 3, 4, 4, 4, 4]=="+Arrays.toString(result));
	}	
}

class Solution {
    public int[] solution(int n, long left, long right) { // 0.05ms ~ 9.83ms
    	int size = (int)(right - left + 1);  
        int[] answer = new int[size];

        for (long i = left; i <= right; i++) {
            int row = (int)(i / n);
            int col = (int)(i % n);
            answer[(int)(i - left)] = Math.max(row, col) + 1;
        }
        
        return answer;
    }
}