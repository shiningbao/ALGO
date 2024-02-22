package ex30;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] result = {};
		
		result = sol.solution(new int[] {1, 2, 3, 100, 99, 98}, 3);
		System.out.println(Arrays.toString(result)); // [3, 6, 9, 300, 297, 294]
		
		result = sol.solution(new int[] {1, 2, 3, 100, 99, 98}, 2);
		System.out.println(Arrays.toString(result)); // [3, 4, 5, 102, 101, 100]

	}

}
