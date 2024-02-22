package ex22;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		result = sol.solution(10);
		System.out.println(Arrays.toString(result)); // [1, 3, 5, 7, 9]
		result = sol.solution(15);
		System.out.println(Arrays.toString(result)); // [1, 3, 5, 7, 9, 11, 13, 15]
	}

}
