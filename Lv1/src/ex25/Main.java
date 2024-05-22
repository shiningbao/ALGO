package ex25;

/* 	문자열 다루기 기본
	문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
	예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
*/
public class Main {

	public static void main(String[] args) {
		boolean result = true;
		Solution sol = new Solution();
	
		result = sol.solution("a234"); 
		System.out.println("false=="+result);
		
		result = sol.solution("1234"); 
		System.out.println("true=="+result);
	}
}

class Solution {
    public boolean solution(String s) { // 0.02ms ~ 0.12ms
        boolean answer = true;
        String regExp = "^[0-9]+$";
        
        return answer = (s.length() == 4 || s.length() == 6) && s.matches(regExp) ? answer : false;
    }
}