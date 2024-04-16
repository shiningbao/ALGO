package ex22;

import java.util.Arrays;

/*	가까운 수
	정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {3, 10, 28}, 20); 
		System.out.println("28=="+result); 
		
		result = sol.solution(new int[] {10, 11, 12}, 13); 
		System.out.println("12=="+result); 

	}
}

class Solution {
    public int solution(int[] array, int n) { // 0.33ms ~ 0.55ms
        int answer = 0;
        Arrays.sort(array);
        
        for(int i = 1 ; i < array.length ; i++){
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
                array[0] = array[i];
            }
        }
        answer = array[0];

        return answer;
    }
}