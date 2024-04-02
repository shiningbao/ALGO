package ex45;

/* 간단한 논리 연산
	boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
	(x1 ∨ x2) ∧ (x3 ∨ x4)
*/
public class Main {

	public static void main(String[] args) {
		boolean result = true;
		Solution sol = new Solution();
		
		result = sol.solution(false,	true,	true,	true);
		System.out.println("true=="+result); 
		
		result = sol.solution(true, false,	 false, false);
		System.out.println("false=="+result); 
	}
}

class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) { // 0.01ms ~ 0.03ms
        return (x1||x2)&&(x3||x4);
    }
}