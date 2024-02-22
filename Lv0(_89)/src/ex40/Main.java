package ex40;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {1,2,3,4,5}, 3);
		System.out.println(result); //1
		
		result = sol.solution(new int[] {15, 98, 23, 2, 15}, 20);
		System.out.println(result); //0

	}

}
