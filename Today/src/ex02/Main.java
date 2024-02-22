package ex02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(3, new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12});
		System.out.println(Arrays.toString(result)); // [6,9,2]

	}

}
