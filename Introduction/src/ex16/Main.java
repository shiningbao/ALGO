package ex16;

import java.util.Arrays;
import java.util.Collections;

/*	진료 순서 정하기
	외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 
	정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {3, 76, 24}); 
		System.out.println("[3, 1, 2]=="+Arrays.toString(result)); 
		
		result = sol.solution(new int[] {1, 2, 3, 4, 5, 6, 7}); 
		System.out.println("[7, 6, 5, 4, 3, 2, 1]=="+Arrays.toString(result)); 
		
		result = sol.solution(new int[] {30, 10, 23, 6, 100}); 
		System.out.println("[2, 4, 3, 5, 1]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(int[] emergency) { // 0.26ms ~ 0.82ms
        Integer[] tmp = new Integer[emergency.length];
        
        for (int i = 0; i < emergency.length; i++) {
        	tmp[i] = emergency[i];
        }
        
        // 내림차순으로 정렬
        Arrays.sort(tmp, Collections.reverseOrder());
        
        // Integer 배열을 다시 int 배열로 변환
        for (int i = 0; i < tmp.length; i++) {
            emergency[i] = Arrays.asList(tmp).indexOf(emergency[i])+1;
        }
        
        return emergency;
    }
}