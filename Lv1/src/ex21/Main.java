package ex21;

/* 	내적
	길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.

	이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
*/
public class Main {

	public static void main(String[] args) {
		int result = 1234567890;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {1, 2, 3, 4}, new int[] {-3, -1, 0, 2}); 
		System.out.println("3=="+result); 
		
		result = sol.solution(new int[] {-1, 0, 1}, new int[] {1, 0, -1}); 
		System.out.println("-2=="+result); 
	}
}

class Solution {
    public int solution(int[] a, int[] b) { // 0.01ms ~ 0.05ms
        int answer = 0;
        
        for (int i = 0; i < a.length; i++) {
			answer += a[i] * b[i];
		}
        return answer;
    }
}