package ex55;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {49, 12, 100, 276, 33}, 27);
		System.out.println(Arrays.toString(result));// [76, 12, 127, 276, 60]
				
		result = sol.solution(new int[] {444, 555, 666, 777}, 100);
		System.out.println(Arrays.toString(result));// [444, 655, 666, 877]
	}

}
