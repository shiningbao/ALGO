package ex08;

import java.util.Arrays;

/*	배열 회전시키기
	정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 
	배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {1, 2, 3}, "right"); 
		System.out.println("[3, 1, 2]=="+Arrays.toString(result)); 
		
		result = sol.solution(new int[] {4, 455, 6, 4, -1, 45, 6}, "left"); 
		System.out.println("[455, 6, 4, -1, 45, 6, 4]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(int[] numbers, String direction) { // 0.01ms ~ 0.03ms
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")) {
        	answer[0] = numbers[numbers.length-1];
        	// System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        	// src : 원본 배열
        	// srcPos : 원본 배열에서 복사할 항목의 시작 인덱스
        	// dest : 새 배열
        	// destPos : 새 배열에서 붙여넣을 시작 인덱스
        	// length : 복사할 개수
        	System.arraycopy(numbers, 0, answer, 1, numbers.length-1); 
        }else {
        	answer[numbers.length-1] = numbers[0];
        	System.arraycopy(numbers, 1, answer, 0, numbers.length-1);
        }
        
        return answer;
    }
}