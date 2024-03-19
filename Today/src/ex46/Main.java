package ex46;

import java.util.Arrays;

/* 배열의 길이를 2의 거듭제곱으로 만들기
	정수 배열 arr이 매개변수로 주어집니다. 
	arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다. arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {1, 2, 3, 4, 5, 6});
		System.out.println("[1, 2, 3, 4, 5, 6, 0, 0]=="+Arrays.toString(result)); 
		
		result = sol.solution(new int[] {58, 172, 746, 89});
		System.out.println("[58, 172, 746, 89]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(int[] arr) { // 0.01ms ~ 0.07ms
         int pow = 1;
         
         while (pow < arr.length) {
             pow *= 2;
         }

         if (pow == arr.length) {
             return arr;
         }
         
         int[] answer = new int[pow];
         
         for (int i = 0; i < arr.length; i++) {
        	 answer[i] = arr[i];
         }

         for (int i = arr.length; i < pow; i++) {
        	 answer[i] = 0;
         }
         
         /* 0.01ms ~ 0.05ms
	        int pow = 1;
	
	        while (pow < arr.length) {
	            pow *= 2;
	        }
	
	        return Arrays.copyOf(arr, pow); Arrays.copyOf(원본 배열, 원본 배열에서 복사하고 싶은 요소들의 길이)
          */
         return answer;
    }
}