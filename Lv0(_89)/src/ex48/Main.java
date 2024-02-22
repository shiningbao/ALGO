package ex48;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int result = 0;
		
		result = sol.solution("ABBAA", "AABB");
		System.out.println(result); // 1

		result = sol.solution("ABAB", "ABAB");
		System.out.println(result); // 0
	}

}
