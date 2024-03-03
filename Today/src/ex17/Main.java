package ex17;

import java.util.ArrayList;
import java.util.Arrays;

/*	홀수 vs 짝수
	정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때, 
	홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return합니다.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		result = sol.solution(new int[] {4, 2, 6, 1, 7, 6});
		System.out.println("17=="+result); 		
		
		result = sol.solution(new int[]{-1, 2, 5, 6, 3});
		System.out.println("8=="+result); 		
	}

}

class Solution {
    public int solution(int[] num_list) { // 0.02ms~0.08ms
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < num_list.length; i++) {
			if(i%2==0) {
				sum1 += num_list[i];
			}else {
				sum2 += num_list[i];
			}
			answer = Math.max(sum1, sum2);
		}
        return answer;
    }
}