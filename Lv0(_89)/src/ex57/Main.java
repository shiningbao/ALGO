package ex57;

public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("abstract algebra");
		System.out.println(result); //"AbstrAct AlgebrA"
		
		result = sol.solution("PrOgRaMmErS");
		System.out.println(result); //"progrAmmers"
	}

}
