package ex68;

import java.util.ArrayList;
import java.util.Arrays;

/* 배열 만들기2
	정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
	만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(5, 555); 
		System.out.println("[5, 50, 55, 500, 505, 550, 555]=="+Arrays.toString(result)); 
		
		result = sol.solution(10, 20); 
		System.out.println("[-1]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(int l, int r) { // 0.03ms ~ 13.48ms
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
        	boolean only05 = true;
        	int num = i;
        	
        	 while (num > 0) {
                 int digit = num % 10;
                 if (digit != 0 && digit != 5) {
                     only05 = false;
                     break;
                 }
                 num /= 10;
             }
             if (only05) {
                 list.add(i);
             }
        }
        
        if (list.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] answer = new int[list.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }

}