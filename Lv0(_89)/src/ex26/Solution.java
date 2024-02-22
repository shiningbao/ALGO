package ex26;
// n의 배수
public class Solution {

	 public int solution(int num, int n) {
	        int answer = 0;
	        
	        answer = num%n==0 ? 1:0;
	        
	        return answer;
	    }
}
