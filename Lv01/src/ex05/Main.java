package ex05;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(2,3);
		System.out.println("-1=="+result);
		
		result = sol.solution(11,11);
		System.out.println("1=="+result);
		
		result = sol.solution(7,99);
		System.out.println("-1=="+result);

	}

}
