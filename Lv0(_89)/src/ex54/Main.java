package ex54;

public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("programmers", "p");
		System.out.println(result); // "Programmers"
		
		result = sol.solution("lowercase", "x");
		System.out.println(result); // "lowercase"

	}

}
