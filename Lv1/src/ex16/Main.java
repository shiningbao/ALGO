package ex16;

/* 	없는 숫자 더하기
	0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
	numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {1, 2, 3, 4, 6, 7, 8, 0}); 
		System.out.println("14=="+result); 
		
		result = sol.solution(new int[] {5, 8, 4, 0, 6, 7, 9}); 
		System.out.println("6=="+result); 
	}
}

class Solution {
    public int solution(int[] numbers) { // 0.01ms ~ 0.02ms
        int answer = -1;
   
        for (int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
		}
        return 44 - answer;
    }
}