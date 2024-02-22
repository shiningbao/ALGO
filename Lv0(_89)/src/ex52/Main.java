package ex52;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution("banana", "ban");
		System.out.println(result);//1
		
		result = sol.solution("banana", "nan");
		System.out.println(result);//0
		
		result = sol.solution("banana", "abcd");
		System.out.println(result);//0
		
		result = sol.solution("banana", "bananan");
		System.out.println(result);//0

	}

}
