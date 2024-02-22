package ex42;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String result = "";
		
		result = sol.solution("aBcDeFg");
		System.out.println(result); // "abcdefg"
		
		result = sol.solution("aaa");
		System.out.println(result); // "aaa"

	}

}
