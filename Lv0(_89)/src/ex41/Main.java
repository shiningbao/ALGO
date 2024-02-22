package ex41;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[]result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {4, 2, 6, 1, 7, 6}, 2);
		System.out.println(Arrays.toString(result)); // [4,6,7]
		
		result = sol.solution(new int[] {4, 2, 6, 1, 7, 6}, 4);
		System.out.println(Arrays.toString(result)); // [4,7]
	}

}
