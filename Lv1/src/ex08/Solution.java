package ex08;

public class Solution {

	public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
	
			if(i%7==0) {
				answer=i/7;
			}else {
				answer=i/7+1;
			}
		}
        return answer;
    }
}
