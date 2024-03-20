package ex49;

import java.util.Arrays;

/* 수열과 구간 쿼리4
	정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
	각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더합니다.
	위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {0,1,2,4,3}, new int[][] {{0,4,1},{0,3,2},{0,3,3}});
		System.out.println("[3, 2, 4, 6, 4]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(int[] arr, int[][] queries) { // 0.03ms ~ 2.23ms
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}