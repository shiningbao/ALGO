package ex09;

public class Solution {
	
    public int solution(int n) {
        int answer = 0;
        
        // 1. 1~n 까지 가져오기
        for (int i = 1; i <= n; i++) {
			// 2. 짝수 찾아내기
			if(i%2==0) {
				//System.out.println(i);			
				answer += i;
			}
			//answer = i%2==0 ? answer += i : answer;
		}
        
        return answer;
    }

}
