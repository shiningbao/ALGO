package ex31;

/*	세로 읽기
	문자열 my_string과 두 정수 m, c가 주어집니다. 
	my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("ihrhbakrfpndopljhygc",4,2);
		System.out.println("happy=="+result);
		
		result = sol.solution("programmers",1,1);
		System.out.println("programmers=="+result); 
	}
}

class Solution {
    public String solution(String my_string, int m, int c) { // 9.08ms ~ 14.58ms
        String answer = "";
        for (int i = 0; i < my_string.length(); i+=m) {
        	answer += my_string.charAt(i+c-1);
        }
        return answer;
        
        /* 0.04ms ~ 0.15ms
	    StringBuilder sb = new StringBuilder();
	
	    for (int i = c - 1; i < my_string.length(); i += m)
	    	sb.append(my_string.charAt(i));
	
	    return sb.toString();
         */
    }
}
