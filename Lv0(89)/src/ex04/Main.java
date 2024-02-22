package ex04;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int result = 0;
		result = sol.solution("ab6CDE443fgh22iJKlmn1o", "6CD");
		System.out.println(result);
		result = sol.solution("ppprrrogrammers", "pppp");
		System.out.println(result);
		result = sol.solution("AbcAbcA", "AAA");
		System.out.println(result);
		

	}

}
