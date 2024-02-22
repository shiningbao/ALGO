package ex28;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {34, 5, 71, 29, 100, 34}, 123);
		System.out.println(result); //139
		
		result = sol.solution(new int[] {58, 44, 27, 10, 100}, 139);
		System.out.println(result); //239

	}

}
