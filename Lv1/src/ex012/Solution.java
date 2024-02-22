package ex012;

public class Solution {
	 public int solution(int n) {
	        int answer = 0;
	       /* for (int i = 1; i <=n; i++) {
				if(n%i==1) {
					answer = i;
				}
			}*/
	        int i=1;
	        while(true) {
	        	if(n%i==1) {
	        		answer = i;
	        		break;
	        	}
	        	i++;
	        }
	     
	        return answer;
	    }
}

