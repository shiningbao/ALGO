package ex35;

/*	이차원 배열 대각선 순회하기
	2차원 정수 배열 board와 정수 k가 주어집니다.
	i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 합을 return 하는 solution 함수를 완성해 주세요.


*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[][] {{0,1,2},{1,2,3},{2,3,4},{3,4,5}}, 2);
		System.out.println("8=="+result);
		
		result = sol.solution(new int[][] {{0,1,2},{1,2,3},{2,3,4},{3,4,5}}, 6);
		System.out.println("30=="+result); // 01,02,10,11,12,20,21,22,30,31,32 -> 30
	}
}

class Solution {
    public int solution(int[][] board, int k) { // 0.02ms ~ 0.11ms
        int answer = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(i+j<=k) {
					answer += board[i][j];
				}
			}
		}
		
        return answer;
    }
}
