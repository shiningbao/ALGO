package ex46;
// 배열 만들기1
public class Solution {

	 public int[] solution(int n, int k) {
	        int[] answer = new int[n/k];
	        int it = 0;
	        for (int i = 1; i <= n; i++) {
				if(i%k==0) {
					answer[it] = i;
					it++;
				}
			}
			
	        return answer;
	    }
}
