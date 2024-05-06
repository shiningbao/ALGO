package ex47;

import java.util.Arrays;

/* 	특이한 정렬
	정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 
	정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {1, 2, 3, 4, 5, 6}, 4); 
		System.out.println("[4, 5, 3, 6, 2, 1]=="+Arrays.toString(result)); 
		
		result = sol.solution(new int[] {10000, 20, 36, 47, 40, 6, 10, 7000}, 30); 
		System.out.println("[36, 40, 20, 47, 10, 6, 7000, 10000]=="+Arrays.toString(result)); 

	}
}

class Solution {
    public int[] solution(int[] numlist, int n) { // 0.35ms ~ 1.34ms
    	 Arrays.sort(numlist);
         
         for(int i=0; i<numlist.length; i++){
             for(int j=0; j<numlist.length; j++){
                 if(Math.abs(n-numlist[i])<=Math.abs(n-numlist[j])){
                     int tmp = numlist[i];
                     numlist[i] = numlist[j];
                     numlist[j] = tmp;
                 }
             }
         }
         return numlist;
    }
}