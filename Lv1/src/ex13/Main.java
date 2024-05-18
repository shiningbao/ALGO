package ex13;

/* 	평균 구하기
	정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
*/
public class Main {

	public static void main(String[] args) {
		double result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {1, 2, 3, 4}); 
		System.out.println("2.5=="+result); 
		
		result = sol.solution(new int[] {5, 5}); 
		System.out.println("5=="+result); 
	}
}

class Solution {
    public double solution(int[] arr) { // 0.02ms ~ 0.06ms
        double answer = 0;
        double sum = 0;
                
        for (int i = 0; i < arr.length; i++) {
        	sum += arr[i];
		}
        answer = sum/arr.length;
        return answer;
    }
}