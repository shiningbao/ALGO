package ex37;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(3, 10);
		System.out.println(Arrays.toString(result)); // [3, 4, 5, 6, 7, 8, 9, 10]

	}

}
