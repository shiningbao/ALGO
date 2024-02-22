package ex59;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(" i    love  you");
		System.out.println(Arrays.toString(result)); // ["i", "love", "you"]

		result = sol.solution("    programmers  ");
		System.out.println(Arrays.toString(result)); // ["programmers"]
	}

}
