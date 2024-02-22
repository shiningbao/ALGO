package ex09;

// 홀짝에 따라 다른 값 반환하기
// 양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		result = sol.solution(7);
		System.out.println("16=="+result); 		
		
		result = sol.solution(10);
		System.out.println("220=="+result); 		
	}

}

class Solution {
	public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
			if(n%2!=0 && i%2!=0) {
				answer += i;
			}else if(n%2==0 && i%2==0) {
				answer += i*i;
			}
		}
        return answer;
    }
}
