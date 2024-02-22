package ex09;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int result = 0;
		result = sol.solution(new int[]{149,180,192,170},167);
		System.out.println(result);// 3
		result = sol.solution(new int[]{180,120,140},190);
		System.out.println(result);// 0

	}

}
