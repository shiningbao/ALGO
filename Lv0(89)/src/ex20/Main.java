package ex20;

public class Main {
	//[1, 2, 7, 10, 11]	7/ [9, -1, 0]	0
	public static void main(String[] args) {
		Solution sol = new Solution();
		int result  = 0;
		result = sol.solution(new int[] {1,2,7,10,11});
		System.out.println(result); // 7
		result = sol.solution(new int[] {9,-1,0});
		System.out.println(result); // 0
		
		

	}

}
