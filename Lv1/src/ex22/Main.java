package ex22;

/* 	약수의 개수와 덧셈
	두 정수 left와 right가 매개변수로 주어집니다. 
	left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(13, 17); 
		System.out.println("43=="+result); 
		
		result = sol.solution(24, 27); 
		System.out.println("52=="+result); 
	}
}

class Solution {
    public int solution(int left, int right) { // 0.43ms ~ 7.48ms
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
        	int count = 0;
			for (int j = 1; j <= i; j++) {
				if(i%j != 0) {
					continue;
				}else {
					count++;					
				}
			}
			
			if(count%2 == 0) {
				answer += i;
			}else {
				answer -= i;
			}
		
		}
        
        return answer;
        
        /* 0.03ms ~ 0.11ms
        	for (int i=left; i<=right; i++) {
            // 제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            // 제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }
        */
    }
}