package ex17;

import java.util.Arrays;

/* 	제일 작은 수 제거하기
	정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
	단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {4, 3, 2, 1}); 
		System.out.println("[4, 3, 2]=="+Arrays.toString(result)); 
		
		result = sol.solution(new int[] {10}); 
		System.out.println("[-1]=="+Arrays.toString(result)); 
		
		result = sol.solution(new int[] {4, 1, 2, 5}); 
		System.out.println("[4, 2, 5]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(int[] arr) { // 0.03ms ~ 3.77ms
        int[] answer = new int[arr.length-1];  
        int min = arr[0];
        
        for(int i=0; i<arr.length; i++){
            min = Math.min(min,arr[i]);
        }
        
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i] == min){
                continue;
            }else{
            	answer[idx++] = arr[i];
            }
		}
        
        if(arr.length == 1) {
        	answer = new int[1];
        	answer[0] = -1;
        }

        return answer;
    }
}