package ex05.sort;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] result = {};
		result = sol.solution(new int[] {1,8,3});
		System.out.println(Arrays.toString(result)); // [8,1]
		result = sol.solution(new int[] {9,10,11,8});
		System.out.println(Arrays.toString(result)); // [11,2]
		
		

	}

}
