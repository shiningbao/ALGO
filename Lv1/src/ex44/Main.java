package ex44;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main { // 명예의 전당(1)

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
	
		result = sol.solution(3, new int[] {10, 100, 20, 150, 1, 100, 200}); 
		System.out.println("[10, 10, 10, 20, 20, 100, 100]=="+Arrays.toString(result));
		
		result = sol.solution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}); 
		System.out.println("[0, 0, 0, 0, 20, 40, 70, 70, 150, 300]=="+Arrays.toString(result));
	}
	
}

class Solution {
    public int[] solution(int k, int[] score) { // 0.31ms ~ 2.40ms
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < score.length; i++) {
			pq.add(score[i]);
           
            if (pq.size() > k) { 
                pq.poll();
            }            
            answer[i] = pq.peek();
		} 
        return answer;
    }
}