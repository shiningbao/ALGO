package ex43;

import java.util.HashSet;

// 포켓몬

public class Main { 

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
	
		result = sol.solution(new int[] {3, 1, 2, 3}); 
		System.out.println("2=="+result);
		
		result = sol.solution(new int[] {3, 3, 3, 2, 2, 4}); 
		System.out.println("3=="+result);
		
		result = sol.solution(new int[] {3, 3, 3, 2, 2, 2}); 
		System.out.println("2=="+result);
	}
	
}

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for (Integer pokemon : nums) {
			set.add(pokemon);
		}
        
        if(set.size()>nums.length/2) {
        	answer = nums.length/2;
        }else {
        	answer = set.size();
        }
        
        return answer;
    }
}