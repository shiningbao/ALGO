package ex21;

import java.util.Arrays;

// 숨어있는 숫자의 덧셈 (1)
public class Solution {
	
	 public int solution(String my_string) {
	        int answer = 0;
	    char[] arr = my_string.toCharArray();
	    System.out.println(Arrays.toString(arr));
	    for (int i = 0; i < arr.length; i++) { // 0.18ms ~ 0.29ms
			if(arr[i]>=49&&arr[i]<=57) {
				answer += arr[i]-48;
			}
		}
	  


	        return answer;
}
}
