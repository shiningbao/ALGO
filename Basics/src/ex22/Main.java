package ex22;

import java.util.Arrays;

/*	특별한 이차원 배열1
	정수 n이 매개변수로 주어질 때, 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요.
	arr[i][j] (0 ≤ i, j < n)의 값은 i = j라면 1, 아니라면 0입니다.
*/
public class Main {

	public static void main(String[] args) {
		int[][] result = {};
		Solution sol = new Solution();
		result = sol.solution(3);
		System.out.println("[[1, 0, 0], [0, 1, 0], [0, 0, 1]]=="+Arrays.deepToString(result)); // Arrays.toString() 은 1차원 배열에서만 동작
		
		result = sol.solution(6);
		System.out.println("[[1, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0], [0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 1]]=="+Arrays.deepToString(result));
	
		result = sol.solution(1);
		System.out.println("[[1]]=="+Arrays.deepToString(result)); 
	}
}

class Solution {
    public int[][] solution(int n) { // 0.01ms ~ 0.31ms
        int[][] answer = new int[n][n];
        for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				if(i==j) {
					answer[i][j] = 1;
				}else {
					answer[i][j] = 0;
				}
			}
		}
        /*
    	for(int i = 0 ; i < n ; i++) { // 0.02ms ~ 0.08ms
        	answer[i][i] = 1;
    	}
        */
        return answer;
    }
}