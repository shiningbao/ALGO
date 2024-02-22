package ex09;

import java.util.stream.IntStream;

public class Solution {

	 public double solution(int[] numbers) {
	        double answer = 0;
	        for (int i = 0; i < numbers.length; i++) {
				answer += numbers[i];
			}
	        System.out.println(answer/numbers.length);
	       
	        return answer/numbers.length;
	    }
}
