package ex02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int [] result;
		result = sol.solution(new String[] {"We","are","the","world!"});
		System.out.println(Arrays.toString(result));
		result = sol.solution(new String[] {"I","Love","Programmers."});
		System.out.println(Arrays.toString(result));
		
	}

}
