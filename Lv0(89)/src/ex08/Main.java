package ex08;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		String result = "";
		
		result = sol.solution("jaron");//"noraj"
		System.out.println(result);
		result = sol.solution("bread");//"daerb"
		System.out.println(result); // 0->4, 1->3, 2->2
	}

}
