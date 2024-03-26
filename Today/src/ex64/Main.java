package ex64;

import java.util.Arrays;

/* 정사각형으로 만들기
	이차원 정수 배열 arr이 매개변수로 주어집니다. arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고, 
	열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.

*/
public class Main {

	public static void main(String[] args) {
		int[][] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}}); 
		System.out.println("[[572, 22, 37, 0], [287, 726, 384, 0], [85, 137, 292, 0], [487, 13, 876, 0]]=="+Arrays.deepToString(result)); 
		
		result = sol.solution(new int[][]{{57, 192, 534, 2}, {9, 345, 192, 999}}); 
		System.out.println("[[57, 192, 534, 2], [9, 345, 192, 999], [0, 0, 0, 0], [0, 0, 0, 0]]=="+Arrays.deepToString(result)); 
		
		result = sol.solution(new int[][]{{1,2}, {3,4}}); 
		System.out.println("[[1, 2], [3, 4]]=="+Arrays.deepToString(result)); 
	}
}

class Solution {
    public int[][] solution(int[][] arr) { // 0.03ms ~ 1.25ms
    	 int max = Math.max(arr.length, arr[0].length);

         int[][] answer = new int[max][max];

         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[0].length; j++) {
                 answer[i][j] = arr[i][j];
             }
         }

         for (int i = arr.length; i < max; i++) {
             for (int j = 0; j < max; j++) {
                 answer[i][j] = 0;
             }
         }
         for (int j = arr[0].length; j < max; j++) {
             for (int i = 0; i < max; i++) {
                 answer[i][j] = 0;
             }
         }
         
         /* 0.03ms ~ 0.12ms
          	int max = Math.max(arr.length, arr[0].length);

         	int[][] answer = new int[max][max];
         	
         	for (int i = 0; i < arr.length; i++) {
            	System.arraycopy(arr[i], 0, answer[i], 0, arr[0].length);  // arr[i] 줄을 0번째부터 answer[i] 줄의 0번째칸으로 arr[0].lenght 길이만큼 복사해서 넣는다.
        	}
        	return answer;
        */

         return answer;
    }
}