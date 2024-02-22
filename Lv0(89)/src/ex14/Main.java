package ex14;

public class Main {

	public static void main(String[] args) {
		
	Solution sol = new Solution();
	int result = 0;
	result = sol.solution(new int[]{1,1,2,3,4,5},1); 
	System.out.println(result); //2
	result = sol.solution(new int[]{0,2,3,4},1);
	System.out.println(result); //0
	}

}
