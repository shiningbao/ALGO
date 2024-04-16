package ex24;

import java.util.Arrays;

/*	한 번만 등장한 문자
	머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {7, 77, 17}); 
		System.out.println("4=="+result); 

		result = sol.solution(new int[] {10, 29}); 
		System.out.println("0=="+result); 

	}
}

class Solution {
    public int solution(int[] array) { // 0.02ms ~ 0.05ms
        int answer = 0;
        
       for (int i = 0; i < array.length; i++) {
    	   String str = Integer.toString(array[i]);
    	   for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j)=='7') {
					answer++;
				}
			}
       }
		
        return answer;
    }
}