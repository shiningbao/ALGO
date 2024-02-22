package ex46;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[]result = {};
		Solution sol = new Solution();
		
		result = sol.solution(10, 3);
		System.out.println(Arrays.toString(result)); // [3,6,9]
		
		result = sol.solution(15, 5);
		System.out.println(Arrays.toString(result)); // [5,10,15]
	}

}
