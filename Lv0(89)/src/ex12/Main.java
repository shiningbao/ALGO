package ex12;

public class Main {

	public static void main(String[] args) {
		
	Solution sol = new Solution();
	String result = "";
	result = sol.solution("abcdef", "f"); 
	System.out.println(result); //abcde
	result = sol.solution("BCBdbe", "B");
	System.out.println(result); //Cdbe
	}

}
