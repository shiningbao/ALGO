package ex47;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {2,1,6});
		System.out.println(Arrays.toString(result)); //[2,1,6,5]
		
		result = sol.solution(new int[] {5,2,1,7,5});
		System.out.println(Arrays.toString(result)); //[5,2,1,7,5,10]

	}

}
