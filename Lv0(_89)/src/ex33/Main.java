package ex33;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1});
		System.out.println(result); //51
		
		result = sol.solution(new int[] {2,3,4,5});
		System.out.println(result); //120

	}

}
