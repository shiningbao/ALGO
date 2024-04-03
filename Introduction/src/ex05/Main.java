package ex05;

import java.util.Arrays;

/*	최댓값 만들기(2)
	정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[]{1, 2, -3, 4, -5}); 
		System.out.println("15=="+result); 
		
		result = sol.solution(new int[]{0, -31, 24, 10, 1, 9}); 
		System.out.println("240=="+result); 
		
		result = sol.solution(new int[]{10, 20, 30, 5, 5, 20, 5}); 
		System.out.println("600=="+result); 
	}
}

class Solution {
    public int solution(int[] numbers) { // 0.38ms ~ 0.58ms
        int answer = 0;
        int n = numbers.length;
        
        Arrays.sort(numbers);
        answer = Math.max(numbers[n - 1] * numbers[n - 2], numbers[0] * numbers[1]);
        
        return answer;
    }
}