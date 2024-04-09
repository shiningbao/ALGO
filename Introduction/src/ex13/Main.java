package ex13;

/*	합성수 찾기
	약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(10); 
		System.out.println("5=="+result); 
		
		result = sol.solution(15); 
		System.out.println("8=="+result); 
	}
}

class Solution {
    public int solution(int n) { // 0.01ms ~ 0.12ms
        int answer = 0;
      
        for (int i = 1; i <= n; i++) {
        	int cnt = 0;
			for (int j = 1; j <= i; j++) {
				cnt += (i%j==0) ? 1 : 0;
			}
			answer += (cnt>=3) ? 1 : 0;
        }

  return answer;
}
}