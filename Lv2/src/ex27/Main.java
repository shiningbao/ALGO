package ex27;

import java.util.HashSet;
import java.util.Set;

public class Main { // 연속 부분 수열 합의 개수

	
	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
	
		result = sol.solution(new int[] {7, 9, 1, 1, 4}); 
		System.out.println("18=="+result);
	}	
}

class Solution {
    public int solution(int[] elements) { // 0.10ms ~ 206.14ms
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < elements.length; i++) {
            int sum = 0;
            
            for(int j = 0; j < elements.length; j++) {
                sum += elements[(i + j) % elements.length];
                set.add(sum);
            }
            
        }
        
        return set.size();
    }
}