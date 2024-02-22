package ex50;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {3,4,5,2,1});
		System.out.println(result);//393
		
		result = sol.solution(new int[] {5,7,8,3});
		System.out.println(result);//581

	}

}
