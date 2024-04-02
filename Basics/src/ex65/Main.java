package ex65;

/* 문자열 겹쳐쓰기
	문자열 my_string, overwrite_string과 정수 s가 주어집니다. 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
	문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("He11oWor1d", "lloWorl", 2); 
		System.out.println("HelloWorld=="+result); 
		
		result = sol.solution("Program29b8UYP", "merS123", 7); 
		System.out.println("ProgrammerS123=="+result); 
	}
}

class Solution {
    public String solution(String my_string, String overwrite_string, int s) { // 0.03ms ~ 0.13ms
    	StringBuilder answer = new StringBuilder(my_string);
        answer.replace(s, s + overwrite_string.length(), overwrite_string);
        return answer.toString();
    }
}