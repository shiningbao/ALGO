package ex23;
// 제곱수 판별하기
public class Solution {
	
	 public int solution(int n) {
	        int answer = 0;
	        if(Math.sqrt(n)%1==0) {// 0.02ms ~ 0.04ms
	        	answer = 1;
	        }else {
	        	answer = 2;
	        }
	        return answer;
	    }
}
