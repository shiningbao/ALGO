package ex014;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		boolean result = false;
		
		result = sol.solution("pPoooyY");
		System.out.println(result);// true
		
		result = sol.solution("Pyy");
		System.out.println(result);// false
		
		result = sol.solution("abc");
		System.out.println(result);// true

	}

}
