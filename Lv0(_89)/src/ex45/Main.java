package ex45;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new String[] {"AAA","BBB","CCC","DDD"});
		System.out.println(Arrays.toString(result)); // ["aaa","BBB","ccc","DDD"]

	}

}
