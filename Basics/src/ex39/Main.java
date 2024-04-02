package ex39;

/*	문자열 뒤집기
	문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("Progra21Sremm3", 6, 12);
		System.out.println("ProgrammerS123=="+result); 
		
		result = sol.solution("Stanley1yelnatS", 4, 10);
		System.out.println("Stanley1yelnatS=="+result); 
	}
}

class Solution {
    public String solution(String my_string, int s, int e) { // 
		/* 14.12ms ~ 21.61ms
		 * String answer = "";
		 * 
		 * for (int i = e; i >= s; i--) { answer += my_string.charAt(i); }
		 * 
		 * return my_string.substring(0,s)+answer+my_string.substring(e+1);
		 */
    	
    	StringBuilder sb = new StringBuilder(); // 9.56ms ~ 20.78ms
        
        for (int i = e; i >= s; i--) {
            sb.append(my_string.charAt(i));
        }
        
        return my_string.substring(0,s)+sb.toString()+my_string.substring(e+1);
    }
}