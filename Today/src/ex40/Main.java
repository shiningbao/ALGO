package ex40;

/*	특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
	문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("AbCdEFadEG", "dE");
		System.out.println("AbCdEFadE=="+result); 
		
		result = sol.solution("AAAAaaaa", "a");
		System.out.println("AAAAaaaa=="+result); 
	}
}

class Solution {
    public String solution(String myString, String pat) { // 0.02ms ~ 0.11ms
        String answer = "";
        
        for (int i = 0; i < myString.length(); i++) {
            for (int j = i + 1; j <= myString.length(); j++) {
                String subStr = myString.substring(i, j); // 부분 문자열 추출
                if (subStr.endsWith(pat)) { // 부분 문자열이 패턴으로 끝나는지 확인
                    if (subStr.length() > answer.length()) { // 현재 찾은 부분 문자열이 이전에 찾은 것보다 길면 갱신
                        answer = subStr;
                    }
                }
            }
        }
        
        /*	1.21ms ~ 1.56ms
          	int idx = myString.lastIndexOf(pat);
			
        	answer = myString.substring(0, idx) + pat;
         */
        
        return answer;
    }
}