package ex72;

import java.util.Arrays;

/*	정수를 나선형으로 배치하기
	양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n^2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[][] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(4); 
		System.out.println("[[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]=="+Arrays.deepToString(result)); 
		
		result = sol.solution(5); 
		System.out.println("[[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]=="+Arrays.deepToString(result)); 		
	}
}

class Solution {
    public int[][] solution(int n) { // 0.01ms ~ 0.05ms
        int[][] answer = new int[n][n];
        
        int num = 1;
        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = n - 1;
        
        while (num <= n * n) {
            // 상단 행을 왼쪽에서 오른쪽으로 채우기
            for (int i = colStart; i <= colEnd; i++) {
                answer[rowStart][i] = num++;
            }
            rowStart++;
            
            // 오른쪽 열을 위에서 아래로 채우기
            for (int i = rowStart; i <= rowEnd; i++) {
                answer[i][colEnd] = num++;
            }
            colEnd--;
            
            // 하단 행을 오른쪽에서 왼쪽으로 채우기
            for (int i = colEnd; i >= colStart; i--) {
                answer[rowEnd][i] = num++;
            }
            rowEnd--;
            
            // 왼쪽 열을 아래에서 위로 채우기
            for (int i = rowEnd; i >= rowStart; i--) {
                answer[i][colStart] = num++;
            }
            colStart++;
        }
        
        return answer;
    }
}