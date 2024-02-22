package ex05.sort;


import java.util.Arrays;


public class Solution {

	 public int[] solution(int[] array) {
	        int[] answer = {};
	        
	        answer = Arrays.copyOf(array, array.length);
	        Arrays.sort(answer);
	        answer[0] = answer[answer.length-1];
	        for (int i = 0; i < array.length; i++) {
				if(array[i]==answer[0]) {
					answer[1]=i;
				}
			}
	    
	       answer = Arrays.copyOfRange(answer, 0, 2);
	        
	        return answer;
	    }
}
