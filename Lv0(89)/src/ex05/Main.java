package ex05;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int [] result = {};
		result = sol.solution(new int[] {1,2,3,4,5});
		System.out.println(Arrays.toString(result));
		result = sol.solution(new int[] {1,2,100,-99,1,2,3});
		System.out.println(Arrays.toString(result));
		

	}

}
