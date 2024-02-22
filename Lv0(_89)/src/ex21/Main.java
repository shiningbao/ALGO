package ex21;

public class Main {
	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		result = sol.solution("aAb1B2cC34oOp");
		System.out.println(result); // 10
		result = sol.solution("1a2b3c4d123");
		System.out.println(result); // 16
	}

}
