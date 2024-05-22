package ex23;

import java.util.Arrays;
import java.util.Collections;

/* 	문자열 내림차순으로 배치하기
	문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
	s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("Zbcdefg"); 
		System.out.println("gfedcbZ=="+result); 
	}
}

class Solution {
    public String solution(String s) { // 0.37ms ~ 4.09ms
        StringBuilder answer = new StringBuilder();     
        String[] sArr = s.split("");
        
        Arrays.sort(sArr, Collections.reverseOrder());
        
        for (int i = 0; i < sArr.length; i++) {
			answer.append(sArr[i]);
		}
        
        return answer.toString();
    }
}