package ex01;

public class Main {

	public static void main(String[] args) {
		String result ="";
		Solution sol = new Solution();
		
		result = sol.solution(23);
		System.out.println(result); // "cd"
		
		result = sol.solution(51);
		System.out.println(result); // "fb"
		
		result = sol.solution(100);
		System.out.println(result); // "baa"

	}

}
