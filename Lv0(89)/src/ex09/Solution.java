package ex09;
// 머쓱이보다 키 큰 사람
public class Solution {
	
	 public int solution(int[] array, int height) {
	        int answer = 0;
	        for (int i : array) {
				if(i>height) {
					answer++;
				}
			}
	        return answer;
	    }
}
