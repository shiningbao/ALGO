package ex38;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {1, 2, 3, 100, 99, 98});
		System.out.println(Arrays.toString(result)); // [2, 2, 6, 50, 99, 49]

	}

}
