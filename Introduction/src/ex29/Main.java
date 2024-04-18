package ex29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*	소인수분해
	소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 
	따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(12); 
		System.out.println("[2, 3]=="+Arrays.toString(result)); 

		result = sol.solution(17); 
		System.out.println("[17]=="+Arrays.toString(result)); 
		
		result = sol.solution(420); 
		System.out.println("[2, 3, 5, 7]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(int n) { // 0.02ms ~ 0.28ms
    	List<Integer> list = new ArrayList<>();
    	
    	for (int i = 2; i <= n; i++) {
    		
				while(n%i == 0) {
					n /= i;
				}
				list.add(i);
			
		}
    	
        int[] answer = new int[list.size()];
     
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
 
        return answer;
    }
}