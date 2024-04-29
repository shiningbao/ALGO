package ex39;

import java.util.Arrays;

/*	직사각형 넓이 구하기
	2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 
	직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[][] {{1,1}, {2,1},{2,2},{1,2}}); 
		System.out.println("1=="+result); 
		
		result = sol.solution(new int[][] {{-1,-1}, {1,1},{1,-1},{-1,1}}); 
		System.out.println("4=="+result); 
	}
}

class Solution {
    public int solution(int[][] dots) { // 0.37ms ~ 1.23ms
        int answer = 0;
        int[] xArr = new int[4]; 
        int[] yArr = new int[4];
        
        for (int i = 0; i < dots.length; i++) {
        	xArr[i] = dots[i][0];
        	yArr[i] = dots[i][1];       	
		}
        Arrays.sort(xArr);
        Arrays.sort(yArr);

        answer = (xArr[0]-xArr[3])*(yArr[0]-yArr[3]);
        return answer;
        
        /* 0.02ms ~ 0.06ms
        int x = Math.max(Math.abs(dots[0][0] - dots[1][0]),Math.abs(dots[0][0] - dots[2][0]));
        int y = Math.max(Math.abs(dots[0][1] - dots[1][1]),Math.abs(dots[0][1] - dots[2][1]));
        return x*y;
        */
    }
}