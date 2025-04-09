package ex13;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

// 기능개발

public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
	
		result = sol.solution(new int[] {93, 30, 55}, new int[] {1, 30, 5}); 
		System.out.println("[2, 1]=="+Arrays.toString(result));
		
		result = sol.solution(new int[] {95, 90, 99, 99, 80, 99}, new int[] {1, 1, 1, 1, 1, 1}); 
		System.out.println("[1, 3, 2]=="+Arrays.toString(result));
	}
	
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) { // 0.04ms ~ 0.18ms
        Queue<Integer> q = new ArrayDeque<>();
        
        for (int i = 0; i < progresses.length; i++) {     
        	
        	if((100-progresses[i])%speeds[i] == 0) {
			q.add((100-progresses[i])/speeds[i]);
        	} else {
        		q.add(((100-progresses[i])/speeds[i])+1);
        	}
        }

        List<Integer> answerList = new ArrayList<>();
        
        while(!q.isEmpty()) {
        	int current = q.poll(); 
        	int count = 1;
        	
        	while (!q.isEmpty() && q.peek() <= current) {
				q.poll();
				count++;
			}
        	answerList.add(count);
        }
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
       
        return answer;
    }
}