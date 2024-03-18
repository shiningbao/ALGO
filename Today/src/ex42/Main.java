package ex42;

import java.util.ArrayList;
import java.util.Arrays;

/*	수열과 구간 쿼리3
	정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
	각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
	위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {0, 1, 2, 3, 4}, new int[][] {{0,3},{1,2},{1,4}});
		System.out.println("[3, 4, 1, 0, 2]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(int[] arr, int[][] queries) { // 0.02ms ~ 0.10ms
        int[] answer = arr.clone();
        
        for (int[] query : queries) {
			int start = query[0];
			int end = query[1];
				
			int temp = answer[start];
            answer[start] = answer[end];
            answer[end] = temp;
		}
        return answer;
    }
}