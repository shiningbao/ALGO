package ex01;

import java.util.Arrays;

// 외계행성의 나이
public class Solution {

	 public String solution(int age) {
	        String answer = "";
	        String s = String.valueOf(age);
	        String[] arr = s.split("");
	        // System.out.println(Arrays.toString(arr));
	        for (int i = 0; i < arr.length; i++) {
				answer += (char)(Integer.parseInt(arr[i])+97);
			}
	        
	        return answer;
	    }
}
