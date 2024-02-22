package ex09;

public class Main {

	public static void main(String[] args) {
		double result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {1,2,3,4,5,6,7,8,9,10});
		result = sol.solution(new int[] {89,90,91,92,93,94,95,96,97,98,99});
		
	
		System.out.println("5.5=="+result);
		System.out.println("94.0=="+result);

}
}