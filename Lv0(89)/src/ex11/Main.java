package ex11;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int result = 0;
		result = sol.solution(150000);
		System.out.println(result); // 142,500
		result = sol.solution(580000);
		System.out.println(result); // 464,000
		result = sol.solution(10);
		System.out.println(result);
	}

}
