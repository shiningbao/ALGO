package ex56;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new String[] {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"});
		System.out.println(Arrays.toString(result)); // ["nami", "vex"]

	}

}
