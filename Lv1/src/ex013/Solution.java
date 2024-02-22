package ex013;

public class Solution {
	 public int solution(int n) {
	        int answer = 0;
	        
	        // 1. n 이 주어졌을 때 n 의 약수?
	        // 2. 이 약수를 어떻게 더할 것인가?
	        for (int i = 1; i <=n; i++) {
				if(n%i==0) {
					answer += i;
				}
			}
	        return answer;
	    }
    }

