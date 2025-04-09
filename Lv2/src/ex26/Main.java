package ex26;

import java.util.HashMap;
import java.util.Map;

public class Main { // 할인 행사

	
	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
	
		result = sol.solution(new String[] {"banana", "apple", "rice", "pork", "pot"}, new int[] {3, 2, 2, 2, 1}, new String[] {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}); 
		System.out.println("3=="+result);
		
		result = sol.solution(new String[] {"apple"}, new int[] {10}, new String[] {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"}); 
		System.out.println("0=="+result);
	}	
}

class Solution {
    public int solution(String[] want, int[] number, String[] discount) { //0.04ms ~ 77.41ms
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();       
        
        for (int i = 0; i < want.length; i++) {
        	wantMap.put(want[i], number[i]);
		}

        for (int start = 0; start <= discount.length - 10; start++) { // 예를 들면, 0~9, 1~10, 2~11, 3~12, 4~13
            Map<String, Integer> dcMap = new HashMap<>();

	        for (int i = start; i < start + 10; i++) {
	            	dcMap.put(discount[i], dcMap.getOrDefault(discount[i], 0) + 1); // discount[i]가 dcMap에 있으면 discount[i]의 값을 반환해서 +1, 없으면 0+1
	        }
            
            if(wantMap.equals(dcMap)) {
            	answer++;
            }

        }
   
        return answer;
    }
}