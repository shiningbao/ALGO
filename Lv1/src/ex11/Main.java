package ex11;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int [] result = {};
		result = sol.solution(new int[] {1,2,3,4,5},1,3);
		System.out.println("[2,3,4]=="+Arrays.toString(result));

	}

}
