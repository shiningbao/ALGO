package ex51;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution("abc", "aabcc");
		System.out.println(result);//1
		
		result = sol.solution("tbt", "tbbttb");
		System.out.println(result);//0

	}

}
