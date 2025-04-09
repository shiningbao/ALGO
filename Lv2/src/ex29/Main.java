package ex29;

import java.util.Arrays;

public class Main { // 행렬의 곱셈 : 2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.


	
	public static void main(String[] args) {
		int[][] result = {};
		Solution sol = new Solution();
	
		result = sol.solution(new int[][] {{1, 4}, {3, 2}, {4, 1}}, new int[][] {{3, 3}, {3, 3}}); 
		System.out.println("[[15, 15], [15, 15], [15, 15]]=="+Arrays.deepToString(result));
		
		result = sol.solution(new int[][] {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}, new int[][] {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}}); 
		System.out.println("[[22, 22, 11], [36, 28, 18], [29, 20, 14]]=="+Arrays.deepToString(result));
	}	
}

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) { // 0.15ms ~ 21.54ms
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for (int i = 0; i < arr1.length; i++) { // arr1의 행 선택
            for (int j = 0; j < arr2[0].length; j++) { // arr2의 열 선택
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];  
                }
            }
        }
        
        return answer;
    }
}