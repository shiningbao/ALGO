package ex55;

/* 	안전지대
	지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
	지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
	지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}); 
		System.out.println("16=="+result); 
		
		result = sol.solution(new int[][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}}); 
		System.out.println("13=="+result); 
		
		result = sol.solution(new int[][] {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}}); 
		System.out.println("0=="+result); 

	}
}

class Solution {
    public int solution(int[][] board) { // 0.02ms ~ 0.05ms
        int answer = 0;
        int[][] list = new int[board.length+2][board.length+2];        
        
        for (int i = 0; i < board.length; i++) {
        	for (int j = 0; j < board.length; j++) {
        		if(board[i][j] == 1) {
        			// System.out.println("i:"+i+",j:"+j);
        			for (int k = i; k <= i+2; k++) {
						for (int l = j; l <= j+2; l++) {
							if(list[k][l] != 1) {
								list[k][l] = 2;
							}
						}
					}
        		}
			}
		}
        
        for (int i = 1; i < list.length-1; i++) {
			for (int j = 1; j < list.length-1; j++) {
				if(list[i][j] == 0) {
					answer++;
				}
			}
		}
        return answer;
    }
}