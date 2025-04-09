package ex46;

import java.util.Arrays;

public class Main { 

	public static void main(String[] args) {
		String[] result = {};
		Solution sol = new Solution();
	
		result = sol.solution(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10}); 
		System.out.println("[\"######\", \"### #\", \"## ##\", \" #### \", \" #####\", \"### # \"]=="+Arrays.toString(result));
	}
	
}

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) { // 1.88ms ~ 3.40ms
        String[] answer = new String[n];
        
        for (int i = 0; i < arr1.length; i++) {
        	// String binaryNum = Integer.parseInt(Integer.toBinaryString(arr1[i]))+Integer.parseInt(Integer.toBinaryString(arr2[i]))+"";
        	String binaryNum = Integer.toBinaryString(arr1[i] | arr2[i]); // 비트 연산자 OR
        	
        	while(binaryNum.length() < n) {
        		binaryNum = "0" +binaryNum;
        	}
        	
        	answer[i] = "";
        	for (int j = 0; j < binaryNum.length(); j++) {
				if(binaryNum.charAt(j) == '0') {
					answer[i] += " "; 
				} else {
					answer[i] += "#";
				}
			}
        	
		}
        return answer;
    }

}