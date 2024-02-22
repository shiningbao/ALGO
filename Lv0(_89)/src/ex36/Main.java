package ex36;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {12, 4, 15, 46, 38, -2, 15});
		System.out.println(result); //5
		
		result = sol.solution(new int[] {13, 22, 53, 24, 15, 6});
		System.out.println(result); //-1
	}

}
