package ex49;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {49, 13}, new int[] {70, 11, 2});
		System.out.println(result); //-1

		result = sol.solution(new int[] {100, 17, 84, 1}, new int[] {55, 12, 65, 36});
		System.out.println(result); //1
		
		result = sol.solution(new int[] {1, 2, 3, 4, 5}, new int[] {3, 3, 3, 3, 3});
		System.out.println(result); //0
	}

}
