package ex19;

/* 	가운데 글자 가져오기
	단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("abcde"); 
		System.out.println("c=="+result); 
		
		result = sol.solution("qwer"); 
		System.out.println("we=="+result); 
	}
}

class Solution {
    public String solution(String s) { // 13.90ms ~ 42.29ms
        String answer = "";
        
        if(s.length()%2 == 0) {
        	answer += s.charAt(s.length()/2-1);
        	answer += s.charAt(s.length()/2);
        }else {
        	answer += s.charAt(s.length()/2);
        }
        return answer;
        
        /* 0.01ms ~ 0.03ms
        	return s.substring((s.length()-1)/2, s.length()/2 + 1);
        */
    }
}