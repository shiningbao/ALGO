package ex07;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int [] result = {};
		result = sol.solution(new int[] {1,2,3,4,5});
		System.out.println(Arrays.toString(result));// [2,3]
		result = sol.solution(new int[] {1,3,5,7});
		System.out.println(Arrays.toString(result));// [0,4]
	}

}
