package ex03.copy;
import java.util.Arrays;
public class Test {

	public static void main(String[] args) {
	
		Solution sol = new Solution();
		int[] result = {};
		
		result = sol.solution(new int[] {1,2,3,4,5}, 1,3);
		System.out.println("[2,3,4]=="+Arrays.toString(result));
		
		result = sol.solution(new int[] {1,3,5}, 1,2);
		System.out.println("[3,5]=="+Arrays.toString(result));

	}

}
