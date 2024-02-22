package ex27;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] result = {};
		
		result = sol.solution(new int[] {12, 4, 15, 46, 38, 1, 14, 56, 32, 10});
		System.out.println(Arrays.toString(result)); // [15, 32, 38, 46, 56]
	}

}
