package Solution;

import java.util.Arrays;

public class Ex06 { // 행렬의 곱셈
	/* 2차원 행렬 arr1과 arr2를 입력받아 arr1에 arr2를 곱한 결과를 반환하는 solution() 함수를 완성하세요.
	*/

	public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[][]{{1, 4},{3, 2}, {4, 1}}, new int[][] {{3, 3}, {3, 3}})));
        System.out.println(Arrays.deepToString(solution(new int[][]{{2, 3, 2},{4, 2, 4}, {3, 1, 4}}, new int[][] {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}})));
    }

    private static int[][] solution(int[][] arr1, int[][] arr2) {
    int r1 = arr1.length;
    int c1 = arr1[0].length;
    // int r2 = arr2.length;
    int c2 = arr2[0].length;
    
    int[][] answer = new int[r1][c2];
    
    for (int i = 0; i < r1; i++) {
		for (int j = 0; j < c2; j++) {
			for (int k = 0; k < c1; k++) {
				answer[i][j] += arr1[i][k] * arr2[k][j];
			}
		}
	}
    	
    return answer;
    }


}
