package ex58;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(0, "wsdawsdassw");
		System.out.println(result); //-1
		
		result = sol.solution(2, "wsdawsda");
		System.out.println(result); //2
		
	}

}
