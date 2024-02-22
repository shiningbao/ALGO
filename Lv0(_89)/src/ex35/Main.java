package ex35;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution("AbCdEfG", "aBc");
		System.out.println(result); //1
		
		result = sol.solution("aaAA", "aaaaa");
		System.out.println(result); //0

	}

}
