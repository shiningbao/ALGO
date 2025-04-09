package ex14;

import java.util.Collections;
import java.util.PriorityQueue;

// 프로세스

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
	
		result = sol.solution(new int[] {2, 1, 3, 2}, 2); 
		System.out.println("1=="+result);
		
		result = sol.solution(new int[] {1, 1, 9, 1, 1, 1}, 0); 
		System.out.println("5=="+result);
	}
	
}

class Solution {
    public int solution(int[] priorities, int location) {
    	int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int priority : priorities) {
			pQ.add(priority);
		}
		
		while (!pQ.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if(priorities[i] == pQ.peek()) {
					pQ.poll();
					answer++;
					
					if(i == location) {
						return answer;
					}
					
				}
			}
		}
        
        return answer;
    }
 }