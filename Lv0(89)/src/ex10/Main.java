package ex10;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int result = 0;
		result = sol.solution(new int[] {1,2,3,4,5});
		System.out.println(result);// 20
		result = sol.solution(new int[] {0,31,24,10,1,9});
		System.out.println(result);// 744

	}

}
