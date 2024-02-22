package ex03;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int result = 0;
		result = sol.solution(2, 10);
		System.out.println("2048=="+result);
		
		result = sol.solution(7, 15);
		System.out.println("229376=="+result);

	}
}
class Solution {
	    public int solution(int n, int t) {
	        int answer = 0;
	        answer = (int) (n*Math.pow(2, t));
	        return answer;
	}
}
