package ex25;

/*	간단한 식 계산하기
	문자열 binomial이 매개변수로 주어집니다. binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다. 
	주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		result = sol.solution("43 + 12");
		System.out.println("55=="+result);
		
		result = sol.solution("0 - 7777");
		System.out.println("-7777=="+result);
		
		result = sol.solution("40000 * 40000");
		System.out.println("160000000=="+result);
	}
}

class Solution {
    public int solution(String binomial) { // 0.08ms ~ 0.17ms
    	String[] parts = binomial.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        char op = parts[1].charAt(0);
        
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                return 0;
        }
    }
}