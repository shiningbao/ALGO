package ex48;

import java.util.ArrayList;
import java.util.Arrays;

/* 2의 영역
	정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
	단, arr에 2가 없는 경우 [-1]을 return 합니다.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {1, 2, 1, 4, 5, 2, 9});
		System.out.println("[2, 1, 4, 5, 2]=="+Arrays.toString(result)); 
		
		result = sol.solution(new int[] {1, 2, 1});
		System.out.println("[2]=="+Arrays.toString(result)); 
		
		result = sol.solution(new int[] {1, 1, 1});
		System.out.println("[-1]=="+Arrays.toString(result)); 
		
		result = sol.solution(new int[] {1, 2, 1, 2, 1, 10, 2, 1});
		System.out.println("[2, 1, 2, 1, 10, 2]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(int[] arr) { // 0.36ms ~ 4.28ms
    	ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i]==2) {
        		list.add(i);
        	}
		}
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        int start = list.get(0);
        int end = list.get(list.size()-1);
  
        return Arrays.copyOfRange(arr,start,end+1);
    }
}