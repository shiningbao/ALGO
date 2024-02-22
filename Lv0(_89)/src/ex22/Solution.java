package ex22;

// 짝수는 싫어요 
public class Solution {
	
	 public int[] solution(int n) {
	        int[] answer = {};
	        if(n%2==0) {// 0.01ms ~ 0.02ms
	        	answer = new int[n/2];
	        }else {
	        	answer = new int[n/2+1];
	        }
	        int j = 0;
	        for (int i = 0;  i<=n; i++) {
				if(i%2!=0) {
					answer[j] = i;
					j++;
				}
			}	
	        return answer;
	    }
}
