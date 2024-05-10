package ex52;

import java.util.Arrays;

/* 	다음에 올 숫자
	등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {1, 2, 3, 4}); 
		System.out.println("5=="+result); 
		
		result = sol.solution(new int[] {2, 4, 8}); 
		System.out.println("16=="+result); 
	}
}

class Solution {
    public int solution(int[] common) { // 0.01ms ~ 0.03ms
        int answer = 0;
        
        if(common[1] - common[0] == common[common.length-1] - common[common.length-2]) {
        	answer = common[common.length-1] + common[1] - common[0];
        }else{
        	answer = common[common.length-1]*(common[1]/common[0]);
        }
        return answer;
    }
}