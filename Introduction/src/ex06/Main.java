package ex06;

/*	인덱스 바꾸기
	문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, 
	my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("hello", 1, 2); 
		System.out.println("hlelo=="+result); 
		
		result = sol.solution("I love you", 3, 6); 
		System.out.println("I l veoyou=="+result); 
	}
}

class Solution {
    public String solution(String my_string, int num1, int num2) { // 0.03ms ~ 0.07ms
    	 StringBuilder sb = new StringBuilder(my_string);
    	 
         char temp = sb.charAt(num1);
         sb.setCharAt(num1, sb.charAt(num2));
         sb.setCharAt(num2, temp);
        
        return sb.toString();
    }
}