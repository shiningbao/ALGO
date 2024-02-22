package ex10;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] result = {};
		result = sol.solution(new int[]{1,2,3,4,5});
		System.out.println("[5,4,3,2,1]=="+Arrays.toString(result));
	}

}
