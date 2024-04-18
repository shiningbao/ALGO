package ex27;

/*	이진수 더하기
	이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("10", "11"); 
		System.out.println("101=="+result); 

		result = sol.solution("1001", "1111"); 
		System.out.println("11000=="+result); 
	}
}

class Solution {
    public String solution(String bin1, String bin2) { // 0.03ms ~ 0.05ms
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);

        return Integer.toBinaryString(num1+num2);       
    }
}