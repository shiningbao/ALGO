package ex17;

import java.util.PriorityQueue;

// 더 맵게

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
	
		result = sol.solution(new int[] {1, 2, 3, 9, 10, 12}, 7); 
		System.out.println("2=="+result);
	}
	
}

class Solution {
    public int solution(int[] scoville, int K) { // 효율성 114.72ms ~ 1624.64ms
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int scov : scoville) {
			pq.add(scov);
		}
        
        while (!pq.isEmpty() && pq.peek() < K) {
        	int lowest= pq.poll();
        	if(!pq.isEmpty()) {
        		int secLow = pq.poll();
        		pq.add(lowest + secLow*2);
        		answer++;
        	}else{
        		return -1;
        	}
		}
        
        return answer;
    }
}